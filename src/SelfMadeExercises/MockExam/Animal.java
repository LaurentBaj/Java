package SelfMadeExercises.MockExam;

public abstract class Animal {
    private String name, generation;
    private int age;
    private Stable stable;

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
    public Animal(String name, String generation, int age, Stable stable){
        this.name = name;
        this.generation = generation;
        this.age = age;
        this.stable = stable;
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
    public void setStable(Stable stable){
        this.stable = stable;
    }
    public Stable getStable(){
        return stable;
    }

    // Method
    public abstract String toString();
}
