package latihan;

public class TestAbstract {
    public static void main(String args[]){
        Weapon weapon = new Knife(); //abstract class tidak perlu di instance

        Weapon knife = new Knife();
        Weapon gun = new Gun(10);

        knife.attack();
        gun.attack();
        gun.attack();


        Knife knife2 = new Knife();
        Weapon gun2 = new Gun(10);

        knife2.attack();
        gun2.attack();
        gun2.attack();

    }
}