package org.example;


public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Shere Khan", 7, true);
        Animal eagle = new Animal("Accipitridae", "Sky", 3, false);

        Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis", 25);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
    }
}
        // Instruction 6: after adding the parameterized constructors, new Animal() and
        // new Zoo() no longer compile, because Java removes the default constructor
        // once any constructor is defined.
// Instruction 8: println(myZoo) and println(myZoo.toString()) print Zoo@hashcode,
// because the inherited Object.toString() is used. The fix is to override toString() (Instruction 9).