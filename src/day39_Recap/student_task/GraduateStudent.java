package day39_Recap.student_task;

public class GraduateStudent extends Student {

    public GraduateStudent(String name, char gender, int age) {
        super(name, gender, age);
    }
    @Override
    public void study(){
        System.out.println(getGrade()+" with Id"+ getStudentId()+" is graduated");
    }
}
