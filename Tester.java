
/**
 * Ryan Wagner
 * 2/2/2021
 * Tester class
 */
public class Tester
{

    public static void main(String [] args){

        String name1 = "Murphy";
        int age1 = 7;
        String breed1 = "Yellow Lab";
        boolean isNice1 = true;

        String name2 = "Wyatt";
        int age2 = 9;
        String breed2 = "Great Dane";
        boolean isNice2 = false;

        String name3 = "Louis";
        int age3 = 1;
        String breed3 = "Mutt";
        boolean isNice3 = true;

        String name4 = "Archer";
        int age4 = 3;
        String breed4 = "German Shepard";
        boolean isNice4 = true;

        Dog[] dogs = {new Dog(name1, age1, breed1, isNice1), new Dog(name2, age2, breed2, isNice2), new Dog(name3, age3, breed3, isNice3), new Dog(name4, age4, breed4, isNice4)};
    
        System.out.printf("%-9s %-6s %-20s %-15s", "Name", "Age", "Breed", "IsNice");
        System.out.println("\n" + "==============================================");
        
        for(Dog d: dogs){
            System.out.println(d);
        }
    
    }

}
