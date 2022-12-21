package day39_Recap.student_task;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, char gender, int age) {
        super(name, gender, age);
    }
    @Override
    public void study(){
        System.out.println(getGrade()+" with Id"+ getStudentId()+" is NOT graduated");
    }
}
