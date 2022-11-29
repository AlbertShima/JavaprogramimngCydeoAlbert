package day21_ForEachLoop;

public class PractiseTask6 {
    public static void main(String[] args) {
        String sentence = "Java is the best programming language compare to python. I like JAVA, I love java";
        sentence = sentence.replace(".", ""); // Removing dots on the sentence above
        sentence = sentence.replace(",", ""); // Removing comma on the sentence above
        sentence = sentence.toLowerCase();                    // Making to lower case
        String[] arr = sentence.split(" "); // Creating an array by taking each word of the sentence
       
        int javaCount = 0;
        int pythonCount = 0;
        for (String s : arr) {          //Getting each element of the array.
            if (s.equals("java")) {     // Comparing each element with java
                javaCount++;
            }
            if (s.equals("python")) {   // Comparing each element with python
                pythonCount++;
            }
        }
        System.out.println("Number of java words found in the sentence: " + javaCount);
        System.out.println("Number of python words found in the sentence: " + pythonCount);


    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */