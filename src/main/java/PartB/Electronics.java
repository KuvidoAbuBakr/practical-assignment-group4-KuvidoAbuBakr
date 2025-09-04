/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PartB;

/**
 *
 * @author abuba
 */
import  java.util.Scanner;
public class Electronics extends items {
    public Electronics[] El = new Electronics[100];
    private int counter;
    private double Owed = 0;
    public String Name;
    public double Price;
    public int Quantity;
    
    public Electronics(String Name,double Price, int Quantity){
       this.Name = Name;
       this.Price = Price;
       this.Quantity = Quantity;   
    }
    
    public Electronics(){}
    
    @Override
    public void Sell(){
        Scanner input = new Scanner(System.in);
        int selected,amount;
        System.out.println("Select what you want to buy");  // asking which item they wanna sell
        for (int i = 0; i < counter ; i++) {
            System.out.println((i+1) + " " +El[i].Name + ". " + El[i].Quantity + " Left");
        }
        selected = input.nextInt() - 1;
        input.nextLine();
        System.out.println("How many do you want to sell"); // the amount of that item they wanna sell
        amount = input.nextInt();
        input.nextLine();
        
        Owed = Owed + amount * El[selected].Price;
        
        System.out.println("That will be R" + Owed);
         decrease(selected,amount);       
    }
    
    public int decrease(int amount,int selected){
               return El[selected].Quantity =  El[selected].Quantity - amount; // changing the amount in stock
    }
    
    @Override
    public void Buy(){
        Scanner input = new Scanner(System.in);
        int selected,amount;
        double owed = 0;
        System.out.println("Select what you want to buy");  // asking what stock they gonna buy
        for (int i = 0; i < counter ; i++) {
            System.out.println((i+1) + " " +El[i].Name + ". " + El[i].Quantity + " Left");
        }
        selected = input.nextInt() - 1;
        input.nextLine();
        System.out.println("How many do you want to buy"); // asking the amount of that stock they want to buy
        amount = input.nextInt();
        input.nextLine();
        
       
        System.out.println(amount + " of " + El[selected].Name + " has succesfully been bought");
        Increase(selected,amount);
        
    }
    public int Increase(int amount,int selected){
             return   El[selected].Quantity =  El[selected].Quantity + amount;// changing the amount in stock
    }
    
    @Override
    public void NewItem(){// adding new items 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the item");
        String Name = input.nextLine();
        
        System.out.println("Enter the price of the item");
        double Price = input.nextDouble();
        
        System.out.println("Enter how many is in stock");
        int Quantity = input.nextInt();
        input.nextLine();
        counter++;
        El[counter-1] = new Electronics(Name,Price,Quantity);
    }
    
    @Override
    public void GetDetails(){ // getting details off all of the stock
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < counter; i++) {
            System.out.println("Item: " + El[i].Name);
            System.out.println("Price: " + El[i].Price);
            System.out.println("In Stock: " + El[i].Quantity); 
            System.out.println("======================");
        }
    }
    
    public void ExitSeriesApplication(){
        System.out.println("Exiting Application");
        System.exit(0);
    }   
}
