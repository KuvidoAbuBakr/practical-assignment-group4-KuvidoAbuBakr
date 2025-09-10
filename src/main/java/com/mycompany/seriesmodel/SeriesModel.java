
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seriesmodel;

/**
 *
 * @author abuba
 */
import java.util.Scanner;
public class SeriesModel {

 
    public static void main(String[] args) {
        int Menuopt=0;
        String SeriesID,SeriesName,SeriesAge,SeriesNumberOfEpisides;
        Scanner input = new Scanner(System.in);
        Series details = new Series();
        while(true){
            System.out.println("Enter (1) to launch or any other key to exit");
            String enter = input.nextLine();
            if (enter.equals("1")) {
            System.out.println("Please select one of the following menu Items:\n"
                + "(1) Capture a new series\n"
                + "(2) Search for a series\n"
                + "(3) Update series age restriction\n"
                + "(4) Delete a series\n"
                + "(5) Print series report - 2025\n"
                + "(6) Exit Application");
            Menuopt = input.nextInt();
            input.nextLine();
            switch(Menuopt) {
                case 1:               
                    details.Capture();   
                    break;
                case 2:
                     System.out.println("Enter the series id to search: ");
                    SeriesID = input.nextLine();
                    details.Search(SeriesID);
                    break;
                case 3:
                    details.update();
                    break;
                case 4:
                    details.delete();
                    break;
                case 5:
                    details.SeriesReport();
                    break;
                case 6: 
                    details.ExitSeriesApplication();
                    break;
            }       
            }
            else{
                break;
            }
            } 
        }        
    }  
   

