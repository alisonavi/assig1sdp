public interface Animal {
  void makeSound();
}

public class Lion implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Woooo!");
  }
}

public class Cat implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow!");
  }
}

public class AnimalFactory {
  public static Animal createAnimal(String type) {
    switch (type) {
      case "lion":
        return new Lion();
      case "cat":
        return new Cat();
      default:
        throw new IllegalArgumentException("Unknown animal type: " + type);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = AnimalFactory.createAnimal("lion");
    animal.makeSound();

    Animal animal2 = AnimalFactory.createAnimal("cat");
    animal2.makeSound();
  }
}
