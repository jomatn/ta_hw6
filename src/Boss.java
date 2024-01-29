import java.util.Random;

public class Boss extends GameEntity {
    private String weapon;

    public Boss(int entityHealth, int entityAttack, String weapon) {
        super(entityHealth, entityAttack);
        this.weapon = weapon;
    }

    public Boss(String weapon) {
        this.weapon = weapon;
    }

    public Boss() {
    }

    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        super.info();
        System.out.println("Boss Health: " + getEntityHealth());
        System.out.println("Boss Damage: " + getEntityAttack());
        return null;
    }


    static WeaponType getRandomWeaponType(Random random) {
        WeaponType[] weaponTypes = WeaponType.values();
        return weaponTypes[random.nextInt(weaponTypes.length)];
    }
}