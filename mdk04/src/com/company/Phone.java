package com.company;

import java.util.Arrays;

public class Phone {
   private String number;
   private String model;
   private double weight;

    Phone(String n, String m, double w) {
        this (n, m);
        weight = w;
    }
    Phone(String n, String m) {
        number = n;
        model = m;
    }
    public Phone() {
    }

    public void setNumber(String number) {

        this.number = number;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    void receiveCall(String name) {

        System.out.println("Звонил " + name);
    }
    void receiveCall(String name, String number) {

        System.out.println("Звонили " + name + " с номера " + number);
    }

    public String getNumber() {

        return number;
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("Сообщения " + message + " отправлено от:" + Arrays.toString(numbers));
    }
}


