/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: PatientDriverApp class is the main class that call the patient and eclipse class. 
 * Additionally it contains the instances of procedure and patient classes and calculates the total
 * charges of the procedures done. 
 * Due:09/18/2023
 * Platform/compiler:eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rixa Dubon Gonzales
*/

public class PatientDriverApp {
	
	static String studentsName = "Rixa Dubon Gonzales";
	static String studentsNumber = "M21135797";
	static String assignmentDueDate = "09/18/2023";
	
	//patient object initialized with the patients sample information
	public static void main(String[]args) {
		Patient patient = new Patient("Julia","Fernandez","Rodriguez", "1213 Oakville","Rockville","MD","00826","George Santos", "888-555-2020");
		
		//procedure instance using a parameterized constructor with all the attributes
		Procedure procedure1 = new Procedure("Blood Transfusion","08/20/2023","Dr. Rodriguez", 2000.00);
		
		//procedure instance using a parameterized constructor with two attributes
		Procedure procedure2 = new Procedure("Regular Check-Up","09/09/2023");
			      procedure2.setPractitionersName("Dr. Argueta");
			      procedure2.setProceduresCharge(150.23);	
		//procedure instance using a parameterized constructor with three attributes
	    Procedure procedure3 = new Procedure("Ear Check-Up","07/25/2023");
			      procedure3.setPractitionersName("Dr. Sanchez");
				  procedure3.setProceduresCharge(120.54);
				  
				  //display patient and procedure information
				  displayPatient(patient);
				  displayProcedure(procedure1);
				  displayProcedure(procedure2);
				  displayProcedure(procedure3);
				  
			
				  //calculate and display the total charges for the procedures
				  String totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
			        System.out.println("\nTotal Charges: $" +  totalCharges);
			        
			        System.out.println("\nStudent Name: " + studentsName);
			        System.out.println("MC#: " + studentsNumber);
			        System.out.println("Due Date: " + assignmentDueDate);
			        }

			   //method that displays the patients information
			    public static void displayPatient(Patient patient) {
			        System.out.println(patient);
			    }

			    //method that displays the procedures information
			    public static void displayProcedure(Procedure procedure) {
			        System.out.println(procedure);
			    }
			    
			    //method that calculates and returns the total charges
			    public static String calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {	
			    	double totalCharges = procedure1.getProcedureCharge() + procedure2.getProcedureCharge() + procedure3.getProcedureCharge();
			    	return String.format("%.2f", totalCharges);
			    }
			    
			    
			}
 			

