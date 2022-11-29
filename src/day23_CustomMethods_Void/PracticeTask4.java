package day23_CustomMethods_Void;

public class PracticeTask4 {
    public static void main(String[] args) {
        checkIfIsEligibleToVote(13, "Albania");
        checkIfIsEligibleToVote(19, "Albania");
        checkIfIsEligibleToVote(19, "USA");

    }

    public static void checkIfIsEligibleToVote(int number, String str) {
        if (number >= 18 && str.equalsIgnoreCase("Albania")) {
            System.out.println("You are eligible to vote in Albanian country!");
        } else {
            System.out.println("You are not eligible to vote!");
        }

    }
}
/*
	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */