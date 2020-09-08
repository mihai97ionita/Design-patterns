package com.mihai97ionita.patterns.factory.spring.adoptable

import java.util.*

class AdoptableCow(override val name: String = UUID.randomUUID().toString()): AdoptableAnimal(name = name) {
    override fun getHello()= "Mooooo sir/miss, my name is $name"
}