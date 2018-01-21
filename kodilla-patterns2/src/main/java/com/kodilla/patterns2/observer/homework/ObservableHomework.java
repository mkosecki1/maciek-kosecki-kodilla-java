package com.kodilla.patterns2.observer.homework;

public interface ObservableHomework {
    void registerObserver(ObserverHomework observerHomework);
    void removeObserver(ObserverHomework observerHomework);
    void notifyObservers();
}
