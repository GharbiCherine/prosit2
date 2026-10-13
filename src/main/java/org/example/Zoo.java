public class Zoo {
    private static final int NBR_CAGES = 25;

    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo() {
        animals = new Animal[NBR_CAGES];
    }


    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        setName(name);
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    // Le nom d'un zoo ne doit pas être vide
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Erreur : le nom du zoo ne peut pas etre vide");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnimalCount() {
        return animalCount;
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

    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null) {
            return false;
        }
        if (isZooFull()) {
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
            if (animals[i].getName().equals(animal.getName())) {   // getName() au lieu de .name
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

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        }
        return z2;
    }
}