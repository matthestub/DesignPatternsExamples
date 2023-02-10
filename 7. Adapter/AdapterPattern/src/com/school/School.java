package com.school;

public class School {

    public static void main(String[] args) {

        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(new PenAdapter());
        assignmentWork.writeAssignment("I'm perfectly prepared to write an assignment!");
    }
}
