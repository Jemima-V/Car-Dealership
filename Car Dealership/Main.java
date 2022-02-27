/* 
Name: Jemima Vijayasenan
Date: 06/16/2021
Purpose: Create an OOP for a car dealership that sells Dodge, Subaru, and Chrysler vehicles
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner (System.in);

    //Variables
    int chryslerCounter=0, dodgeCounter=0, subaruCounter=0, brandChoice, chryslerChoice, dodgeChoice, subaruChoice;
    String main="", chryslerMenu, dodgeMenu, subaruMenu;

    //create array of objects
    Chrysler c[] = new Chrysler[30];
    Dodge d[] = new Dodge[30];
    Subaru s[] = new Subaru[30];

    //Main menu - do while for error check
    do{
      //main menu
      System.out.println("\n---------------------------------------\n-- Welcome to Jemima's Car Dealership--\n---------------------------------------\n\nWe have many different vehicle services available for you here!");
      System.out.println("\n1. Chrysler Services\n2. Dodge Services\n3. Subaru Services\n4. Exit Program");
      System.out.print("Please select an option (#): ");
      brandChoice = input.nextInt();

      //Chysler
      if(brandChoice == 1){
        //use counter to avoid out of bounds error
        if(chryslerCounter<30){

          //initialize object
          c[chryslerCounter] = new Chrysler();

          //sub menu:
          System.out.println("\n\n---------------------\n CHRYSLER SERVICES \n---------------------");
          do{
            System.out.println("\n1. Place a Chrysler Vehicle Order\n2. View your Chrysler Vehicle Order\n3. Purchase Chrysler Add Ons\n4. Chrysler auto-shop services\n5. Return to main menu\n");
            System.out.print("Please select a service: ");
            chryslerChoice = input.nextInt();

            //sub menu specifications
            //vehicle specifications/place order
            if (chryslerChoice ==1 ){
              c[chryslerCounter].vehicleSpecifications();

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Chrysler Services Menu? (y/n): ");
                chryslerMenu = input.next();

                if (!chryslerMenu.equalsIgnoreCase("y") && !chryslerMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!chryslerMenu.equalsIgnoreCase("y") && !chryslerMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (chryslerMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            //print order
            else if (chryslerChoice ==2 ){
              //use get methods
              System.out.println("\nNote: Values will not exist if you have not placed a Chrysler Vehicle Order");
              System.out.println("\n\n------------ Customer: " + c[chryslerCounter].getCustomer() + "'s Chrysler Order ------------");
              System.out.println("Customer Address: " + c[chryslerCounter].getAddress() + "\nCustomer Phone Number: " + c[chryslerCounter].getPhone() + "\n\nVehicle Specifications:\nYear: " + c[chryslerCounter].getYear() + "\nVehicle Type: " + c[chryslerCounter].getType()+ "\nModel: " + c[chryslerCounter].getModel() + "\nColour: " + c[chryslerCounter].getColour() + "\nPrice (before tax): " + c[chryslerCounter].getPrice() + "\nPrice (after tax): " + c[chryslerCounter].vehicleTax);
              System.out.println("-----------------------------------------------------------");

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Chrysler Services Menu? (y/n): ");
                chryslerMenu = input.next();

                if (!chryslerMenu.equalsIgnoreCase("y") && !chryslerMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!chryslerMenu.equalsIgnoreCase("y") && !chryslerMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (chryslerMenu.equalsIgnoreCase("n")){
                main = "y";
              }
              
            }

            // add ons
            else if (chryslerChoice ==3 ){
              c[chryslerCounter].vehicleAddOns();

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Chrysler Services Menu? (y/n): ");
                chryslerMenu = input.next();

                if (!chryslerMenu.equalsIgnoreCase("y") && !chryslerMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!chryslerMenu.equalsIgnoreCase("y") && !chryslerMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (chryslerMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            //auto shop services
            else if (chryslerChoice ==4 ){
              c[chryslerCounter].autoShopServices();

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Chrysler Services Menu? (y/n): ");
                chryslerMenu = input.next();

                if (!chryslerMenu.equalsIgnoreCase("y") && !chryslerMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!chryslerMenu.equalsIgnoreCase("y") && !chryslerMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (chryslerMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            //return to main
            else if (chryslerChoice ==5 ){
              chryslerMenu ="n";
              main = "y";
            }

            else{
              System.out.println("**INVALID INPUT**");
              chryslerMenu ="y";
            }

          }while(chryslerMenu.equalsIgnoreCase("y"));
          

          //increment counter to avoid out of bounds error
          chryslerCounter++;
        }

        //once object array is full
        else{
          System.out.println("Sorry, we currently cannot offer any more Chrysler services");
          //return to main
          main = "y";
        }
      }//end Chrysler

      //Dodge
      else if(brandChoice == 2){
        //use counter to avoid out of bounds error
        if(dodgeCounter<30){

          //initialize object
          d[dodgeCounter] = new Dodge();

          //sub menu:
          System.out.println("\n\n---------------------\n DODGE SERVICES \n---------------------");
          do{
            System.out.println("\n1. Place a Dodge Vehicle Order\n2. View your Dodge Vehicle Order\n3. Purchase Dodge Add Ons\n4. Dodge auto-shop services\n5. Return to main menu\n");
            System.out.print("Please select a service: ");
            dodgeChoice = input.nextInt();

            //sub menu specifications
            //vehicle specifications
            if (dodgeChoice ==1 ){
              d[dodgeCounter].vehicleSpecifications();

              //ask to return sub menu/make an order
              do{
                System.out.print("\nWould you like to return to the Dodge Services Menu? (y/n): ");
                dodgeMenu = input.next();

                if (!dodgeMenu.equalsIgnoreCase("y") && !dodgeMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!dodgeMenu.equalsIgnoreCase("y") && !dodgeMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (dodgeMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            //print order
            else if (dodgeChoice ==2 ){
              //use get methods
              System.out.print("\nNote: Values will not exist if you have not placed a Dodge Vehicle Order");
              System.out.println("\n\n Customer: " + d[dodgeCounter].getCustomer() + "'s Dodge Order ------------");
              System.out.println("Customer Address: " + d[dodgeCounter].getAddress() + "\nCustomer Phone Number: " + d[dodgeCounter].getPhone() + "\n\nVehicle Specifications:\nYear: " + d[dodgeCounter].getYear() + "\nVehicle Type: " + d[dodgeCounter].getType()+ "\nModel: " + d[dodgeCounter].getModel() + "\nColour: " + d[dodgeCounter].getColour() + "\nPrice (before tax): " + d[dodgeCounter].getPrice() + "\nPrice (after tax): " + d[dodgeCounter].vehicleTax);
              System.out.println("-----------------------------------------------------");

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Dodge Services Menu? (y/n): ");
                dodgeMenu = input.next();

                if (!dodgeMenu.equalsIgnoreCase("y") && !dodgeMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!dodgeMenu.equalsIgnoreCase("y") && !dodgeMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (dodgeMenu.equalsIgnoreCase("n")){
                main = "y";
              }
              
            }

            // add ons
            else if (dodgeChoice ==3 ){
              d[dodgeCounter].vehicleAddOns();

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Dodge Services Menu? (y/n): ");
                dodgeMenu = input.next();

                if (!dodgeMenu.equalsIgnoreCase("y") && !dodgeMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!dodgeMenu.equalsIgnoreCase("y") && !dodgeMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (dodgeMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            // auto shop services
            else if (dodgeChoice ==4 ){
              d[dodgeCounter].autoShopServices();

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Dodge Services Menu? (y/n): ");
                dodgeMenu = input.next();

                if (!dodgeMenu.equalsIgnoreCase("y") && !dodgeMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!dodgeMenu.equalsIgnoreCase("y") && !dodgeMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (dodgeMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            //back to main
            else if (dodgeChoice ==5 ){
              dodgeMenu ="n";
              main = "y";
            }

            else{
              System.out.println("**INVALID INPUT**");
              dodgeMenu ="y";
            }

          }while(dodgeMenu.equalsIgnoreCase("y"));
          

          //increment counter to avoid out of bounds error
          dodgeCounter++;
        }

        //incase object array is full
        else{
          System.out.println("Sorry, we currently cannot offer any more Dodge services");
          //return to main
          main = "y";
        }
      }//end Dodge

      //Subaru

      else if(brandChoice == 3){
        //use counter to avoid out of bounds error
        if(subaruCounter<30){

          //initialize object
          s[subaruCounter] = new Subaru();

          //sub menu:
          System.out.println("\n\n---------------------\n SUBARU SERVICES \n---------------------");
          do{
            System.out.println("\n1. Place a Subaru Vehicle Order\n2. View your Subaru Vehicle Order\n3. Purchase Subaru Add Ons\n4. Subaru auto-shop services\n5. Return to main menu\n");
            System.out.print("Please select a service: ");
            subaruChoice = input.nextInt();

            //sub menu specifications
            //vehicle specifications/place an order
            if (subaruChoice ==1 ){
              s[subaruCounter].vehicleSpecifications();

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Subaru Services Menu? (y/n): ");
                subaruMenu = input.next();

                if (!subaruMenu.equalsIgnoreCase("y") && !subaruMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!subaruMenu.equalsIgnoreCase("y") && !subaruMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (subaruMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            //print order
            else if (subaruChoice ==2 ){
              //use get methods
              System.out.println("\nNote: Values will not exist if you have not placed a Subaru Vehicle Order");
              System.out.println("\n\n------------ Customer: " + s[subaruCounter].getCustomer() + "'s Subaru Order ------------");
              System.out.println("Customer Address: " + s[subaruCounter].getAddress() + "\nCustomer Phone Number: " + s[subaruCounter].getPhone() + "\n\nVehicle Specifications:\nYear: " + s[subaruCounter].getYear() + "\nVehicle Type: " + s[subaruCounter].getType()+ "\nModel: " + s[subaruCounter].getModel() + "\nColour: " + s[subaruCounter].getColour() + "\nPrice (before tax): " + s[subaruCounter].getPrice() + "\nPrice (after tax): " + s[subaruCounter].vehicleTax);
              System.out.println("----------------------------------------");

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Subaru Services Menu? (y/n): ");
                subaruMenu = input.next();

                if (!subaruMenu.equalsIgnoreCase("y") && !subaruMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!subaruMenu.equalsIgnoreCase("y") && !subaruMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (subaruMenu.equalsIgnoreCase("n")){
                main = "y";
              }
              
            }

            //add ons
            else if (subaruChoice ==3 ){
              s[subaruCounter].vehicleAddOns();

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Subaru Services Menu? (y/n): ");
                subaruMenu = input.next();

                if (!subaruMenu.equalsIgnoreCase("y") && !subaruMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!subaruMenu.equalsIgnoreCase("y") && !subaruMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (subaruMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            //auto body services
            else if (subaruChoice ==4 ){
              s[subaruCounter].autoShopServices();

              //ask to return sub menu
              do{
                System.out.print("\nWould you like to return to the Subaru Services Menu? (y/n): ");
                subaruMenu = input.next();

                if (!subaruMenu.equalsIgnoreCase("y") && !subaruMenu.equalsIgnoreCase("n")){
                  System.out.println("**INVALID INPUT**");
                }
              }while(!subaruMenu.equalsIgnoreCase("y") && !subaruMenu.equalsIgnoreCase("n"));

              //return to main menu
              if (subaruMenu.equalsIgnoreCase("n")){
                main = "y";
              }
            }

            else if (subaruChoice ==5 ){
              subaruMenu ="n";
              main = "y";
            }

            else{
              System.out.println("**INVALID INPUT**");
              subaruMenu ="y";
            }

          }while(subaruMenu.equalsIgnoreCase("y"));
          
          //increment counter to avoid out of bounds error
          subaruCounter++;
        }

        //if object array is full
        else{
          System.out.println("Sorry, we currently cannot offer any more Subaru services");
          //return to main
          main = "y";
        }

      }//end subaru

      else if (brandChoice ==4){
        System.out.println("Have a Good Day!");
        break;
      }

      //Error check
      else{
        System.out.println("**INVALID INPUT**");
        main = "y";
      }


    }while (main.equalsIgnoreCase("y"));

    
  }//end main method
}//end class