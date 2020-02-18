package Constructor;

public class School {
    public static void main(String[] args) {

        Student student1= new Student("Mohammad");
        student1.read(15);
        Book book1 = new Book("java","Cybertek",300);
        student1.read(book1);

    }
}
