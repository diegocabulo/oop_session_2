package Zoo.model;

public class Animal {
    private String animalName;
    private String animalSpecies;
    private String features;

    public Animal(String animalName, String animalSpecies, String features) {
        this.animalName = animalName;
        this.animalSpecies = animalSpecies;
        this.features = features;
    }

    @Override
    public String toString(){
        return "Name: " + animalName + "\n" + "Species: "+ animalSpecies + "\n" + "Features: "+ features + "\n";
    }
}
