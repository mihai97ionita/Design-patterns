package com.mihai97ionita.patterns.factory.spring.adoptable

import com.mihai97ionita.patterns.factory.Animal

abstract class AdoptableAnimal(override val name: String): Animal(name = name) {
    var adoptable = true
        private set

    internal fun adopt(): AdoptableAnimal {
        adoptable = false
        return this
    }
}