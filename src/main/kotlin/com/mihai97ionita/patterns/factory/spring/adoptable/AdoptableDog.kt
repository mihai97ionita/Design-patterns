package com.mihai97ionita.patterns.factory.spring.adoptable

import java.util.*

class AdoptableDog(override val name: String = UUID.randomUUID().toString()): AdoptableAnimal(name = name) {
    override fun getHello()= "I want a Scooby snack, my name is $name"
}