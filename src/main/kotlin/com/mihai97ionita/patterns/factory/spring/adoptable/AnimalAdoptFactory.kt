package com.mihai97ionita.patterns.factory.spring.adoptable

import com.mihai97ionita.patterns.factory.IFactory
import org.springframework.stereotype.Component
import kotlin.random.Random

@Component
//I'm smart just because Spring manage my painful  existence
class AnimalAdoptFactory(): IFactory {

    //making very heavy logic business here for determining what animal to adopt
    override fun adoptAdoptableAnimal(): AdoptableAnimal
            = listOf(AdoptableCow(), AdoptableDog())
            .get(Random.nextInt(0, 2))
            .also { it.adopt() }
}