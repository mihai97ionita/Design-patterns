package com.mihai97ionita.patterns.factory

class Cow(override val name: String): Animal(name = name) {
    override fun getHello()= "Mooooo, my name is $name"
}