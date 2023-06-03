package me.suitee.circuitbreakerdemo.api.service

import org.springframework.stereotype.Service

@Service
class ApiService {
  fun hello(): String {
    return "Hello world api gateway"
  }
}
