
// creating a new interface animal for this
public interface Animal {
  void makeSound();
}
// lion class implementing animal interface
public class Lion implements Animal {
  @Override
  // overriding and getting the void makesound for the lion
  public void makeSound() {
    System.out.println("Woooo!");
  }
}

// cat class implemeneting animal
public class Cat implements Animal {
  @Override
  // overriding just like it is
  public void makeSound() {
    System.out.println("Meow!");
    // printing the sound
  }
}

// new class for factory
public class AnimalDecorator {
  public static Animal createAnimal(String type) {
    // switching for animals and choises for this
    switch (type) {
      case "lion":
        return new Lion();
      case "cat":
        return new Cat();
      default:
        throw new IllegalArgumentException("Unknown animal type: " + type);
        // throwing and unknowing animals if it is
    }
  }
}

// main class for this 
public class Main {
  public static void main(String[] args) {
    // just creating a new animal and getting the lion and making the souhd
    Animal animal = AnimalDecorator.createAnimal("lion");
    animal.makeSound();

    // for this same too
    Animal animal2 = AnimalDecorator.createAnimal("cat");
    animal2.makeSound();
  }
}
