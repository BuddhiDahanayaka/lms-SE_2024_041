package lms.model;

public abstract class LibraryItem {
    private String id;
    private String title;
    private boolean isBorrowed;

    public LibraryItem(String id, String title) {
        setId(id);
        setTitle(title);
        this.isBorrowed = false;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()){
            System.out.println(new IllegalArgumentException("ID cannot be blank"));
        } else {
            this.id = id;
        }
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()){
            System.out.println(new IllegalArgumentException("Title cannot be blank"));
        } else {
            this.title = title;
        }
    }

    public void borrowItem() { /* TODO */ }
    public void returnItem() { /* TODO */ }

    public double calculateLateFee(int daysLate) {
        return (daysLate * 10.0);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "ID='" + id + '\'' + ", Title='" + title + '\'' + ", Borrowed Status=" + isBorrowed + '}';
    }
}
