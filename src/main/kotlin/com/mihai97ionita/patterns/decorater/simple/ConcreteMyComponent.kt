package com.mihai97ionita.patterns.decorater.simple

import com.mihai97ionita.patterns.decorater.MyComponent

class ConcreteMyComponent: MyComponent() {
    override fun methodA() {
        println("Here is ${this::class.java.simpleName}")
    }
}