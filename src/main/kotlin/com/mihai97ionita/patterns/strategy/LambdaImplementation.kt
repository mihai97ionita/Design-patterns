package com.mihai97ionita.patterns.strategy

class IFunctional: ()->Unit {
     override fun invoke() = println(" I am ${this::class.simpleName}, I am an experiment")
}