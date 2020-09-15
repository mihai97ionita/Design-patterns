package com.mihai97ionita.patterns.command

interface ICommand {
    fun execute()
    fun undoExecute()
}