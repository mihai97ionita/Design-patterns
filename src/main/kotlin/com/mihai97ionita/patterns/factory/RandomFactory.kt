package com.mihai97ionita.patterns.factory

import kotlin.random.Random

object RandomFactory: IFactory {
    private val animalTypes: List<Class<out Animal>> = listOf(Cow::class.java,Dog::class.java)

    override fun adoptAdoptableAnimal(): Animal {
        val randomPosition=Random.nextInt(0, animalTypes.size)
        return animalTypes[randomPosition].getConstructor(String::class.java).newInstance("insert-random-name")
    }
}