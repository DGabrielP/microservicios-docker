package com.example.pet_service.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "pets")
data class PetEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,

    val breed: String,

    val age: Int,

    val gender: String,

    val profileImageUrl: String,

    val noseImageUrl: String,

    val ownerId: Long
)

