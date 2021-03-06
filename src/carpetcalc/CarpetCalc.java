package carpetcalc;

import java.util.Scanner; //allows me to make use of the scanner function

/**
 *
 * @author Imran Aziz 27/09/2017 18:41
 */
public class CarpetCalc 
{
    
    public static double width;
    public static double length;
    public static double area;
    public static double wastage;
    public static double carpet;
    public static double carpround;//I have now specified all of my variables (in this case doubles)
    
    public static void main(String[] args) 
    {
        
        measurewidth();
        measurelength();
        carpet();
        carpround(); //this is the order in which the program will execute my methods
        System.exit(0);
        
    }

    public static void measurewidth() 
    { //here I'll allow input for the room width
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter width (in meters)");
        width = Double.parseDouble(scanner1.nextLine()); 
        
    }
    
    public static void measurelength() 
    { //see above, but length
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter length (in meters)");
        length = Double.parseDouble(scanner2.nextLine());
        
    }
    
    public static void carpet() 
    { //the carpet must allow for wastage, this method accounts for that
        
        area=length*width;
        wastage=(area*0.05);
        carpet=area+wastage;
        
    }
    
    public static void carpround() 
    { //this method rounds the carpet size value to 1dp
        
        carpround=Math.floor(10*carpet); //rounds down
        System.out.println("Your room is " + area + "m^2");
        System.out.println("The extra you need for wastage is " + wastage + " m^2");
        System.out.println("Your carpet is approximately " + carpround/10 + " m^2");
        
    }
    
}
