public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Shere Khan", 7, true);
        Animal eagle = new Animal("Accipitridae", "Sky", 3, false);
        Animal bear = new Animal("Ursidae", "Baloo", 10, true);

        Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(eagle);
        myZoo.displayAnimals();

        System.out.println("Remove lion      : " + myZoo.removeAnimal(lion));
        System.out.println("Remove lion again: " + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();

        System.out.println("Add bear         : " + myZoo.addAnimal(bear));
        myZoo.displayAnimals();
    }
}