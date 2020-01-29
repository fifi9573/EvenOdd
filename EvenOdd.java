//Name: Fiona Tong
//Date: 10/17/18
//Period: 6

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        
        if ((num%2)==0){
            System.out.println("The integer "+ num +" is even.");
        }else{
            System.out.println("The integer "+ num +" is odd.");
        }
    }
}
