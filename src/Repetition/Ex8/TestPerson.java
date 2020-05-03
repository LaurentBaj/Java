package Repetition.Ex8;

public class TestPerson {
    public static void main(String[] args){

        // Testing the Student Class
        Student sindre = new Student("Sindre Sauarlia", "Jarmyrveien 11", "Popular Music", 2017, 35000.65);
        Student laurent = new Student("Laurent Bajrami", "Orkideveien 10", "Programming", 2019, 47000.9);
        Student henrik = new Student("Henrik Braaten", "Sarpsborg", "Programming", 2019, 47.9);

        Student[] students = {sindre, laurent, henrik};
        for (Student s:students){
            System.out.println(s);
        }

        // Testing the Staff Class
        System.out.println("");
        Staff Hamid = new Staff("Hamid", "Sandvika", "Ingen ting", 25000.5);
        Staff Samira = new Staff("Samira Noe", "Rykkinn", "Life", 32000.3);

        Staff[] staffArray = {Hamid, Samira};
        for (Staff s:staffArray){
            System.out.println(s);
        }

    }
}
