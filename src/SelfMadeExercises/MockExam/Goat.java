package SelfMadeExercises.MockExam;

public class Goat extends Animal implements Feedable {
    private String favoriteFood;

    // Constructors
    public Goat(){
        super();
    }
    public Goat(String name, String generation, int age){
        super(name, generation, age);
    }
    public Goat(String name, String generation, int age, String favoriteFood){
        super(name, generation, age);
        this.favoriteFood = favoriteFood;
    }

    // GS
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }
    public String getFavoriteFood(){
        return favoriteFood;
    }

    // Methods
    @Override
    public String toString() {
        return "My name is " + super.getName() + ", I belong to generation " + super.getGeneration() + " and I am " + super.getAge() + " years old."
                + " I am Happy if you feed me.";
    }
    @Override
    public String feedAnimal(String food) {
        if(food == favoriteFood){
            return "You fed me my favorite food!";
        }
        else {
            return "You fed the goat";
        }
    }
}
