/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: Patient class contain the patients information such as their name, address and 
 * emergency contact.
 * Due:09/18/2023
 * Platform/compiler:eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rixa Dubon Gonzales
*/

public class Patient {
		
		//private fields that hold the patients information
		private String patientsFirstName, patientsMiddleName, patientsLastName;
		private String streetAddress;
		private String cityAddress, stateAddress, zipcode;
		private String emergencyContactName;
		private String emergencyContactPhone;
		
		//constructor with no arguments 
		public Patient() {	
		}
		
		//Parameterized constructor initializing the patients full name  
		public Patient(String patientsFirstName, String patientsMiddleName, String patientsLastName) {
			this.patientsFirstName = patientsFirstName;
			this.patientsMiddleName = patientsMiddleName;
			this.patientsLastName = patientsLastName;
		}
		
		//Parameterized constructor initializing all of the patients attributes 
		public Patient (String patientsFirstName, String patientsMiddleName, String patientsLastName, String streetAddress, String cityAddress,
				String stateAddress, String zipcode, String emergencyContactName, String emergencyContactPhone) {
			
				this.patientsFirstName = patientsFirstName;
				this.patientsMiddleName = patientsMiddleName;
				this.patientsLastName = patientsLastName;
				this.streetAddress = streetAddress;
				this.cityAddress = cityAddress;
				this.stateAddress = stateAddress;
				this.zipcode = zipcode;
				this.emergencyContactName = emergencyContactName;
				this.emergencyContactPhone = emergencyContactPhone;
		
		}
		
		//Accessor method for each attribute to get the patients information
		
		public String getPatientsFirstName() {
			
			return patientsFirstName;
		}
		
		
		
		public String getPatientsMiddleName() {
			
			return patientsMiddleName;
		}
		
		
		
		public String getPatientsLastName() {
			
			return patientsLastName;
		}
		
		
		
		public String getStreetAddress() {
			
			return streetAddress;
		}
		
		
		
		public String getCityAddress() {
			
			return cityAddress;
		}

		
		public String getStateAddress() {
			
			return stateAddress;
		}
		
		
		public String getZipCode() {
			
			return zipcode;
		}
		
		
	
		
		public String getEmergencyContactName() {
			
			return emergencyContactName;
		}
		public String getEmergencyContactPhone() {
			
			return emergencyContactPhone;
		}
		

		//mutators for each attribute to set the patients information
		
		public void setPatientsFirstName(String patientsFirstName) {
			this.patientsFirstName = patientsFirstName;
			
		}
		
		public void setPatientsMiddleName(String patientsMiddleName) {
			this.patientsMiddleName = patientsMiddleName;
			
		}

		public void setPatientsLastName(String patientsLastName) {
			this.patientsLastName = patientsLastName;
			
		}
		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}
		public void setCityAddress(String cityAddress){
			this.cityAddress = cityAddress;
		}
		public void setStateAddress(String stateAddress) {
			this.stateAddress = stateAddress;
		}
		public void setZipCode(String zipcode) {
			this.zipcode = zipcode;
		}
		
		public void setEmergencyContactName(String emergencyContactName) {
			this.emergencyContactName = emergencyContactName;
		}
		public void setEmergencyContactPhone(String emergencyContactPhone) {
			this.emergencyContactPhone = emergencyContactPhone;
			
		}
		
		//method returning the concatenation of the patients full name 
		public String buildFullName() {
			return patientsFirstName + " " + patientsMiddleName + " " + patientsLastName ;
		}
		
		//method returning the concatenation of the patients full address
		public String buildAddress() {
			return streetAddress + " " + cityAddress + " " +stateAddress + "" + " " + zipcode;
			
		}
		
		//method returning the concatenation of the patients emergency contact information 
		public String buildEmergencyContact() {
			return emergencyContactName + " " + emergencyContactPhone;
		}
		
		// method that displays all of the patients information 
		public String toString() {
			return "Patient info:\n" +
					" Name: " + buildFullName() +
			        "\n Address: " + buildAddress() +
					"\n Emergency contact: " + buildEmergencyContact();
			
		}
}
