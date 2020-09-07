package com.mihai97ionita.patterns.decorater.simple

import com.mihai97ionita.patterns.decorater.MyComponent

class ConcreteDecoratorMyComponent(override val myComponent: MyComponent) : MyDecoratorC(myComponent = myComponent) {
    override fun methodA() {
        myComponent.methodA()
        println("Here is ${this::class.java.simpleName}")
    }
}