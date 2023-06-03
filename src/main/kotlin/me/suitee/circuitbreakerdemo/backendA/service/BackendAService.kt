package me.suitee.circuitbreakerdemo.backendA.service

import org.springframework.stereotype.Service

@Service
class BackendAService {
  fun hello(): String {
    return "Hello world Service A"
  }
}
