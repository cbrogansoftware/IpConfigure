package org.cbrogansoftware.poc;

public class Cat implements Printable {
    public String name;
    public int age;

    public Cat (){}

    @Override
    public void print(String s, String p) {
        System.out.println("Meow");
    }
}
