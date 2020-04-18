package Ex8;

public class TestPerson {
    public static void main(String[] args){

        Student karan = new Student("IT", 2, 22.4, "Karan Yeti", "Rykkinn");
        Student Jimmy = new Student("HR", 3, 20.4, "Jimmmy Neutron", "Orchard Road");
        Student Janet = new Student("Medicine", 1, 23.3, "Janet Jackson", "Olav");

        Staff Karoline = new Staff("Kristiania", 2100.2, "Karoline Tangen", "Nesodtangen");
        Staff Wen = new Staff("Kristiania", 2100.3, "Wen Hu", "Oslo");

        System.out.println(karan);
        System.out.println(Janet);
        System.out.println(Wen);
        System.out.println(Karoline);
    }
}
