package day39_Recap.student_task;

public class Student extends Person {
    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, char gender, int age) {
        super(name, gender, age);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty()) {
            System.err.println("filedOfStudy and schoolName should not be set to null");
            System.exit(0);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty()) {
            System.err.println("filedOfStudy and schoolName should not be set to null");
            System.exit(0);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.err.println("grade must be valid (A, B, C, D, F)");
            System.exit(0);
        }
        this.grade = grade;
    }



    public void study(){
        System.out.println(getGrade()+" with Id"+ getStudentId()+" is studying");
    }

    public String toString() {
        return "Student{" +
                "studentId='" + getStudentId() + '\'' +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade()+
                '}';
    }
}
/*
2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
 */
