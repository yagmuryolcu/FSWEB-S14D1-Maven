package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id,name,salary);

    }
    @Override
    public void work() {
        System.out.println("Senior Developer is writing advanced code");
        setSalary(getSalary() + 400);
    }
}
