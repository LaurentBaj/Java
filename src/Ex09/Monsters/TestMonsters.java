package Ex09.Monsters;

public class TestMonsters {
    public static void main(String[] args){
        Monster blueBoi = new WaterMonster("Blue Boi");
        blueBoi.toString();
        Monster feistyBoi = new FireMonster("Feisty Boi");
        feistyBoi.toString();
        Monster heavyBoi = new StoneMonster("Heavy Boi");
        heavyBoi.toString();

        System.out.println(blueBoi);
        System.out.println(feistyBoi);
        System.out.println(heavyBoi);
    }
}
