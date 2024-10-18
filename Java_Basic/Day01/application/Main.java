package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        Person person = new Person(name, age);
        System.out.println("Your name is " + person.getName() + " and your age is " + person.getAge());

        sc.close();
    }
}