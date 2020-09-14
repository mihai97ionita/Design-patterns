package com.mihai97ionita.patterns.command

class IncrementCommand(private val receiver: Receiver, private val increment: Int): ICommand {

    override fun execute() {
        receiver.increment(increment)
    }

    override fun undoExecute() {
        receiver.decrement(increment)
    }
}