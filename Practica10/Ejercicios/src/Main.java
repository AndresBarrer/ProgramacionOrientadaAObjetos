public class Main {
    public static void main(String[] args) {
        
        /* Ejercicio 1 */
        Animal myAnimal = new Animal("Animal", 3);
        Dog myDog = new Dog("Daisy", "Poodle", 10);
        Cat myCat = new Cat("Whiskers", "Bengal", 5);

        myAnimal.eat();
        myAnimal.sleep();

        myDog.eat();
        myDog.sleep();

        myCat.eat();
        myCat.sleep();


        System.out.println("\n\n");
        /* Ejercicio 2 */
        Animal myAnimal2 = new Dog("Doggy", "Chihuahua", 3);

        myAnimal2.drink(); //metodo exclusivo de Animal
        myAnimal2.eat(); //anulacion de metodo por clase Dog 
        myAnimal2.drink(); //metodo exclusivo de Dog
    
        
        System.out.println("\n\n");
        /* Ejercicio 3 */
        Animal [] animalArray = new Animal[3];
        animalArray[0] = new Dog("Woofers", "Great Dane", 7);
        animalArray[1] = new Cat("Meowers", "Siamese", 5);
        animalArray[2] = new Dog("Mr. Bark", "Bulldog", 4);

        for(Animal animal: animalArray){
            animal.eat();
        }
    

        /* Ejercicio 4 */
        for(Animal animal: animalArray){
            animal.eat();

            //if the animal is an instance of the Class Dog
            if (animal instanceof Dog){
                ((Dog) animal).bark();
            }
        }

        
    }
}
