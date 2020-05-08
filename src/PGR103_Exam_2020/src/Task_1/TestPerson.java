package Task_1;

public class TestPerson {
    public static void main(String[] args){
        Person p1 = new Student("Laurent", "Bajrami", 24);
        System.out.println(p1);

        Person p2 = new Staff("Phil", "Anderson", 24, 1000, new Address("Brennerjordet", "1339", "Norway"));
        System.out.println(p2);

        System.out.println("");
        System.out.println("Monthly Salary: " + ((Staff)p2).getSalary());
        ((Staff)p2).setSalary(2000);
        System.out.println("Yearly Salary: " + ((Staff)p2).getPayment());
    }
}
