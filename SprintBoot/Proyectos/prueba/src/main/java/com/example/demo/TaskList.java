package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList {
    private String name;
    private List<Task1> taskList;

    public TaskList(String name) {
        this.name = name;
        this.taskList = new ArrayList<Task1>();
    }

    public void addTaskList(Task1 task){
        this.taskList.add(task);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Task1> getTaskList() {
        return taskList;
    }
    public void setTaskList(List<Task1> taskList) {
        this.taskList = taskList;
    }

    public void removeTask(String description){
        this.taskList = taskList.stream().filter(t->{
            return !t.getDescription().equals(description);
        }).collect(Collectors.toList());
    }

    public void printTasks(){
        this.taskList.forEach(task -> {
            System.out.println("Descripción de la tarea: " + task.getDescription());
            System.out.println("Fecha de la tarea: " + task.getDueDate());
            System.out.println("Estado de la tarea realizada: " + task.getDone());
            System.out.println("----------------------");
        });
    }



}
