/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PartB;

/**
 *
 * @author abuba
 */
import  java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Electronics saler = new Electronics();
        Scanner input = new Scanner(System.in);
        int Menuopt=0;
        while(true){
            System.out.println("Please select one of the following menu Items:\n"
                + "(1) Capture a new item\n"
                + "(2) Sell an Item\n"
                + "(3) Restock an item\n"
                + "(4) List of items\n"
                + "(5) Exit");
            Menuopt = input.nextInt();
            switch(Menuopt) {
                case 1:               
                    saler.NewItem();   
                    break;
                case 2:
                    saler.Sell();
                    break;
                case 3:
                    saler.Buy();
                    break;
                case 4:
                    saler.GetDetails();
                    break;
                case 5:
                    saler.ExitSeriesApplication();
                    break;
            }    
        }       
    }
}
    
