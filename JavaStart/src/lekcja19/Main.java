package lekcja19;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski");
        Student student2 = new Student("Jan", "Kowalski");
        System.out.println("student1 == student2:");
        System.out.println(student1 == student2);
        System.out.println("student1.equals(student2):");
        System.out.println(student1.equals(student2));

        System.out.println(student1);
    }

}
