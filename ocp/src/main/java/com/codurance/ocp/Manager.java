package com.codurance.ocp;

public class Manager implements IEmployee {

    private int salary;
    private int bonus;

    public Manager(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public int payAmount() {
        return salary + bonus;
    }
}
