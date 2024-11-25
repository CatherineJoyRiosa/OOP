public class InheritanceSample {
    public static void main(String[] args) {
       
        Student student = new Student("Riosa, Marco M.", "Salong, Calaca City, Batangas ", "BSIT", 2);
        student.displayInfo();

     
        Staff staff = new Staff("Catherine Riosa", "Salong, Calaca City, Batangas", "BSIT", 5400.97);
        staff.displayInfo();
    }
}
