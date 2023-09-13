import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    double x;
    int y;

    System.out.println("Enter Lower Point X:");
    double LowerXCoord = Input.nextDouble();
    System.out.println("Enter Lower Point Y:");
    double LowerYCoord = Input.nextDouble();
    System.out.println("Enter Upper Point X:");
    double UpperXCoord = Input.nextDouble();
    System.out.println("Enter Upper Point Y:");
    double UpperYCoord = Input.nextDouble();
    System.out.println("Enter Curve Value (1 is a line):");
    double Curve = Input.nextDouble();

    System.out.println("\n");
    if (UpperXCoord > LowerXCoord) {
      x = LowerXCoord;
      while (x <= UpperXCoord) {
        y = (int)Math.round(((Math.pow((UpperYCoord-LowerYCoord)/(UpperXCoord-LowerXCoord)*(x-LowerXCoord),Curve)*Math.pow(UpperYCoord-LowerYCoord,2))/((UpperYCoord-LowerYCoord)*Math.pow(UpperYCoord-LowerYCoord,Curve)))+LowerYCoord);
        System.out.println("" + (int)x + "," + y);
        x ++;
      }
    } else {
      x = LowerXCoord;
      while (x >= UpperXCoord) {
        y = (int)Math.round(((Math.pow((UpperYCoord-LowerYCoord)/(UpperXCoord-LowerXCoord)*(x-LowerXCoord),Curve)*Math.pow(UpperYCoord-LowerYCoord,2))/((UpperYCoord-LowerYCoord)*Math.pow(UpperYCoord-LowerYCoord,Curve)))+LowerYCoord);
        System.out.println("" + (int)x + "," + y);
        x --;
      }
    }
  }
}