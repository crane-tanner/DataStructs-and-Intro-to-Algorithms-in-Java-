

import java.util.Scanner;

public class CarpetCalculatorMain
{
public static void main(String[] args)
{
final int priceOfCarpet = 8; 
int length; 
int width; 
RoomDimension dimensions;
RoomCarpet room;

Scanner readme = new Scanner(System.in);
  
System.out.println("\n\nThis program will display the price to carpet your room \n");
  

System.out.print("Enter the length first (feet): ");

length = readme.nextInt();
  
System.out.print("Next enter the width (feet): ");

width = readme.nextInt();
  

dimensions = new RoomDimension(length, width);
room = new RoomCarpet(dimensions, priceOfCarpet);
  
System.out.println(room);
}
}