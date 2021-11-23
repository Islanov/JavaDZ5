package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(500, 50, "Fire");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefence());
      Hero [] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getHealth() + " " + heroes[i].getDamage() + " " + heroes[i].getSuperPower() );
        }
        }
    public static Hero[] createHeroes() {
        Hero artur = new Hero(400, 60, "Udar");
        Hero kasiet = new Hero(450, 56);
        Hero garilla = new Hero(430,67);
    Hero [] heroess = {artur, kasiet, garilla};
    return heroess;
    }
}
