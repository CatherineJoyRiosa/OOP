public class EncapsulationSample {
    public static void main(String[] args) {

        System.out.println("Hello World!");
       
        Student student1 = new Student();
        
        student1.setId(1234);
        student1.setName("Student_1");

        Book book1 = new Book();
        
        
        book1.setBookNumber(1);
        book1.setTitle("Holy Bible");
        book1.setPrice(500.000);
        
        System.out.println("");
        System.out.println("Student ID: " + student1.getId());
        System.out.println("Student Name: " + student1.getName());
       
        System.out.println("");
        System.out.println("Book Number: " + book1.getBookNumber());
        System.out.println("Book Title: " + book1.getTitle());
        System.out.printf("Book Price: %.2f php ", book1.getPrice());
   
    }
}

class Student {
    private int Student_Id;
    private String Name;

   
    public void setId(int s_id) {
        this.Student_Id = s_id;
    }

    public void setName(String s_name) {
        this.Name = s_name;
    }

    
    public int getId() {
        return Student_Id;
    }

    public String getName() {
        return Name;
    }
}

class Book {
    private int bookNumber;
    private String title;
    private double price;

    
    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

   
    public void setTitle(String title) {
        this.title = title;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

   
    public int getBookNumber() {
        return bookNumber;
    }

   
    public String getTitle() {
        return title;
    }

    
    public double getPrice() {
        return price;
    }
}