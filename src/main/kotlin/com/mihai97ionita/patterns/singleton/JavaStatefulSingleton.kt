package com.mihai97ionita.patterns.singleton

class JavaStatefulSingleton
private constructor(){
    @field:Volatile
    var state: StatefulSingleState = StatefulSingleState.NOT_PROVIDED
    private set

    companion object{
        @JvmStatic
        private val javaStatefulSingleton: JavaStatefulSingleton = JavaStatefulSingleton()

        @JvmStatic
        fun provide() = javaStatefulSingleton
                .apply { state = StatefulSingleState.PROVIDED }

        @JvmStatic
        fun getSingletonState(): StatefulSingleState = javaStatefulSingleton.state
    }
}

enum class StatefulSingleState{
    NOT_PROVIDED,
    PROVIDED,
}