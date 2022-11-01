package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Elevator elevator = new Elevator((short) 24, 480);
    Person person;

    do {
      System.out.println("Введите данные человека: ");
      System.out.println("Имя = ");
      String name = scanner.next();
      System.out.println("Вес = ");
      int weight = scanner.nextInt();
      System.out.println("Этаж =");
      short floor = scanner.nextShort();
      person = new Person(name,weight,floor);
    } while(elevator.addPeron(person));
  }
}