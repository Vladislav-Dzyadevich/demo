package com.carService.demo.dto;

import com.carService.demo.enums.Car;

import java.util.List;

public class UserDto {
    private String name;
    private String surName;
    private Integer age;
    private List<Car> cars;

    public UserDto(String name, String surName, int age, List<Car> cars) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
