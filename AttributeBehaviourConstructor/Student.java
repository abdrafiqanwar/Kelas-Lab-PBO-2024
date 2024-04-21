package AttributeBehaviourConstructor;
import java.util.Scanner;

public class Student{
    private String fullName, studyProgram;
    private double nilai;

    public Student(String fullName, String studyProgram, double nilai){
        this.fullName = fullName;
        this.studyProgram = studyProgram;
        this.nilai = nilai;
    }

    public Student(String fullName, String studyProgram, float nilai){
        this.fullName = fullName;
        this.studyProgram = studyProgram;
        this.nilai = nilai;
    }

    public Student(){}

    public Student(double nilai){
        this.nilai = nilai;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public void showStudentData(){
        System.out.println("Full Name: " + getFullName());
        System.out.println("Study Program: " + getStudyProgram());
        System.out.println("Nilai: " + getGradingScale() + "\n");
    }

    public String getGradingScale(){
        String scale = "";
        if(nilai >= 85){
            scale = "A";
        }else if(nilai >= 80 && nilai < 85){
            scale = "A-";
        }else if(nilai >= 75 && nilai < 80){
            scale = "B+";
        }else{
            scale = "B";
        }
        return scale;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.print("Masukkan nama: ");
        // String name = scan.nextLine();
        // System.out.print("Masukkan prodi: ");
        // String prodi = scan.nextLine();
        // System.out.print("Masukkan nilai: ");
        // double nilai1 = scan.nextDouble();

        Student ardi = new Student("Ardi", "kedok", 80);
        Student mukram = new Student();
        Student jaki = new Student(50);

        // ardi.setFullName(name);
        // ardi.setStudyProgram(prodi);
        // ardi.setNilai(nilai1);

        // ardi.fullName = name;
        // ardi.studyProgram = prodi;
        // ardi.nilai = nilai1;

        ardi.showStudentData();
        mukram.showStudentData();
        jaki.showStudentData();
    }
}