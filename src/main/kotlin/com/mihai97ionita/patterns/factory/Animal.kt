package com.mihai97ionita.patterns.factory

abstract class Animal(protected open val name: String) {
    abstract fun getHello(): String
}