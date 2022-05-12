public class Dog extends Animal{
    
    public Dog (String name, String breed, int age){
        super(name, age);
    }

    @Override 
    public void eat () {
        System.out.println(name + " is eating Pedigree.");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void bark(){
        System.out.println(name + ":Woof");
    }
}
