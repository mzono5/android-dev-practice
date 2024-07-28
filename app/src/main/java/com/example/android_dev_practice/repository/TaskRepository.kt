package com.example.android_dev_practice.repository

import com.example.android_dev_practice.model.Task

interface TaskRepository {
    fun add(task: Task)
    fun delete(task: Task)
    fun update(task: Task)
}

class TaskRepositoryImpl : TaskRepository {
    private var tasks = mutableListOf<Task>()

    override fun add(task: Task) {
        tasks.add(task)
    }

    override fun delete(task: Task) {
        tasks.removeIf { it.id == task.id }
    }

    override fun update(task: Task) {
        val index = tasks.indexOfFirst { it.id == task.id }
        if (index != -1) {
            tasks[index] = task
        } else {
            add(task)
        }
    }
}