package factory;

// Create the CivilService class that extends Course abstract class 
class  CivilServices extends Courses{  
    //@override  
     public void getDuration(){  
         duration=6;             // duration in semesters            
    }  
    public void getFeePerSemester(){
fee = 2000;             // fee in dollars   
    }
}