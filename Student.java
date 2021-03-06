
public class Student {
    private int Id;
    private int Hours;
    private int Points;
    private double grade;

    public Student() {
    }

    public Student(int Id, int Hours, int Points) {
        this.Id = Id;
        this.Hours = Hours;
        this.Points = Points;
        GradePoint();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

   @Override
   public String toString() {
       return "\nID number : " + Id + "\nNumber of points earned : " + Points + "\nCredit hours : " + Hours + "\nGrade point average : "
               + grade;
   }

   public void GradePoint() {
       grade = Points / (double) Hours;
   }
}