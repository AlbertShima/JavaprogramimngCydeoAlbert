package day18_NestedLoop;

public class Task5Part3 {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String temp = "";


        for (int i = 0; i < str.length(); i++) {

            int counter = 0;
            String ele1 = str.substring(i, i + 1);


            for (int j = 0; j < str.length(); j++) {

                String ele2 = str.substring(j, j + 1);
                if(temp.contains(ele2)){
                    break;
                }
                if (ele1.equals(ele2)) {
                    counter += 1;
                }
            }

            temp += ele1;
            temp += counter;

        }
        System.out.println(temp);

    }
}