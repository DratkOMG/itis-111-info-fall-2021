import java.io.*;
import java.util.*;

interface Greet {
  void greet(String name);

}

interface Delivery {
  void deliver(String what, String where);

}

class Living {
}

class Human extends Living implements Delivery, Greet {
  String name;

  public Human(String name) {
    this.name = name;
  }

  public void deliver(String what, String where) {
    System.out.println(name + " delivers " + what + " to " + where);
  }

  public void greet(String name) {
    System.out.println("hi " + name);
  }
}

class Robot implements Delivery, Greet {
  int id;

  public Robot(int id) {
    this.id = id;
  }

  public void deliver(String what, String where) {
    System.out.println(id + " bip bop bip " + what + " bip bip " + where);
  }

  public void greet(String name) {
    System.out.println("bip bip bip " + name);
  }
}

public class L14 {
  public static void work(Delivery d) {
    d.deliver("something", "somewhere");
  }

  public static void hi(Greet d) {
    d.greet("Goff");
  }

  public static void main(String[] args) {
    Human human1 = new Human("Alice");
    Human human2 = new Human("Bob");
    Robot robot = new Robot(123);
    human1.deliver("pizza", "home");
    robot.deliver("byte", "home");
    work(human2);
    work(robot);
    human1.greet("Meow");
    robot.greet("Meow");
    hi(human1);
    hi(robot);
  }
}
