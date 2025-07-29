public class lesson_7 {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(200, 50, "FIREBALL"),
                new Medic(150, 40, "HEALING", 50),
                new Warrior(100, 20, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}
