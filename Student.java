class Student extends Person {
    private String program;
    private int year;

    
    public Student(String name, String address, String program, int year) {
        super(name, address); 
        this.program = program;
        this.year = year;
    }

    
    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

   
    public void displayInfo() {
        System.out.println("---------------Configuration: <Default>---------------");
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address);
        System.out.println("Student Program: " + program);
        System.out.println("Student Year: " + year);
        System.out.println("\nProcess completed.");
    }
}