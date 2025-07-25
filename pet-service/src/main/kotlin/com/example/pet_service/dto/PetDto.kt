package com.example.pet_service.dto

data class PetDto(
    val id: Long? = null,
    val name: String,
    val breed: String,
    val age: Int,
    val gender: String,
    val profileImageUrl: String,
    val noseImageUrl: String,
    val ownerId: Long
)
