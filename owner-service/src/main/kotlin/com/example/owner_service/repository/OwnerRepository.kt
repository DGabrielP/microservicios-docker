package com.example.owner_service.repository

import com.example.owner_service.entity.OwnerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface OwnerRepository : JpaRepository<OwnerEntity, Long>
