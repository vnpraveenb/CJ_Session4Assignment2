//Parent Class
class Car {  
	
    // Instance Variables of the Car Class
    private String color;  
    private int maxSpeed;   
    
    // Methods Implementation
    
    // Method to print the car details
    public void carDetails(){  
    	System.out.println("Print the Car details");
        System.out.println("Car Color: " +color + "\nMax Speed: " + maxSpeed);  
    }  
    
    // Method to set the color of the car object
    public void setColor(String color) {  
        this.color = color;  
    }  
    
    // Method to set the max speed of the car
    public void setMaxSpeed(int maxSpeed) {  
        this.maxSpeed = maxSpeed;  
    }  
}  


//Child Class
class Skoda extends Car{  
	
    /* Skoda extends Car and thus inherits all methods from Car (except final and static)  
     *  
     *  Skoda can also define all its specific functionality  
     */
    
    // Methods Implementation
	
	// Method to illustrate HAS-A relationship (Composition) by using Engine object and using skodaEngine method called start()
	public void skodaStart()
	{  
        Engine skodaEngine = new Engine();  
        System.out.println("\nCalling start() Method");
        skodaEngine.start();  
        }  
	
	// Method to illustrate HAS-A relationship (Composition) by using Engine object and using skodaEngine method called stop()
	public void skodaStop()
	{  
        Engine skodaEngine = new Engine(); 
        System.out.println("\nCalling stop() Method");
        skodaEngine.stop();  
        }  
    }  


class Engine {  
	  
    // Methods Implementation
    public void start(){  
        System.out.println("Engine Started.");  
    }  
    
    public void stop(){  
        System.out.println("Engine Stopped.");  
    }  
}  


public class Inheritance {

	public static void main(String[] args) {
	         
		// Used IS-A relationship here when getting the car details which is method from the parent class
        Skoda mySkoda = new Skoda();  
        
        //Setting Car details
        mySkoda.setColor("RED");  
        mySkoda.setMaxSpeed(180);  
        
        //Printing Car Details
        mySkoda.carDetails();  
		        
	 /* Used HAS-A relationship  here when using SkodaStart() which is composed of start() from Engine Class
 	 *  and SkodaStop()	 which is composed of start() from Engine Class       
 	 */
        //Calling the method to start the Engine
        mySkoda.skodaStart();  
        
        //Calling the method to stop the Engine
        mySkoda.skodaStop();
        
        
        System.out.println("\n The Has-A relationship is better because of code re-use and modularization of the functional code");
   }  
}
