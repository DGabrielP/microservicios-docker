package com.example.owner_service.dto

data class OwnerWithPetsDTO(
    val id: Long?,
    val name: String,
    val phone: String,
    val pets: List<PetDTO>
)