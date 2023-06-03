package me.suitee.circuitbreakerdemo.backendB.controller

import me.suitee.circuitbreakerdemo.backendB.service.BackendBService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/backendB")
class BackendBController(private val bService: BackendBService) {
  @GetMapping("/success")
  fun success(): String {
    return bService.hello()
  }
}
