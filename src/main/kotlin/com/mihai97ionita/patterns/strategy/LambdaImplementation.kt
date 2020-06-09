package com.mihai97ionita.patterns.strategy

//class LambdaExtended: ()->Unit {
//      override fun invoke() = println("I'm ${this::class.simpleName} and I'm an experiment")
//}

class LambdaExtended: Function0<Unit> {
     override fun invoke() = println("I'm ${this::class.simpleName} and I'm an experiment")
}