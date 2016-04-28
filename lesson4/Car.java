import java.util.Scanner;

public class Car extends Auto{
  //
  public float speedUp (float speedUp) {
    System.out.println("+++++++++++++++++++++++"); 
    this.speed+=speedUp; 
    return this.speed;
  }
  //?д???
  public float speedDown (float speedDown){
    System.out.println("-----------------------");  
    this.speed-=speedDown;
    return this.speed;
  }
  // ????
  public void navigate () {
    System.out.println("You are using navitation===========>>>>>>>");
  }
  // ?????
  public static void main(String [] agrs){
    Car car1=new Car();
    car1.color = "";
    car1.weight = 0;
    car1.speed = 0;
    
    Scanner sc= new Scanner(System.in);
    try{
      System.out.print("Please input car's color:");
      car1.color = sc.next();

      System.out.print("Please input car's weight:");
      car1.weight = sc.nextFloat();

      System.out.print("Please input car's speed:");
      car1.speed = sc.nextFloat();
    }catch(Exception e){
      System.out.print("input error!");
    }
    System.out.println("Your car's color is : "+car1.color+";weight is "+car1.weight+";speed is "+car1.speed);
    //User choose speedUp or speedDown
    System.out.println("Please choose speedUp or speedDown or exit");
    String choice = "";
    while (true){
      try{
        System.out.print("Please input up or down:");
        choice = sc.next();
      }catch(Exception e){
        System.out.print("input error!");
      }
      // judge user input
      if (choice.equals("up")) {
        try{
          System.out.print("Please input speedup number:");
          float speedUp = sc.nextFloat();
          System.out.print("current speed: ");
          System.out.print(car1.speedUp(speedUp));
        }catch(Exception e){
          System.out.print("input error!");
        }
      } else if (choice.equals("down")){
        try{
          System.out.print("Please input speedDown number:");
          float speedDown = sc.nextFloat();
          System.out.print("current speed: ");
          System.out.print(car1.speedDown(speedDown));
        }catch(Exception e){
          System.out.print("input error!");
        }
      } else {
        break;
      }
     System.out.println("Your car's color is : "+car1.color+";weight is "+car1.weight+";speed is "+car1.speed);
      car1.navigate();
    }
  }
}