public class Giraffe extends Animal {
    
    public Giraffe (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Giraffe");
        setWeight(3432);
    }
    
    public void extendNeck(){
        System.out.println(name + " extended its long neck!");
    }

    @Override
    public void eat(){
        System.out.println(name + " bent it's long neck to eat some food.");
    }
}
