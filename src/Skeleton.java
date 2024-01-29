import java.util.Random;

public class Skeleton extends Boss{

    private int amountOfArrows;
    private Random random = new Random();


    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }

    public String printInfoOfSceleton(){
        super.info();
        System.out.println("Skeleton Health: " + getEntityHealth());
        System.out.println("Skeleton Damage: " + getEntityAttack());
        System.out.println("Skeleton Weapon: " + WeaponType.BOW);
        System.out.println("Skeleton's arrows: " + amountOfArrows);
        return null;
    }



    public String printInfoOfSceleton2(){
        super.info();
        setEntityHealth(80);
        setEntityAttack(40);
        System.out.println("Skeleton Health: " + getEntityHealth());
        System.out.println("Skeleton Damage: " + getEntityAttack());
        System.out.println("Skeleton Weapon: " + WeaponType.BOW);
        System.out.println("Skeleton's arrows: " + amountOfArrows);
        return null;
    }
}
