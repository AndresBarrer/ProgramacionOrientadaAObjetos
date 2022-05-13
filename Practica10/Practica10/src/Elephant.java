public class Elephant extends Animal {
    
    public Elephant (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Elephant");
        setWeight(5650);
    }

    public void honk(){
        System.out.println(name + " honked loudly!");
    }

    @Override
    public void eat(){
        System.out.println(name + " uses it's long nose to scoop food into it's mouth.");
    } 
}
