package me.suitee.circuitbreakerdemo.backendA.controller

import me.suitee.circuitbreakerdemo.backendA.service.BackendAService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/backendA")
class BackendAController(private val aService: BackendAService) {
  @GetMapping("/success")
  fun success(): String {
    return aService.hello()
  }
}
