public class Monkey extends Animal {
    
    public Monkey (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Monkey");
        setWeight(20);
    }

    public void climb(){
        System.out.println(name + " climbed up a tree!");
    }

    @Override
    public void eat(){
        System.out.println(name + " squeeled in excitement and began to ate.");
    }
    
}
