//child class
/*
Added Instance Variables: 
Constructors: Default/Overloaded
Methods:
- Get/set Methods 
- abstract vehicleSpecifications, vehicleAddOns, autoShopServices methods
*/
import java.util.Scanner;
public class Chrysler extends Vehicle implements BrandDetails{

  //instance Variables
  String extraAddOn = "", addService = "";
  int addOnChoice, serviceChoice;
  double vehicleTax, addOnTax, totalAddOnCost, serviceTax, totalServiceCost;
  String proceed;
  String addOnType [] = {"1. Rear Seat Entertainment System", "2. Anti-theft Window Etching","3. Dent Protection"};
  double addOnCost [] = {300, 200, 400};
  String serviceType [] = {"1. Oil Change", "2. Wheel Allignment"};
  double serviceCost [] = {70, 120};

  //Constructors
  public Chrysler(){

  }//default

  public Chrysler(int y, String t, String m, String co, double pr, String cu, String ph, String a){
    super(y,t,m,co,pr,cu,ph,a);
  }//overloaded 


  //Allow sales rep/customer order a vehicle with their personal specifications
  public void vehicleSpecifications (){
    //Scanner
    Scanner input = new Scanner (System.in);

    System.out.println("\n--- CRYSLER ORDER SPECIFICATIONS ---");
    System.out.println("\n~~FUN FACT: " + BrandDetails.sellingFact + " ~~");
    System.out.println("\nHere your sales associate will enter all the nesscessary information for you to purchase your dream Chrysler!!");
    
    //get user info

    //personal info
    System.out.println("\n\n-Personal Information-");
    System.out.print("\nEnter customer name: ");
    super.setCustomer(input.next());
    System.out.print("\nEnter customer phone number: ");
    super.setPhone(input.next());
    System.out.print("\nEnter customer address: ");
    super.setAddress(input.next());

    //car info
    System.out.println("\n\n-Crysler Specifications-");
    System.out.print("\nEnter the vehicle year you are looking for :");
    super.setYear(input.nextInt());
    System.out.print("\nEnter type of Chrysler Vehicle (i.e SUV, Convertable ect.): ");
    super.setType(input.next());
    System.out.print("\nEnter model of Chrysler Vehicle (i.e Voyager, Pacifica ect): ");
    super.setModel(input.next());
    System.out.print("\nEnter colour of Chrysler Vehicle: ");
    super.setColour(input.next());
    System.out.print("\n*SALES ASSOCIATE* - Enter the negotiated Vehicle price: $");
    super.setPrice(input.nextDouble());

    vehicleTax = Math.round((price*BrandDetails.AfterTax)*100)/100;
    System.out.println("\nPrice after tax: $" + vehicleTax);

    do{
      System.out.print("\nWould You Like to Proceed with this Order? (y/n): ");
      proceed = input.next();

      if(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n")){
        System.out.println("**INVALID INPUT**");
      }
    }while(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n"));

    if(proceed.equalsIgnoreCase("y")){
        System.out.println("\n\n**ORDER APPROVED**\nYour order has been sent to our main system, your will be able to pick up your new Chrysler in the next few days!");
    
    }
    else if(proceed.equalsIgnoreCase("n")){
      System.out.println("\n*Vehicle Order Cancelled*\nYour order will be saved in your customer profile so you can veiw it later!");
    }

    
  }//end of vehicle Specifications

  //Allow customer to select various add ons provided by the brand
  public void vehicleAddOns(){
    
    Scanner input = new Scanner (System.in);

    //incase user wants to get multiple add ons
    do{
      System.out.println("\n--- Chrysler Vehicle Add Ons ---\n");
      for (int x=0;x<addOnType.length;x++){
        System.out.println(addOnType[x]);
      }
      System.out.print("\nWhich Add On would you like to add to your Chrysler? (#): ");
      addOnChoice = input.nextInt();

      //display price and ask user if they would like to purchase the add on
      if (addOnChoice ==1){
        System.out.println("\nYou have Selected: " + addOnType[addOnChoice-1] + "\nPrice: " + addOnCost[addOnChoice-1]);
        addOnTax = Math.round((addOnCost[addOnChoice-1]*BrandDetails.AfterTax)*100)/100;
        System.out.println("Price after tax: " + addOnTax);

        do{
          System.out.print("\nWould You Like to Proceed with the Add On? (y/n): ");
          proceed = input.next();

          if(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }
        }while(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n"));

        if(proceed.equalsIgnoreCase("y")){
          System.out.println("**Add On Approved**");
          totalAddOnCost += addOnTax;
        }
        else if(proceed.equalsIgnoreCase("n")){
          System.out.println("*Add On Order Cancelled*");
        }

        //ask user if they would like to purchase another add on
        do{
          System.out.print("\nWould you like to view another add on? (y/n): ");
          extraAddOn = input.next();

          if(!extraAddOn.equalsIgnoreCase("y") && !extraAddOn.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }

        }while(!extraAddOn.equalsIgnoreCase("y") && !extraAddOn.equalsIgnoreCase("n"));

        if(extraAddOn.equalsIgnoreCase("n")){
          System.out.println("Total price of all add ons purchased: $" + totalAddOnCost);
        }

      }

      else if (addOnChoice ==2){
        System.out.println("\nYou have Selected: " + addOnType[addOnChoice-1] + "\nPrice: " + addOnCost[addOnChoice-1]);
        addOnTax = Math.round((addOnCost[addOnChoice-1]*BrandDetails.AfterTax)*100)/100;
        System.out.println("Price after tax: " + addOnTax);

        do{
          System.out.print("\nWould You Like to Proceed with the Add On? (y/n): ");
          proceed = input.next();

          if(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }
        }while(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n"));

        if(proceed.equalsIgnoreCase("y")){
          System.out.println("**Add On Approved**");
          totalAddOnCost += addOnTax;
        }
        else if(proceed.equalsIgnoreCase("n")){
          System.out.println("*Add On Order Cancelled*");
        }

        //ask user if they would like to purchase another add on
        do{
          System.out.print("\nWould you like to view another add on? (y/n): ");
          extraAddOn = input.next();

          if(!extraAddOn.equalsIgnoreCase("y") && !extraAddOn.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }

        }while(!extraAddOn.equalsIgnoreCase("y") && !extraAddOn.equalsIgnoreCase("n"));

        if(extraAddOn.equalsIgnoreCase("n")){
          System.out.println("Total price of all add ons purchased: $" + totalAddOnCost);
        }
      }

      else if (addOnChoice ==3){
        System.out.println("\nYou have Selected: " + addOnType[addOnChoice-1] + "\nPrice: " + addOnCost[addOnChoice-1]);
        addOnTax = Math.round((addOnCost[addOnChoice-1]*BrandDetails.AfterTax)*100)/100;
        System.out.println("Price after tax: " + addOnTax);

        do{
          System.out.print("\nWould You Like to Proceed with the Add On? (y/n): ");
          proceed = input.next();

          if(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }
        }while(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n"));

        if(proceed.equalsIgnoreCase("y")){
          System.out.println("**Add On Approved**");
          totalAddOnCost += addOnTax;
        }
        else if(proceed.equalsIgnoreCase("n")){
          System.out.println("*Add On Order Cancelled*");
        }

        //ask user if they would like to purchase another add on
        do{
          System.out.print("\nWould you like to view another add on? (y/n): ");
          extraAddOn = input.next();

          if(!extraAddOn.equalsIgnoreCase("y") && !extraAddOn.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }

        }while(!extraAddOn.equalsIgnoreCase("y") && !extraAddOn.equalsIgnoreCase("n"));

        if(extraAddOn.equalsIgnoreCase("n")){
          System.out.println("Total price of all add ons purchased: $" + totalAddOnCost);
        }
      }

      else {
        System.out.println("**INVALID INPUT**");
        extraAddOn = "y";
      }
    }while(extraAddOn.equalsIgnoreCase("y"));
  }//end of add ons method

  //Allow customer to select auto-shop services provided by the brand
  public void autoShopServices(){
    Scanner input = new Scanner(System.in);

    do{

      System.out.println("\n--- Chrysler Autoshop Services ---");
      System.out.println("\n~~FUN FACT: " + BrandDetails.serviceFact + " ~~");
      System.out.println("Here your sales associate will help you select service(s) for your Chrysler!!\n");
      for (int x=0;x<serviceType.length;x++){
        System.out.println(serviceType[x]);
      }
      System.out.print("\nWhich auto-repair service would you like done on your Chrysler? (#): ");
      serviceChoice = input.nextInt();

      if (serviceChoice ==1){
        System.out.println("\nYou have Selected: " + serviceType[serviceChoice-1] + "\nPrice: " + serviceCost[serviceChoice-1]);
        serviceTax = Math.round((serviceCost[serviceChoice-1]*BrandDetails.AfterTax)*100)/100;
        System.out.println("Price after tax: " + serviceTax);

        do{
          System.out.print("\nWould You Like to Proceed with this auto repair service? (y/n): ");
          proceed = input.next();

          if(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }
        }while(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n"));

        if(proceed.equalsIgnoreCase("y")){
          System.out.println("\n**Service Approved**");
          totalServiceCost += serviceTax;
        }
        else if(proceed.equalsIgnoreCase("n")){
          System.out.println("\n*Service Cancelled*");
        }

        //ask user if they would like to purchase another service
        do{
          System.out.print("\nWould you like to view another service? (y/n): ");
          addService = input.next();

          if(!addService.equalsIgnoreCase("y") && !addService.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }

        }while(!addService.equalsIgnoreCase("y") && !addService.equalsIgnoreCase("n"));

        if(addService.equalsIgnoreCase("n")){
          System.out.println("Total price of all services purchased: $" + totalServiceCost);
        }
      }

      else if (serviceChoice ==2){
        System.out.println("\nYou have Selected: " + serviceType[serviceChoice-1] + "\nPrice: " + serviceCost[serviceChoice-1]);
        serviceTax = Math.round((serviceCost[serviceChoice-1]*BrandDetails.AfterTax)*100)/100;
        System.out.println("Price after tax: " + serviceTax);

        do{
          System.out.print("\nWould You Like to Proceed with this auto repair service? (y/n): ");
          proceed = input.next();

          if(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }
        }while(!proceed.equalsIgnoreCase("y") && !proceed.equalsIgnoreCase("n"));

        if(proceed.equalsIgnoreCase("y")){
          System.out.println("\n**Service Approved**");
          totalServiceCost += serviceTax;
        }
        else if(proceed.equalsIgnoreCase("n")){
          System.out.println("*Service Cancelled*");
        }

        //ask user if they would like to purchase another add on
        do{
          System.out.print("\nWould you like to view another service? (y/n): ");
          addService = input.next();

          if(!addService.equalsIgnoreCase("y") && !addService.equalsIgnoreCase("n")){
            System.out.println("**INVALID INPUT**");
          }

        }while(!addService.equalsIgnoreCase("y") && !addService.equalsIgnoreCase("n"));

        if(addService.equalsIgnoreCase("n")){
          System.out.println("Total price of all services purchased: $" + totalServiceCost);
        }
      }

      else{
        System.out.println("**INVALID INPUT**");
        addService = "y";
      }

    }while(addService.equalsIgnoreCase("y"));

  }//end auto shop method

}//end chrysler class
