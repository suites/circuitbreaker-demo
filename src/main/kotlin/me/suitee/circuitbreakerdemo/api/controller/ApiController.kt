package me.suitee.circuitbreakerdemo.api.controller

import me.suitee.circuitbreakerdemo.api.service.ApiService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api")
class ApiController(private val apiService: ApiService) {
  @GetMapping("/success")
  fun success(): String {
    return apiService.hello()
  }
}
