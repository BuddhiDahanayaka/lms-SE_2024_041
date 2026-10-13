package lms.model;

public class Member {
    private String memberId;
    private String name;
    private int borrowedCount;
    private int maxBorrowLimit;

    public Member(String memberId, String name, int maxBorrowLimit) {
        setMemberId(memberId);
        setName(name);
        this.maxBorrowLimit = maxBorrowLimit;
        this.borrowedCount = 0;
    }

    public String getMemberId(){
        return memberId;
    }

    public String getName(){
        return name;
    }

    public int getBorrowedCount(){
        return borrowedCount;
    }

    public int getMaxBorrowLimit(){
        return maxBorrowLimit;
    }

    public void setMemberId(String memberId) {
        if (memberId == null || memberId.trim().isEmpty()){
            throw new IllegalArgumentException("ID cannot be blank");
        } else {
            this.memberId = memberId;
        }
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be blank");
        } else {
            this.name = name;
        }
    }

    public void setBorrowedCount(int borrowedCount) {
        if (borrowedCount < 0){
            throw new IllegalArgumentException("Invalid count");
        } else {
            this.borrowedCount = borrowedCount;
        }
    }

    public void incrementBorrowedCount(int borrowedCount){
        setBorrowedCount(borrowedCount+1);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "Member ID='" + memberId + '\'' + ", Name='" + name + '\'' + ", Borrowed Count=" + borrowedCount + '\'' + ", Maximum Borrow Limit=" + maxBorrowLimit + '}';
    }
}

