import java.util.*;
public class GPBCBChatbotRE {
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

    if (behave == 1){
    System.out.println("Switching to Formal Behaviour");
    formal();
    }
    else if (behave == 2){
    System.out.println("Switching to Friendly Behaviour.....");
    friend();
    }
    else{
    System.out.println("Sorry i don't get that");
    }
    
}
  static void friend(){
    System.out.println("Well from on you are my friend if you like that");
    System.out.println("I think i have already asked a lot of questions from you friend");
    System.out.println("One more : Would you like to hear a joke ?");
    Scanner scnr1 = new Scanner (System.in);
    String joke = scnr1.nextLine();
    String JOKE = joke.toUpperCase();
    if (JOKE == "YES"||JOKE == "Y"){
      System.out.println("I forgot the joke");
    }
    else if (JOKE == "NO"||JOKE == "N"){
      System.out.println("As you wish");
    }
    else{
      System.out.println("That does not make sense to me");
    }
    return;
  }
  static void formal(){
    System.out.println("At your service Genetleman if you insist.");
    System.out.println("I feel like that i do have asked a lot of questions from you sir");
    System.out.println("Gentleman, May i present quote to you");
    Scanner scnr2 = new Scanner (System.in);
    String quote = scnr2.nextLine();
    String QUOTE = quote.toUpperCase();
    if (QUOTE == "YES"||QUOTE == "Y"){
      System.out.println("Here it goes...I Forgot");
    }
    else if (QUOTE == "NO"||QUOTE == "N"){
      System.out.println("As you wish");
    }
    else{
      System.out.println("That does not make sense to me");
    }
    return;
  }
}
