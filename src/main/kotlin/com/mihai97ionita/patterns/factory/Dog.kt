package com.mihai97ionita.patterns.factory

class Dog(override val name: String): Animal(name = name) {
    override fun getHello()= "Woff woff, my name is $name"
}