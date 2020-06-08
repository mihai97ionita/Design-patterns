package com.mihai97ionita.patterns.strategy

//TODO ()->Unit should be a lambda?
class LambdaImplementation: ()->Unit {
     override fun invoke() = println("I'm ${this::class.simpleName} and I'm an experiment")
}