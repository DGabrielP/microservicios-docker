package com.example.owner_service.mapper

import com.example.owner_service.dto.OwnerDTO
import com.example.owner_service.entity.OwnerEntity

object OwnerMapper {
    fun toDTO(entity: OwnerEntity) = OwnerDTO(
        id = entity.id,
        name = entity.name,
        phone = entity.phone
    )

    fun toEntity(dto: OwnerDTO) = OwnerEntity(
        id = dto.id,
        name = dto.name,
        phone = dto.phone
    )
}