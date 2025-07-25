package com.example.owner_service.controller

import com.example.owner_service.dto.OwnerDTO
import com.example.owner_service.dto.OwnerWithPetsDTO
import com.example.owner_service.service.OwnerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/owners")
class OwnerController(private val service: OwnerService) {

    @GetMapping
    fun getAll(): List<OwnerDTO> = service.getAll()

    @PostMapping
    fun create(@RequestBody dto: OwnerDTO): OwnerDTO = service.create(dto)

    @GetMapping("/with-pets")
    fun getOwnersWithPets(): List<OwnerWithPetsDTO> {
        return service.getOwnersWithPets()
    }

}