package factory;

// Create the Admission class to generate object of sub-classes
class Admission{  
    
	   //use admittingCourse method to get object of type Course   
	       public Courses admittingCourse (String courseName){  
	           if(courseName == null){  
	               return null;  
	           }  
	           if(courseName.equalsIgnoreCase("Computer")) {  
	                 return new Computer();  
	           }   
	           else if(courseName.equalsIgnoreCase("CivilServices")){  
	                return new CivilServices();  
	           }   
	           else if(courseName.equalsIgnoreCase("Health")) {  
	                return new Health();  
	           }  
	      return null;  
	   }  
}