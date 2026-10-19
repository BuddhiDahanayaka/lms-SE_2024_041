import lms.model.*;
import lms.service.*;

public static void main(String[] args) {
    services services = new services();

    LibraryItem b1 = new Book("B001", "Clean Code", "Robert C. Martin");
    LibraryItem b2 = new Book("B002","Harry Potter","J. K. Rowling");
    LibraryItem b3 = new Book("B003","Atomic Habits","James Clear");
    LibraryItem b4 = new Book("", "", "Nobody");

    LibraryItem d1 = new DVD("D001", "Intro to Algorithms", 120);
    LibraryItem d2 = new DVD("D002","Grammar Tree",200);
    LibraryItem d3 = new DVD("D003","OOP Fundamentals",100);

    Member stu1 = new Student("SE001","Nipuni Jayakody");
    Member stu2 = new Student("SE002","Kasun Fernando");
    Member stu3 = new Student("SE003","Jayani Dahanayaka");
    Member stu4 = new Student("", "");

    Member sta1 = new Staff("S001","Jagath Gunawardhana");
    Member sta2 = new Staff("S002","Disna Pathirana");
    Member sta3 = new Staff("S003","Kamal Rathnayaka");

    services.addItem(b1);
    services.addItem(b2);
    services.addItem(b3);
    services.addItem(b4);
    services.addItem(d1);
    services.addItem(d2);
    services.addItem(d3);

    services.addMember(stu1);
    services.addMember(stu2);
    services.addMember(stu3);
    services.addMember(stu4);
    services.addMember(sta1);
    services.addMember(sta2);
    services.addMember(sta3);

    services.listItems();
    services.listMembers();
    services.printAllLateFees(3);
}
