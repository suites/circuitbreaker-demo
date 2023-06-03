package me.suitee.circuitbreakerdemo.backendB.service

import org.springframework.stereotype.Service

@Service
class BackendBService {
  fun hello(): String {
    return "Hello world Service B"
  }
}
