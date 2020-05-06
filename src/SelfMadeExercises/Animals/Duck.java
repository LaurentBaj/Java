package SelfMadeExercises.Animals;

public class Duck extends Animal {
    private String[] colors;

    // Constructors
    public Duck(){
        super();
    }
    public Duck(String name, String type, char gender, int age, double purchaseCost, boolean hasOwner){
        super(name, type, gender, age, purchaseCost, hasOwner);
    }
    public Duck(String name, String type, char gender, int age, double purchaseCost, boolean hasOwner, String[] colors){
        super(name, type, gender, age, purchaseCost, hasOwner);
        this.colors = colors;
    }

    // GS
    public String getColors(){
        String colorContainer = "";
        for(String color:colors){
            colorContainer = color;
        }
        return colorContainer;
    }


    // Methods
    @Override
    public String toString() {
        return "Duck[type = " + super.getType() + ", name = " + super.getName() + ", gender = " + getGender() +
                ", age = " + super.getAge() +  ", cost = " + super.getCost() + ", colors[" + getColors() + "]";
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
