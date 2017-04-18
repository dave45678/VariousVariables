/* VariousVaribles - a program to teach us about variables
*/
public class VariousVariables
{
    public static void main( String[] args )
    {
        //declare variables here before we use them. Variables must be declared before they can be used.
        int x, y, answer, year; //all four variables will be declared as integers
        double temperature;
        float  Temperature; //a float uses less memory than a double
        String firstName, lastName;
        String question = "unknown"; //question varialble is initialized
        
        //assign values to the variables here
        x = 99;
        y = 2147483647; //you could also use the constant Integer.MAX_VALUE
        answer = 42;
        firstName = "James";
        lastName = "Gosling";
        year = 1995;
        temperature = 98.6;//variables are case-sensitive
        Temperature = 32.0f;// use f to indicate this value is floating-point
          
        //Use the variables here
        //in the following statements the plus signs will concatenate the
        //strings and values to print them as one line
        System.out.println( "The variable x contains a value of " + x );
        System.out.print( "The value " + y + " is the largest value ");
        System.out.println( "you can store in an integer." );
        System.out.println("The anwser to the question is: " + answer );
        System.out.println("And the question has long since been " + question);
        System.out.println("If you're not sick your temperature is " 
        														+ temperature);
        System.out.println("If you're an ice cube your temperature is " 
        														+ Temperature);
        System.out.println("The variable Temperature is not "
        										 + "the same as  temperature");
        System.out.println(firstName + " " + lastName + " created Java in " + year);
    }
}