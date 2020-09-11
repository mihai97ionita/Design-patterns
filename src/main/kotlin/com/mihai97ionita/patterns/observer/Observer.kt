package com.mihai97ionita.patterns.observer

class Observer(private val subject: IObservable, private val name: String): IObserver {

    override fun update() {
      println("I, $name, got notified. New state is '${subject.getState()}'")
    }
}