package com.example.owner_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class OwnerServiceApplication

fun main(args: Array<String>) {
	runApplication<OwnerServiceApplication>(*args)
}
