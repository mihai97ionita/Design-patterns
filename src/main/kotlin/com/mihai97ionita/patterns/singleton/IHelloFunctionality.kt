package com.mihai97ionita.patterns.singleton

interface IHelloFunctionality {
    fun hello() = println("Hello there, my name is ${this::class.java.simpleName}")
}