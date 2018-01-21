package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentQueue implements ObservableHomework{
    private final List<ObserverHomework> observers;
    private final List<String> tasks;
    private final String name;

    public StudentQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomework observerHomework) {
        observers.add(observerHomework);
    }

    @Override
    public void removeObserver(ObserverHomework observerHomework) {
        observers.remove(observerHomework);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHomework observerHomework : observers){
            observerHomework.update(this);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
