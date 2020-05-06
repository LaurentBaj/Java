package SelfMadeExercises.MockExam;

public abstract class Animal {
    private String name, generation;
    private int age;

    // Constructors
    public Animal(){

    }
    public Animal(String name, String generation){
        this.name = name;
        this.generation = generation;
    }
    public Animal(String name, String generation, int age){
        this.name = name;
        this.generation = generation;
        this.age = age;
    }

    // GS
    public void setName(String name){
        this.name = name;
    }
    public void setGeneration(String generation){
        this.generation = generation;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getGeneration(){
        return generation;
    }
    public int getAge(){
        return age;
    }

    // Method
    public abstract String toString();
}
