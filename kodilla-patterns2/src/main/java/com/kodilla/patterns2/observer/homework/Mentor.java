package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomework{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentQueue studentQueue) {
        System.out.println(mentorName + ": new task to check in " + studentQueue.getName()  + "\n" +
                " (total tasks: " + studentQueue.getTasks().size() + ")");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
