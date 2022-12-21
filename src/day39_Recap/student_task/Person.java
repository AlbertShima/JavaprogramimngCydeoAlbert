package day39_Recap.student_task;

public class Person {
    private String name;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        char[] ch = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (!(Character.isLetter(ch[i]) || ch[i] == ' ' || name.isBlank())) {
                System.err.println("Wrong name");
                System.exit(0);
            }
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("You entered an invalid gender");
            System.exit(0);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            return; // exits the method
        }

        this.age = age;
    }

    public Person(String name, char gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public void eat() {
        System.out.println(getName() + " is eating");
    }

    public void drink() {
        System.out.println(getName() + " is drinking");
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                '}';
    }


}
/*
Student Task:
	1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()


		3. Create the following sub classes of Student class:

				1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary

				2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary


				4. Create a class named StudentObjects:

						Create the objects of each sub classes

						test all the functions of each objects

            			Analyze the relationships between the classes


 */