
package student;

public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    
    //    Getter's & Setters
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Student(){    
    }
    
    public Student(String firstName,String lastName,int YearofBirth){
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info() {
        
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("Year of birth: " + this.getYearOfBirth());
        System.out.println();
        
    }
            
    
   
    



}



     
     
        
     

    

    
   

    
    

