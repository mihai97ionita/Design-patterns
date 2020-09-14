package com.mihai97ionita.patterns.command

import kotlin.collections.ArrayList

object SingletonInvoker {
    private lateinit var commands: MutableList<ICommand>
    private lateinit var currentPosition: MutableListIterator<ICommand>

    init {
        clearState()
    }

    internal fun clearState(){
        commands = ArrayList()
        currentPosition = commands.listIterator()
    }

    fun undo(){
        if (currentPosition.hasPrevious())
            currentPosition.previous().undoExecute()
    }

    fun redo(){
        if (currentPosition.hasNext())
            currentPosition.next().execute()
    }

    fun sendCommand(command: ICommand){
        if(currentPosition.hasNext()){
            clearAfterCurrentPosition()
        }
        currentPosition.add(command)
        command.execute()
    }

    private fun clearAfterCurrentPosition() {
        commands = commands.subList(0, currentPosition.nextIndex())
        currentPosition = commands.listIterator(commands.lastIndex)
    }
}