package com.mihai97ionita.patterns.command


class Receiver(initNumber: Int) {

    var number: Int = initNumber
    private set

    fun multiply(multiplier: Int){
        number *= multiplier
    }

    fun divide(divider: Int){
        number /= divider
    }

    fun increment(increment: Int){
        number += increment
    }

    fun decrement(decrement: Int){
        number -= decrement
    }
}
