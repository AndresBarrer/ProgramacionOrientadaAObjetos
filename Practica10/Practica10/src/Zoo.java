import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args){
        
        //create a new vet to check on the animals
        Veterinarian vet = new Veterinarian("Andres", 100000); 

        //Arraylist de diferentes objetos de animales
        //metodos para agregar, eliminar, mostrar animales
        ArrayList<Animal> animals= new ArrayList<Animal>(3);

        Animal elephant = new Elephant("Mr. LongNose", 20, true);
        Animal monkey = new Monkey("Mr. LongArms", 10, false);
        Animal giraffe = new Giraffe("Mr. LongNeck", 15, false);

        addAnimal(elephant, animals);
        addAnimal(monkey, animals);
        addAnimal(giraffe, animals);
        showAnimals(animals);

        //Vaccinate animals
        vet.vaccinate(elephant);
        vet.vaccinate(monkey);
        vet.vaccinate(giraffe);
    }

        //metodo para agregar animal
        public static void addAnimal(Animal animal, ArrayList<Animal> animals){
            animals.add(animal);
        }
        
        //metodo para eliminar un animal    
        public static void removeAnimal(Animal animal, ArrayList<Animal> animals){
            animals.remove(animal);
        }
    
        
        //metodo para mostrar animales
        public static void showAnimals(ArrayList<Animal> animals){
            for(int i=0; i<animals.size(); i++){
                System.out.printf("Type of animal: %s\n", animals.get(i).getType());
                System.out.printf("Name of animal: %s\n", animals.get(i).getName()); 
                System.out.printf("Age of animal: %d\n\n", animals.get(i).getAge()); 
            } 
        }



}
