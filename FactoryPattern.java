// Animal interface for this
public interface Animal {
    void makeSound();
}

// concrete animal classes
public class Horse implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Eaaaa!");
    }
}
// create class Wolf and implementing
public class Wolf implements Animal {
    @Override
    // overriding and making sound
    public void makeSound() {
        System.out.println("Auuuu!");
    }
}

// creating interface for this
public interface AnimalFactory {
    Animal createAnimal(String animalType);
}

// createing creator class
public class ConcreteAnimalFactory implements AnimalFactory {
    @Override
    // overriding and being animal type
    public Animal createAnimal(String animalType) {
    // switch case for the animalType
        switch (animalType) {
        // case wolf for tbat
            case "horse":
            // retuning the horse
                return new Horse();
            case "wolf":
                return new Wolf();
            default:
                throw new IllegalArgumentException("Invalid animal type: " + animalType);
        }
    }
}

// client code and its main class
public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new ConcreteAnimalFactory();
        // dog and creating animal horse
        Animal horse = animalFactory.createAnimal("Horse");
        // making sound
        dog.makeSound();
        // doing the same is it
        Animal wolf = animalFactory.createAnimal("Wolf");
        cat.makeSound();
    }
}
