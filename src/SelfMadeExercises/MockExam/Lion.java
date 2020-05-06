package SelfMadeExercises.MockExam;

public class Lion extends Animal{
    // Constructors
    public Lion(){
        super();
    }
    public Lion(String name, String generation){
        super(name, generation);
    }
    public Lion(String name, String generation, int age){
        super(name, generation, age);
    }
    public Lion(String name, String generation, int age, Stable stable){
        super(name, generation, age, stable);
    }

    // Methods
    @Override
    public String toString() {
        if(super.getStable() == null){
            return "My name is " + super.getName() + ", I belong to the " + super.getGeneration() + " and I am " + super.getAge() + " years old.";
        }
        else {
            return "My name is " + super.getName() + ", I belong to the " + super.getGeneration() + " and I am " + super.getAge() + " years old. " + super.getStable();
        }
    }
}
