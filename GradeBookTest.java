import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        // Declare variables and constants
        int min, max;
        double total = 0,avg = 0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        String arrayNames[] = {"Happy", "Isaac", "Angel", "Surprise", "Scott",
                               "Jack", "Nomhle", "Sbongile", "William", "Naomi"};
        
        int gradesArray[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        
        min = gradesArray[0];
        max = gradesArray[0];        
        System.out.println("Number"+ "\tNames" + "\t\tMarks" + "\n" +
                           "----------------------------------------------");
        
              
        for(int i=0; i<gradesArray.length; i++){
              for(int j=i; j<arrayNames.length; j++){
            }
            if(gradesArray[i]<min){
                min = gradesArray[i];
            }
            if(gradesArray[i]>max){
                max = gradesArray[i];
            }
            total += gradesArray[i];
            avg = (total / gradesArray.length);
              
            System.out.println((i+1) + "\t" + arrayNames[i] + "\t\t" + gradesArray[i]);
        }
		// Display the outcomes
        System.out.println("Class total points is " + df.format(total) + "\n" +
                           "Class average is " + df.format(avg) + "\n" +
                           "Lowest grade is " + min + "\n" +
                           "Highest grade is " + max);
        
        
    }
     
}
