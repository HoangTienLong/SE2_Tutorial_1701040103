package factory;

// Create the abstract class called Course
abstract class Courses{  
    protected int duration;  
    protected double fee;
    abstract void getDuration();  
    abstract void getFeePerSemester();  

    public void calculateTotalFee(){  
         System.out.println(duration*fee);  
    }
}
