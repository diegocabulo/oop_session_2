package Zoo;

import Zoo.model.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Animal("Lucky","Dog", "This dog can bark and make you smile"));
        zoo.add(new Animal("Bigotes","Cat", "Can run at 3am like crazy"));
        zoo.add(new Animal("Pepino","Turtle", "None just to be a shell master"));

        System.out.println("Your Zoo has these awesome animals");

        for (Animal animal:zoo) {
            System.out.println(animal);
        }
    }
}
