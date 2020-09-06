package com.mihai97ionita.patterns

import com.mihai97ionita.patterns.observer.Observable
import com.mihai97ionita.patterns.observer.Observer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PatternsApplication

fun main(args: Array<String>) {
	val subject = Observable()
	subject.add(Observer(subject,"Observer1"))
	subject.add(Observer(subject, "Observer2"))
	subject.notifyStateChange()
	subject.stateString = " my state has changed "
	subject.notifyStateChange()
	//runApplication<PatternsApplication>(*args)
}
