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

        // Instruction 15
        System.out.println("Zoo plein ? " + myZoo.isZooFull());

        for (int i = 1; i <= 22; i++) {
            myZoo.addAnimal(new Animal("Felidae", "Animal" + i, 3, true));
        }
        System.out.println("Zoo plein ? " + myZoo.isZooFull());

        myZoo.removeAnimal(bear);
        System.out.println("Zoo plein après suppression ? " + myZoo.isZooFull());

        // Instruction 16
        Zoo zoo2 = new Zoo("Friguia Park", "Sousse");
        zoo2.addAnimal(new Animal("Elephantidae", "Dumbo", 12, true));
        zoo2.addAnimal(new Animal("Accipitridae", "Aigle", 4, false));

        Zoo biggest = Zoo.compareZoo(myZoo, zoo2);
        System.out.println("Zoo avec le plus d'animaux : " + biggest.getName());

        Zoo biggest2 = Zoo.compareZoo(zoo2, myZoo);
        System.out.println("Même résultat dans l'autre ordre : " + biggest2.getName());

        // instraction 18
        Animal baby = new Animal("Felidae", "Baby", 1, true);
        baby.setAge(-5);
        System.out.println("Age de baby : " + baby.getAge());
        baby.setAge(2);
        System.out.println("Age de baby : " + baby.getAge());

        Zoo badZoo = new Zoo("", "Tunis");
        System.out.println("Nom de badZoo : " + badZoo.getName());
        myZoo.setName("   ");
        System.out.println("Nom de myZoo : " + myZoo.getName());
    }
}