package com.example.owner_service.dto

data class PetDTO(
    val id: Long? = null,
    val name: String,
    val breed: String,
    val age: Int,
    val gender: String,
    val profileImageUrl: String,
    val noseImageUrl: String,
    val ownerId: Long
)