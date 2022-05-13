public class Veterinarian {
    String name;
    double salary;

    public Veterinarian (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate (Animal animal){
        if(!animal.getVaccinated()){
            animal.setVaccinated (true);
            System.out.println(animal.getName() + " was vaccinated");
        }else{
            System.out.println(animal.getName() + " was already vaccinated!");
        }
    }

    public void takeBloodSample (Animal animal){
        System.out.println(animal.getName() + " got their blood drawn.");
    }

    public void weighAnimal (Animal animal){
        System.out.println(animal.getName() + " was weighed");
        System.out.println("It weighs " + animal.getWeight() +" pounds!");
    }

}
