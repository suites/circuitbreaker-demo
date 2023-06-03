package me.suitee.circuitbreakerdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CircuitbreakerDemoApplication

fun main(args: Array<String>) {
  runApplication<CircuitbreakerDemoApplication>(*args)
}
