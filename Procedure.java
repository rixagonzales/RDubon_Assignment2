/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: procedure is the class that contains the procedures information that has been done 
 * to the patients. Information such as the date, the name, the practitioners name and the charges
 * for each one of them.
 * Due:09/18/2023
 * Platform/compiler:eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rixa Dubon Gonzales
*/

public class Procedure{
	
	//private fields to store the procedure's class information
	private String procedureName;
	private String proceduresDate;
	private String practitionersName;
	private double procedureCharge;
	
	//constructor with no arguments
	public Procedure(){
		
	}
	
	//Parameterized constructor that initializes the procedures name and date
	public Procedure(String procedureName, String proceduresDate) {
		this.procedureName = procedureName;
		this.proceduresDate = proceduresDate;
	}
	
	//Parameterized constructor that initializes the all of the procedure class attributes
	public Procedure(String procedureName, String proceduresDate, String practitionersName, double procedureCharge) {
		this.procedureName = procedureName;
		this.proceduresDate = proceduresDate;
		this.practitionersName = practitionersName;
		this.procedureCharge = procedureCharge;
	}
	
	//Accessor method for each attribute to get the procedure information
	
	public String getProcedureName() {
		return procedureName;
	}
	
	public String getProceduresDate() {
		return proceduresDate;
	}
	public String getPractionersName() {
		return practitionersName;
	}
	public double getProcedureCharge() {
		return procedureCharge; 
	}
	
	//mutators for each attribute to set the procedure information
	
	public void setProceduresName(String procedureName) {
		this.procedureName = procedureName;
	}
	public void setProceduresDate(String proceduresDate) {
		this.proceduresDate = proceduresDate;
	}
	public void setPractitionersName(String practitionersName) {
		this.practitionersName = practitionersName;
	}
	public void setProceduresCharge(double procedureCharge) {
		this.procedureCharge = procedureCharge;
	}
	
	//@override the toString() method to generate a string representing the procedure
	public String toString() {
		
		return "\n\tProcedure: " + procedureName + "\n" +
				"\tProcedureDate: " + proceduresDate + "\n" +
				"\tPractitioner: " + practitionersName + "\n" +
				"\tCharge: " + String.format("%.2f", procedureCharge);
	}
}