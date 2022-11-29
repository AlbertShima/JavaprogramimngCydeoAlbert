package day09_IfStatements;

/*
Write a java program in order to learn to OS
Mac     ->     MacOS
Lenova  ->     Windows
Iphone  ->     IOS
Samsung ->     Android
 */
public class OS {
    public static void main(String[] args) {
        String a = "M";

        if (a == "Mac") {
            System.out.println("Mac     ->     MacOS");
        } else if (a == "Lenovo") {
            System.out.println("Lenovo  ->     Windows");
        } else if (a == "Samsung") {
            System.out.println("Samsung ->     Android");
        } else if(a=="Iphone") {
            System.out.println("Iphone  ->     IOS");
        } else {
            System.out.println("I dont know such name!?");
        }
    }
}
