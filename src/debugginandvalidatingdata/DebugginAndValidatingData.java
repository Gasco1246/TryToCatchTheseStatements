/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package debugginandvalidatingdata;


import java.util.Scanner;
/**
 *
 * @author gasco1246
 */
public class DebugginAndValidatingData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sixString();
        lowA();
        noZ();
        fiveHundred();  
        neg();
        posOdd();
    }
    
    public static void sixString(){
        boolean valid = false;
        Scanner put = new Scanner(System.in);
        while (valid == false){
           try{
                String input;
                System.out.println("Enter a string 6 letters or longer");
                input = put.nextLine();

                if(input.length() >= 6){
                    valid = true;
                    System.out.println(input+" is a good string, you show real class");

                }
                else{
                    throw new Exception("Invalid input, please enter a string that is 6 characters long or more");
                }
                }
            catch(Exception e){
                System.err.println(e.getMessage());

            }
        }
    }
    public static void lowA(){
        boolean valid = false;
        Scanner put = new Scanner(System.in);
        while (valid == false){
            try{
                String input; 
                System.out.println("Enter a string that contains the letter a");
                input = put.nextLine();

                if(input.contains("a") == true){
                    valid = true;
                    System.out.println(input+" is a good string, good on ya mate");
                    
                }
                else{
                    throw new Exception("Invalid input, please enter a string that contains the letter a");
                }
                }
            catch(Exception e){
                System.err.println(e.getMessage());

            }
        }
    }
    public static void noZ(){
        boolean valid = false;
        Scanner put = new Scanner(System.in);
        while (valid == false){
            try{
                String input;
                System.out.println("Enter a string between 5 and 15 letters long not containging a z");
                input = put.nextLine();

                if(input.length() >=5&&input.length()<=15&&input.contains("z")==false){
                    valid = true;
                    System.out.println(input+" is a good string, i appreciate you");

                }
                else{
                    throw new Exception("Invalid input, please enter a string between 5 and 15 letters long not containging a z");
              
                }
                }
            catch(Exception e){
                System.err.println(e.getMessage());

            }
        }
    
    }
     public static void fiveHundred(){
        boolean valid = false;
        int num;
        Scanner put = new Scanner(System.in);
        while (valid == false){
            try{
                String input;
                System.out.println("Enter a int between 5 and 500 ");
                input = put.nextLine();
                num = Integer.parseInt(input);

                if(num>=5&&num<=500){
                    valid = true;
                    System.out.println(input+" is a good integer, you deserve to be sainted");

                }
                
                else{
                    throw new Exception("Invalid input, please enter a int between 5 and 500");
              
                }
                }
            catch(Exception e){
                System.err.println(e.getMessage());

            }
        }
    
    }
     public static void neg(){
        boolean valid = false;
        int num;
        Scanner put = new Scanner(System.in);
        while (valid == false){
            try{
                String input;
                System.out.println("Enter a negative integer ");
                input = put.nextLine();
                num = Integer.parseInt(input);

                if(num<0){
                    valid = true;
                    System.out.println(input+" is a good integer, someone should pay you to do this");

                }
                
                else{
                    throw new Exception("Invalid input, please enter a negative integer");
              
                }
                }
            catch(Exception e){
                System.err.println(e.getMessage());

            }
        }
    
    }
     public static void posOdd(){
        boolean valid = false;
        int num;
        Scanner put = new Scanner(System.in);
        while (valid == false){
            try{
                String input;
                System.out.println("Enter a odd positive integer");
                input = put.nextLine();
                num = Integer.parseInt(input);
                num = num%2;

                if(num==1){
                    valid = true;
                    System.out.println(input+" is a good integer, you deserve to be sainted");

                }
                
                else{
                    throw new Exception("Invalid input, enter a posivive odd integer");
              
                }
                }
            catch(Exception e){
                System.err.println(e.getMessage());

            }
        }
    
    }
    }
    

