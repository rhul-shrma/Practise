package com.practise;

class Animal{
    String name;
    String behaviour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

}

class Dog extends Animal{
    String bark;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = this.bark;
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Animal ani1 = new Animal();
        Animal ani2 = new Animal();

        ani1.setName("Cow");
        ani2.setName("Tiger");

        ani1.setBehaviour("Chew");
        ani2.setBehaviour("Roar");

        Dog dog = new Dog();

        dog.setBehaviour("Bark");

        System.out.println("Name of the animal: " + ani1.getName() + "\n"
                + "Another name of the animal: " + ani2.getName());

        System.out.println("Behaviour of Cow: " + ani1.getBehaviour() + "\n"
                + "Another behaviour of Tiger: " + ani2.getBehaviour());

        System.out.println("The Dog: " + dog.getBehaviour());

    }
}
