
package basicjava;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any Name : ");
        String name = input.nextLine();
        
        System.out.println("Name = " +name);
        
    }
    
}
