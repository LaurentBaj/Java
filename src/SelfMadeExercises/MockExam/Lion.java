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

    // Methods
    @Override
    public String toString() {
        return "My name is " + super.getName() + ", I belong to the" + super.getGeneration() + " and i am " + super.getAge() + " years old";
    }
}
