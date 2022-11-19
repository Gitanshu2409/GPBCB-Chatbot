import java.util.*;
public class GPBCBPrototype {
  public static void main(String[]args){
// Defining Scanner to read input.
    Scanner scnr = new Scanner(System.in);

// Welcome Program
    System.out.println("|*************************************************|");
    System.out.println("|***|Welcome to GPBCB, I am Still a Prototype.|***|");
    System.out.println("|*************************************************|");
    System.out.println("WARNING : Please provide all input in capital letters only.....");
    System.out.println("#Please enter your name, this will make it easier for me to talk to you.#");
    String usrname = scnr.nextLine();
    System.out.println("#Oh i see :)#");
    System.out.println("Nice to meet you : "+usrname);
    System.out.println("So, Choose how would you like me to behave.....(1/2)");
    System.out.println("1. Formal and Well Behaving.");
    System.out.println("2. Friend-like and Chaotic.");
    int behave = scnr.nextInt();

    if(behave == 1){
      System.out.println("Friend");
    }
    else if(behave == 2){
      System.out.println("Formal");
    }
    else{
      System.out.println("Wrong input, Please enter correct value......");
      int behave1 = scnr.nextInt();

    switch (behave1) {
      case 1 :
      System.out.println("Friend");
      break;
      case 2 :
      System.out.println("Formal");
      break;
      default :
      System.out.println("The program will terminate now because u did too much studpidity, and the creator of me is lazy to write code.");
      break;
    }
    }
  }
}
