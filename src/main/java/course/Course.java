
package course;

public class Course {
    private String name;
    private String codeName;
    private int numberOfClasses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
    
     public Course(){    
    }
    
      public Course(String name,String codeName,int numberOfClasses){    
    }
}
