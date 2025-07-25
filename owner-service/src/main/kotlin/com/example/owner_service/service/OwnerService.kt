package com.example.owner_service.service

import com.example.owner_service.client.PetFeignClient
import com.example.owner_service.dto.OwnerDTO
import com.example.owner_service.dto.OwnerWithPetsDTO
import com.example.owner_service.dto.PetDTO
import com.example.owner_service.mapper.OwnerMapper
import com.example.owner_service.repository.OwnerRepository
import org.springframework.stereotype.Service

@Service
class OwnerService(
    private val repository: OwnerRepository,
    private val petFeignClient: PetFeignClient) {

    fun getAll(): List<OwnerDTO> =
        repository.findAll().map { OwnerMapper.toDTO(it) }

    fun create(dto: OwnerDTO): OwnerDTO {
        val entity = OwnerMapper.toEntity(dto)
        val saved = repository.save(entity)
        return OwnerMapper.toDTO(saved)
    }
    fun getOwnersWithPets(): List<OwnerWithPetsDTO> {
        val owners = repository.findAll()
        val pets = petFeignClient.getAllPets()

        return owners.map { owner ->
            val ownerPets: List<PetDTO> = pets.filter { pet -> pet.ownerId == owner.id }
            OwnerWithPetsDTO(
                id = owner.id,
                name = owner.name,
                phone = owner.phone,
                pets = ownerPets
            )
        }
    }


}