public class AngryBirds {

    public static void main(String[] args){

    Bird[] birds = new Bird[]{new RedBird(), new YellowBird(), new BlueBird()};
    
    System.out.printf("%s",Bird.Atacar(birds, 0));
    System.out.printf("%s",Bird.Atacar(birds, 1));
    System.out.printf("%s",Bird.Atacar(birds, 2));
    }
}
