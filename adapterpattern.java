// getting the interface animal
public interface Animal {
    void makeSound();
}
// Dog class and implementing
public class Dog implements Animal {
    @Override
  // just overriding and making sound
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
// just same as Dog
public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Chee!");
    }
}
// getting adapterclass and implementing animal
public class AnimalAdapter implements Animal {

    private Animal animal;
// AnimalAdapter function for get the animal
    public AnimalAdapter(Animal animal) {
        this.animal = animal;
    }

  // just making the sound
    @Override
    public void makeSound() {
        animal.makeSound();
    }
}
// main class for this
public class Main {
    public static void main(String[] args) {
      // dog for the dog and etc.
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        // create an adapter for the bird, so that it can be used with the other animals.
        Animal birdAdapter = new AnimalAdapter(bird);

        // make all of the animals make a sound.
        dog.makeSound();
        cat.makeSound();
        birdAdapter.makeSound();
    }
}
