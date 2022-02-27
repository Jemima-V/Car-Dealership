//Parent Class
/*
Instance Variables: 
type, model, year, colour, price, customer name, customer phone#, customer address
Constructors: Default/Overloaded
Methods:
- Get/set Methods
- Abstract Methods
*/

public abstract class Vehicle {

  //instance Variables
    //car variables
  int year;
  String type, model, colour;
  double price;

  //customer variables
  String customer, phone, address;


  //Constructors
  public Vehicle(){

  }//Default

  public Vehicle(int y, String t, String m, String co, double pr, String cu, String ph, String a){
    year=y;
    type=t;
    model=m; 
    colour=co;
    price=pr; 
    customer=cu;
    phone=ph; 
    address=a;
  }//Overloaded

  //Set Methods
  public void setYear(int y){
    year=y;
  }

  public void setType(String t){
    type=t;
  }

  public void setModel(String m){
    model=m;
  }

  public void setColour(String co){
    colour=co;
  }

  public void setPrice(double pr){
    price=pr;
  }

  public void setCustomer(String cu){
    customer=cu;
  }

  public void setPhone(String ph){
    phone=ph;
  }

  public void setAddress(String a){
    address=a;
  }


  //get methods
  public int getYear(){
    return year;
  }

  public String getType(){
    return type;
  }

  public String getModel(){
    return model;
  }

  public String getColour(){
    return colour;
  }

  public double getPrice(){
    return price;
  }

  public String getCustomer(){
    return customer;
  }

  public String getPhone(){
    return phone;
  }

  public String getAddress(){
    return address;
  }

  //abstract Methods
  public abstract void vehicleSpecifications();
  public abstract void vehicleAddOns();

}//end Vehicle parent class
