package ex_43_collections.A_List;

public class Student {
    private String studentName;
    private String studentRollNo;

    Student(String studentName, String studentRollNo) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(String studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    void printDetails() {
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Student Roll No: " + getStudentRollNo());
    }

    @Override
    public String toString() {
        return "Student[{Name = " + "'" + studentName + "'" + ", Roll No = " + "'" + studentRollNo + "'" + "}]";
    }
}
