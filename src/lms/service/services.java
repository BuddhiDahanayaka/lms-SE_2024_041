package lms.service;

import lms.model.LibraryItem;
import lms.model.Member;
import java.util.ArrayList;
import java.util.List;

public class services {
        private final List<LibraryItem> items = new ArrayList<>();
        private final List<Member> members = new ArrayList<>();

    public void addItem(LibraryItem item){
        items.add(item);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void listItems(){
        System.out.println("\n---------------Library Items----------------");
        for (LibraryItem item : items){
            System.out.println(item);
        }
    }

    public void listMembers(){
        System.out.println("\n---------------Members---------------");
        for(Member member : members){
            System.out.println(member);
        }
    }

    public void printAllLateFees(int daysLate){
        System.out.println("\n---------------Late Fees----------------");
        for (LibraryItem item : items){
            System.out.println(item.getTitle() + ": " + item.calculateLateFee(daysLate));
        }
    }
}