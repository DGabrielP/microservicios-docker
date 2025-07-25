package com.example.pet_service.mapper

import com.example.pet_service.dto.PetDto
import com.example.pet_service.entity.PetEntity

object PetMapper {
    fun toDto(entity: PetEntity) = PetDto(
        id = entity.id,
        name = entity.name,
        breed = entity.breed,
        age = entity.age,
        gender = entity.gender,
        profileImageUrl = entity.profileImageUrl,
        noseImageUrl = entity.noseImageUrl,
        ownerId = entity.ownerId
    )

    fun toEntity(dto: PetDto) = PetEntity(
        id = dto.id,
        name = dto.name,
        breed = dto.breed,
        age = dto.age,
        gender = dto.gender,
        profileImageUrl = dto.profileImageUrl,
        noseImageUrl = dto.noseImageUrl,
        ownerId = dto.ownerId
    )
}