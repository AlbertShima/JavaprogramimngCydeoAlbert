package day36_Inheritance.Task9;

import day37_Inheritance.scrumTask.BusinessAnalyst;
import day37_Inheritance.scrumTask.ProductOwner;
import day37_Inheritance.scrumTask.ScrumMaster;

public class AmazonInc {
    public static void main(String[] args) {
        ProductOwner productOwner= new ProductOwner("Albert", 31, 'm', 1001, 130000, "HighSchool" );
        ScrumMaster scrumMaster = new ScrumMaster("Jon", 35, 'F', 1003, 120000, "Kot");
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Ti", 35, 'm', 1034, 110000, "tot");

    }
}
/*

	9. Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team
 */