package com.mihai97ionita.patterns.command

class MultiplyCommand(private val receiver: Receiver, private val multiplier: Int): ICommand {

    override fun execute() {
        receiver.multiply(multiplier)
    }

    override fun undoExecute() {
        receiver.divide(multiplier)
    }
}