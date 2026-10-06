public class Zoo {
    static final int NBR_CAGES = 25;   // constante : ne peut plus changer

    Animal[] animals;
    String name;
    String city;
    int animalCount = 0;

    public Zoo() {
        animals = new Animal[NBR_CAGES];
    }

    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Zoo name : " + name);
        System.out.println("City     : " + city);
        System.out.println("Cages    : " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + NBR_CAGES + "}";
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null) {
            return false;
        }
        if (animalCount >= NBR_CAGES) {
            return false;
        }
        if (searchAnimal(animal) != -1) {
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("  [" + i + "] " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }
}