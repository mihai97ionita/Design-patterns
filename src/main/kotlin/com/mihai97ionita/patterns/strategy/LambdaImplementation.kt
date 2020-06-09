package com.mihai97ionita.patterns.strategy

class LambdaImplementation: ()->Unit {
      override fun invoke() = println("I'm ${this::class.simpleName} and I'm an experiment")
}

//This two are equivalents

//class LambdaImplementation: Function0<Unit> {
//     override fun invoke() = println("I'm ${this::class.simpleName} and I'm an experiment")
//}