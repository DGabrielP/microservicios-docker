package com.example.pet_service.service

import com.example.pet_service.dto.PetDto
import com.example.pet_service.mapper.PetMapper
import com.example.pet_service.repository.PetRepository
import org.springframework.stereotype.Service

@Service
class PetService(private val repository: PetRepository) {

    fun getAll(): List<PetDto> =
        repository.findAll().map { PetMapper.toDto(it) }

    fun create(dto: PetDto): PetDto {
        val entity = PetMapper.toEntity(dto)
        val saved = repository.save(entity)
        return PetMapper.toDto(saved)
    }
}