package ru.lanit.zoo.employees;

public class Security {
    private String name;
    private int age;
    private int days;

    public Security() {
    }

    public Security(String name, int age) {
        this.name = name;
        this.age = age;
        this.days = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
