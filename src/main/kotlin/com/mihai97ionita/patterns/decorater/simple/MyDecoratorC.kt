package com.mihai97ionita.patterns.decorater.simple

import com.mihai97ionita.patterns.decorater.MyComponent

abstract class MyDecoratorC(protected open val myComponent: MyComponent): MyComponent() {
}