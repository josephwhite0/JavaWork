
 /*******************************************************
 * Name: Joseph White 
 * Date: 11.17.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: Program that creates a tree using and array
 * of Customer class
 *******************************************************
 */

 	/*************************************************
 	 * Creating Customer class
 	 * ***********************************************
 	 */
public class Customer {
	
		
 
        private String SSN = "", firstName = "", middleInitial = "", lastName = "", 
		               street = "", city = "", state = "", zipcode = "", 
					   birthdate = " ", creditCardType = "",
		               creditCardNumber = "", creditCardExpiration = "";
		private char gender = '\0';
        public Customer(String SSN, char gender, String firstName, String middleInitial,
		                String lastName, String street, String city, String state, 
						String zipcode, String birthdate, String creditCardType, 
						String creditCardNumber, String creditCardExpiration) {
        	/************************************
        	 * validating SSN so that it fits the size
        	 * of a SSN
        	 * **********************************
        	 */
            if(SSN.length() <= 9 && SSN.length() > 0)
            {
            	this.SSN = SSN;
            }
			this.gender = gender;
			this.firstName = firstName;
			/*****************************************
			 * Validating so that you can only use one
			 * middle initial
			 * ***************************************
			 */
			if(middleInitial.length() > 0 && middleInitial.length() < 5)
			{
				this.middleInitial = middleInitial;
			}
			this.lastName = lastName;
			this.street = street;
			this.city = city;
			this.state = state;
			/*******************************************
			 * Validating so that the length of the zipcode
			 * is the length of an US zipcode
			 * *****************************************
			 */
			if(zipcode.length() > 0 && zipcode.length() <= 5)
			{
				this.zipcode = zipcode;
			}
			this.birthdate = birthdate;
			this.creditCardType = creditCardType;
			
			if(creditCardNumber.length() < 20 && creditCardNumber.length() > 0)
			{
				this.creditCardNumber = creditCardNumber;
			}
			this.creditCardExpiration = creditCardExpiration;
        }
        /******************************************
         * Creating default class
         * ****************************************
         */
        public Customer()
        {
        	this.SSN = "";
        	this.gender = '\0';
        	this.firstName = "";
        	this.middleInitial = "";
        	this.lastName = "";
        	this.street = "";
        	this.city = "";
        	this.state = "";
        	this.zipcode = "";
        	this.birthdate = "";
        	this.creditCardType = "";
        	this.creditCardNumber = "";
        	this.creditCardExpiration = "";
        	
        	
        }
 
        /****************************
         * Creating getters
         * ***********************
         */
        public String getSSN() {
            return this.SSN;
        }
		
		public char getGender() {
            return gender;
        }
		
		public String getFirstName() {
            return firstName;
        }
		
 
		public String getMiddleInitial() {
            return middleInitial;
        }
		
		public String getLastName() {
            return lastName;
        }

 		public String getFullName() {
			return firstName + " " + middleInitial 
					+ ". " + lastName;
		}
		
		public String getStreet() {
            return street;
        }

 		public String getCity() {
            return city;
        }

 		public String getState() {
            return state;
        }

		public String getZipcode() {
            return zipcode;
        }

		public String getBirthdate() {
            return birthdate;
        }

		public String getCreditCardType() {
            return creditCardType;
        }		

		public String getCreditCardNumber() {
            return this.creditCardNumber;
        }		

		public String getCreditCardExpiration() {
            return creditCardExpiration;
        }			
		


		/******************************
		 * Creating mutators
		 * ****************************
		 */
		public void setSSN(String SSN) {
			  if(SSN.length() <= 9 && SSN.length() > 0)
	            {
	            	this.SSN = SSN;
	            }
		}
		
		public void setGender(char gender) {
			this.gender = gender;

        }
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
        }
		
		public void setMiddleInitial(String middleInitial) {
			this.middleInitial = middleInitial;
        }
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
        }

 		public void setStreet(String street) {
			this.street = street;
        }

 		public void setCity(String city) {
			this.city = city;
		}
		
 		public void setState(String state) {
			this.state = state;
        }

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
        }

		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
        }

		public void setCreditCardType(String creditCardType) {
			this.creditCardType = creditCardType;
        }		

		public void setCreditCardNumber(String creditCardNumber) {
			if(creditCardNumber.length() < 20 && creditCardNumber.length() > 0)
			{
				this.creditCardNumber = creditCardNumber;
			}
        }		

		public void setCreditCardExpiration(String creditCardExpiration) {
			this.creditCardExpiration = creditCardExpiration;
        }			
	
		public String toString() {
			return firstName + " " + middleInitial + " " + lastName;
		}
    }