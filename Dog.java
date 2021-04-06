/**
 * Ryan Wagner
 * 2/2/2021
 * Object class
 */
public class Dog
{
    private String name;
    private int age;
    private String breed;
    private boolean isNice;
    private int dogYears;
    
    public Dog(String name, int age, String breed, boolean isNice){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isNice = isNice;
    }
    
    //Getter methods
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public boolean getIsNice(){
        return isNice;
    }
    //end of getter methods
    
    //setter methods
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public void setIsNice(boolean isNice){
        this.isNice = isNice;
    }
    //end of setter methods
    
    //accessor method
    public int ageInDogYears(int age){
        //for this example 1 year is 7 dog years
        dogYears = age * 7;
        return dogYears;
    }
    
    //mutator method
    public void calcDogYears(){
        dogYears = age * 7;
    }
    
    //toStringMethod
    public String toString(){
        return String.format("%-10s %-5s %-20s %-15s", getName(), getAge(), getBreed(), getIsNice());
    }
}
