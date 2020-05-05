package SelfMadeExercises.Animals;

public class Duck extends Animal {
    private static boolean canFly = true;
    private String[] colors;

    // Constructors
    public Duck(){
        super();
    }
    public Duck(String name, String type, char gender, int yearsOld, double purchaseCost, boolean hasOwner){
        super(name, type, gender, yearsOld, purchaseCost, hasOwner);
    }

    public void setColors(String color1, String color2){
        this.colors[0] = color1;
        this.colors[1] = color2;
    }
    public String getColors(){
        return colors[0];
    }

    // Methods
    @Override
    public String toString() {
        return "Duck[type = " + super.getType() + ", name = " + super.getName() + ", gender = " + getGender() +
                ", age = " + super.getYear() +  ", cost = " + super.getCost() + "]";
    }
    @Override
    public String makeSound() {
        return "Ducks are known for their 'Quack' sound";
    }
    @Override
    public String eat() {
        return "The duck " + super.getName() + " eats bread crumbs";
    }
}
