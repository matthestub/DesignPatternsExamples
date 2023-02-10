package com.school;

public class AssignmentWork {

    Pen p;

    void setP(Pen p) {
        this.p = p;
    }

    void writeAssignment(String s) {
        p.write(s);
    }
}
