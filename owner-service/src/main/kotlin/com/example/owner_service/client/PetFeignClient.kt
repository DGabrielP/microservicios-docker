package com.example.owner_service.client

import com.example.owner_service.dto.PetDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "pet-service")
interface PetFeignClient {
    @GetMapping("/pets")
    fun getAllPets(): List<PetDTO>
}