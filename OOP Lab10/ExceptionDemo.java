/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Picnic101
 */
import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args){
        double x1, x2, a, b, c;
        try{
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2*a);
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2*a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
           }
        catch(NumberFormatException e){
            System.out.println("Please input data in number format only.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }

}
// NumberFormatException ArrayIndexOutOfBoundsException