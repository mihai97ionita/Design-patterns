package com.mihai97ionita.patterns.strategy

class GenericClient(private val strategy:IGenericStrategy ) {
    fun action()=strategy.action()
}