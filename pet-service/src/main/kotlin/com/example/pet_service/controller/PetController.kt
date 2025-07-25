package com.example.pet_service.controller

import com.example.pet_service.dto.PetDto
import com.example.pet_service.service.PetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pets")
class PetController(private val service: PetService) {

    @GetMapping
    fun getAll(): List<PetDto> = service.getAll()

    @PostMapping
    fun create(@RequestBody dto: PetDto): PetDto = service.create(dto)
}
