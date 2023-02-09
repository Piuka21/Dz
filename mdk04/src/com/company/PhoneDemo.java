package com.company;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+79000583535", "Honor", 8.0);
        Phone phone2 = new Phone("+79007913535", "Apple", 7.9);
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        System.out.println();

        phone1.receiveCall("Андрей Волков");
        phone2.receiveCall("Илья Николаев");
        phone2.receiveCall("Дима Бирюков", "+77005553535");

        phone1.sendMessage("Message1111","+78005553535", "+75005553535");
        phone2.sendMessage("Message222","+79005553535");
    }
}
