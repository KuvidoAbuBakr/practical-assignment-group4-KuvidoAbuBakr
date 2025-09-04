/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seriesmodel;

import java.util.Scanner;

/**
 *
 * @author abuba
 */
public class Series {
   public String SeriesID;
     public String SeriesName;
     public String SeriesAge;
     public String SeriesNumberOfEpisides;
     public String Unittest;//using for the user input for unit tests
     Series[] details = new Series[100];
     int count = 0;
     public Series(String SeriesID,String SeriesName,String SeriesAge,String SeriesNumberOfEpisides){
     this.SeriesID = SeriesID;
     this.SeriesName = SeriesName;
     this.SeriesAge = SeriesAge;
     this.SeriesNumberOfEpisides = SeriesNumberOfEpisides;
     }
     public Series(){}
   public void Capture(){// capturing a new series
        Scanner input = new Scanner(System.in);
        String SeriesID, SeriesName, SeriesAge, SeriesNumberOfEpisides;
        count++;
                System.out.println("CAPTURE A NEW SERIES\n*********************");
                System.out.println("Enter the series ID: ");// entering ID
                SeriesID= input.nextLine();
                System.out.println("Enter the series name: ");//entering name
                SeriesName = input.nextLine();
                while(true){
                    System.out.println("Enter the series age restriction: ");
                    SeriesAge = input.nextLine();
                    if (CorrectAgeRestriction(SeriesAge)) {
                       break; 
                    }
                }
                System.out.println("Enter the number of episodes for: "+SeriesName);// entering number of episodes
                SeriesNumberOfEpisides = input.nextLine();
                System.out.println("Enter the number of episodes for: "+SeriesName);
                System.out.println("Series processed successfully!!!");
                details[count-1] = new Series (SeriesID, SeriesName, SeriesAge, SeriesNumberOfEpisides);// adding all of the details intot he array
                
       
   }
   
   public boolean CorrectAgeRestriction(String SeriesAge){//checking if the the agr restriction is within the right parameter
        if(SeriesAge.equals("2") || SeriesAge.equals("3")//entering age restriction
                || SeriesAge.equals("4") || SeriesAge.equals("5") 
                || SeriesAge.equals("6") || SeriesAge.equals("7") 
                || SeriesAge.equals("8") || SeriesAge.equals("9") 
                || SeriesAge.equals("10") || SeriesAge.equals("11") 
                || SeriesAge.equals("12") ||SeriesAge.equals("13") 
                || SeriesAge.equals("14") || SeriesAge.equals("15") 
                || SeriesAge.equals("16") || SeriesAge.equals("17") 
                || SeriesAge.equals("18")){
         // correct age 
         return true;
        }
        else{// incorrect age
            System.out.println("You have entered an incorrect series age!!!");
        return false;
        }
   }
   
   public int Search( String SeriesID){// it will return either 1 or 0 for unit testing purposes
      
        Scanner input = new Scanner(System.in);
       int array = 0;// where in the array the series is found
       boolean find = false;
      
       for (int i = 0; i < count; i++) {
           if (details[i].SeriesID.equals(SeriesID)) {
              find = true; 
              array=i;
           }
           
       }
       System.out.println("-----------------------------");
       if(find){
           // displaying after searching
           System.out.println("\nSERIES ID: " + details[array].SeriesID
                   + "\nSERIES NAME: " + details[array].SeriesName
                   + "\nSERIES AGE RESTRICTION: " + details[array].SeriesAge
                   + "\nSSERIES NUMBER OF EPISODES: " + details[array].SeriesNumberOfEpisides);
           System.out.println("-----------------------------");
           return 1;
        }
       else{
           System.out.println("Series with Series ID: " + SeriesID + " was not found");
           System.out.println("-----------------------------");
           return 0;
       }
   
    }
   
   
   public void update(){ /// returns 1 or 0 for unit testing purposes
    String SeriesID, SeriesName, SeriesAge, SeriesNumberOfEpisides;
    Scanner input = new Scanner(System.in);
       int array = 0;// where in the array the series is found
       boolean find = false;
       System.out.println("Enter the series id to search: ");
       SeriesID = input.nextLine();
       for (int i = 0; i < count; i++) {
           if ( details[i].SeriesID.equals(SeriesID)) {
              find = true; 
              array=i;
           }
           
       } 
         if(find){
             
                System.out.println("Enter the series name: ");//entering name
                SeriesName = input.nextLine();
                while(true){
                    System.out.println("Enter the series age restriction: ");
                    SeriesAge = input.nextLine();
                    if (CorrectAgeRestriction(SeriesAge)) {
                       break; 
                    }
                }
                System.out.println("Enter the number of episodes for: "+SeriesName);
                SeriesNumberOfEpisides = input.nextLine();
                System.out.println("Enter the number of episodes for: "+SeriesName);
                details[array] = new Series (SeriesID, SeriesName, SeriesAge, SeriesNumberOfEpisides);
               
                
        }
         else{
           System.out.println("Series with Series ID: " + details[array].SeriesID+ " was not found");
         
       }
   }
   
   public void delete(){
    String SeriesID;
    Scanner input = new Scanner(System.in);
       int array = 0;// where in the array the series is found
       boolean find = false;
       System.out.println("Enter the series id to search: ");
       SeriesID = input.nextLine();
       for (int i = 0; i < count; i++) {
           if (details[i].SeriesID.equals(SeriesID)) {
              find = true; 
              array=i;
           }
           
       }  
       System.out.println("Are you sure you want to delete series "+ SeriesID +" from the system? Yes (y) to delete.");
       String delete = input.nextLine();
       System.out.println("-----------------------------");
       if(find){
           if (delete.equals("y")) {
           for (int i = array; i < count; i++) {
              details[i] = details[i+1]; 
           }
         details[count-1] = null; 
         count--;
               
               System.out.println("Series with Series ID : " + SeriesID + "WAS deleted");
                  
           }
       }
       else{
          System.out.println("Series with Series ID: " + details[array].SeriesAge + " was not found");  
          System.out.println("-----------------------------");  
       }
       
   }
   public void SeriesReport(){
       for (int i = 0; i < count; i++) {
           int SeriesNum = i+1;

            System.out.println("Series " + SeriesNum 
                   + "\n-----------------------------"
                   + "\nSERIES ID: " + details[i].SeriesID
                   + "\nSERIES NAME: " + details[i].SeriesName
                   + "\nSERIES AGE RESTRICTION: " + details[i].SeriesAge
                   + "\nSERIES NUMBER OF EPISODES: " + details[i].SeriesNumberOfEpisides
                   + "\n-----------------------------");
           
           
        } 
       }

    public void ExitSeriesApplication(){
        System.out.println("Exiting Application");
        System.exit(0);
    }   
}
