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
      System.out.println("Nice to meet you : "+usrname);
      System.out.println("So, Choose how would you like me to behave.....(1/2)");
      System.out.println("1. Formal and Well Behaving.");
      System.out.println("2. Friend-like and Chaotic.");
    int behave = scnr.nextInt();

    if(behave == 1){
        Friend();
      }
    else if(behave == 2){
        Formal();
      }
    else{
        System.out.println("Not an Option, 1 more try.....");
      }
  }
  static void Friend(){
    System.out.println("#So Friend, What do you wanna be in the future you must have some dream right ?#");
    System.out.println("#Here is a list of occupations you may choose anyone from (1/2/3/4/5/6/7/8/9/10)#");
    System.out.println("#1. Doctor#");
    System.out.println("#2. Engineer#");
    System.out.println("#3. Scientist#");
    System.out.println("#4. Actor#");
    System.out.println("#5. Lawyer#");
    System.out.println("#6. Singer#");
    System.out.println("#7. Dancer#");
    System.out.println("#8. Business Man#");
    System.out.println("#9. Pilot#");
    System.out.println("#10. Army#");
    System.out.println("#11. Out of List#");
    Scanner scnr = new Scanner(System.in);
    int future = scnr.nextInt();
  }

  static void Formal(){
    System.out.println("Gentleman, Where do you see yourself in the future if you'd like to tell me ?");
    System.out.println("#Here is a list of occupations you may choose anyone from (1/2/3/4/5/6/7/8/9/10)#");
    System.out.println("#1. Doctor#");
    System.out.println("#2. Engineer#");
    System.out.println("#3. Scientist#");
    System.out.println("#4. Actor#");
    System.out.println("#5. Lawyer#");
    System.out.println("#6. Singer#");
    System.out.println("#7. Dancer#");
    System.out.println("#8. Business Man#");
    System.out.println("#9. Pilot#");
    System.out.println("#10. Army#");
    System.out.println("#11. Out of List#");
    Scanner scnr = new Scanner(System.in);
    int future1 = scnr.nextInt();
  }
}
