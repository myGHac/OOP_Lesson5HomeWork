package additional_task;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String [] args ) {

        Animal animal = new Animal("Васька", 45, true);
        Animal animal1 = new Animal("Васька", 15, false);

      System.out.println(animal);
      System.out.println(animal1);

     System.out.println(animal.equals(animal1));

        System.out.println(animal.hashCode());
        System.out.println(animal1.hashCode());
    }
}
