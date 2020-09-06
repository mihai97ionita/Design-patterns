package com.mihai97ionita.patterns.observer

import java.util.*

interface IObservable {
    fun add(observer: IObserver)
    fun remove(observer: IObserver)
    fun notifyStateChange()
    fun getState(): String
}