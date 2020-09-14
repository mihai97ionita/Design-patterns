package com.mihai97ionita.patterns.command

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

class CommandPatternTest {

    @AfterEach
    fun clean(){
        SingletonInvoker.clearState()
    }

    @Test
    fun `sending one increment command then undo will give initial state`(){
        val receiver = Receiver(1)
        val initState = receiver.number

        SingletonInvoker.sendCommand(IncrementCommand(receiver,1))
        assertThat(receiver.number).isEqualTo(2)

        SingletonInvoker.undo()
        assertThat(receiver.number).isEqualTo(initState)
    }

    @Test
    fun `sending one multiply command then undo will give initial state`(){
        val receiver = Receiver(1)
        val initState = receiver.number

        SingletonInvoker.sendCommand(MultiplyCommand(receiver,200))
        assertThat(receiver.number).isEqualTo(200)

        SingletonInvoker.undo()
        assertThat(receiver.number).isEqualTo(initState)
    }

    @Test
    fun `sending multiple command then undo will give initial state then redo will give final state`(){
        val receiver = Receiver(1)
        val initState = receiver.number

        SingletonInvoker.sendCommand(MultiplyCommand(receiver,200))
        assertThat(receiver.number).isEqualTo(200)

        SingletonInvoker.sendCommand(IncrementCommand(receiver,2))
        assertThat(receiver.number).isEqualTo(202)

        SingletonInvoker.undo()
        assertThat(receiver.number).isEqualTo(200)

        SingletonInvoker.undo()
        assertThat(receiver.number).isEqualTo(initState)

        SingletonInvoker.redo()
        assertThat(receiver.number).isEqualTo(200)

        SingletonInvoker.redo()
        assertThat(receiver.number).isEqualTo(202)
    }

    @Test
    fun `undo will do nothing when no command to undo`(){
        val receiver = Receiver(1)
        val initState = receiver.number

        SingletonInvoker.undo()
        SingletonInvoker.undo()
        assertThat(receiver.number).isEqualTo(initState)
    }

    @Test
    fun `redo will do nothing when no command to redo`(){
        val receiver = Receiver(1)
        val initState = receiver.number

        SingletonInvoker.redo()
        SingletonInvoker.redo()
        assertThat(receiver.number).isEqualTo(initState)
    }

}