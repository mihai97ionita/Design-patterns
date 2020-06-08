package com.mihai97ionita.patterns.strategy

//TODO is this still considered strategy pattern?
class LambdaClient(private val lambda:()->Unit) {
    fun action() = lambda.invoke()
}