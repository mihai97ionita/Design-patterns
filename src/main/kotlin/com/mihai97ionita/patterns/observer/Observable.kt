package com.mihai97ionita.patterns.observer

class Observable():IObservable {
    var stateString: String = "initial state"

    private val observers: ArrayList<IObserver> = ArrayList()

    override fun add(observer: IObserver) {
        observers.add(observer)
    }

    override fun remove(observer: IObserver) {
        observers.remove(observer)
    }

    override fun notifyStateChange() {
        observers.forEach { it.update() }
    }

    override fun getState() = stateString
}