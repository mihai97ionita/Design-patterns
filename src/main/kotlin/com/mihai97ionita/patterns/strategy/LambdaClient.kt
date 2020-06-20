package com.mihai97ionita.patterns.strategy

//TODO is this still considered strategy pattern?
class LambdaClient(private val lambda:()->Unit) {
    fun action() = lambda.invoke()
}
//This two are equivalents

//class LambdaClient(private val lambda:Function0<Unit>) {
//    fun action() = lambda.invoke()
//}