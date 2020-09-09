package com.mihai97ionita.patterns.singleton

class JavaStatelessSingleton private constructor() : IHelloFunctionality {

    companion object{
        private val STATIC_JAVA_STATELESS_SINGLETON: JavaStatelessSingleton = JavaStatelessSingleton()

        @JvmStatic
        fun provide(): JavaStatelessSingleton = STATIC_JAVA_STATELESS_SINGLETON
    }
}