package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("shopping task","ties", 18);
            case PAINTINGTASK:
                return new PaintingTask("painting task","red","wall");
            case DRIVINGTASK:
                return new DrivingTask("driving task","Wrocław","car");
            default:
                return null;
        }
    }
}
