package com.mihai97ionita.patterns.factory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FactoryApplication

fun main(args: Array<String>) {
	println(RandomFactory.adoptAdoptableAnimal().getHello())
	runApplication<FactoryApplication>(*args)
}
