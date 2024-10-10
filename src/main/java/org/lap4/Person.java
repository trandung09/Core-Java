package org.lap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String name;
    private int age;
    private String address;

    public Person() {}

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void scanInfo() throws IOException {
        System.out.print("Name: ");
        name = br.readLine();
        System.out.print("Age: ");
        age = Integer.parseInt(br.readLine());
        System.out.print("Address: ");
        address = br.readLine();
    }

    public String toString() {
        return "Name: " + name + ", age: " + age + ", address: " + address;
    }

    public static void main(String[] args) throws IOException {

        Person person = new Person();
        person.scanInfo();

        System.out.println(person);
    }
}
