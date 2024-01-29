import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Random random = new Random();
        WeaponType randomWeaponType = boss.getRandomWeaponType(random);
        boss.setWeapon(randomWeaponType.toString());
        boss.setEntityHealth(145);
        boss.setEntityAttack(55);
        boss.printInfo();

        Skeleton sceleton = new Skeleton();
        sceleton.setEntityHealth(66);
        sceleton.setEntityAttack(22);
        sceleton.setWeapon(String.valueOf(WeaponType.BOW));
        sceleton.setAmountOfArrows(random.nextInt(50) + 1);
        sceleton.printInfoOfSceleton();

        Skeleton sceleton1 = new Skeleton();
        sceleton1.setEntityHealth(80);
        sceleton1.setEntityAttack(40);
        sceleton1.setAmountOfArrows(random.nextInt(50) + 1);
        sceleton.printInfoOfSceleton();
    }
    private static WeaponType getRandomWeaponType(Random random) {
        WeaponType[] weaponTypes = WeaponType.values();
        return weaponTypes[random.nextInt(weaponTypes.length)];
    }
}
