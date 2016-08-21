import java.io.Console;

public class Tarot{
  private Console console = System.console();
  public void init(){

      Writer.say("What is your name?");
      String name = console.readLine();
      Writer.say("What is your age?");
      String age = console.readLine();
      Wrtier.say("What is your Gender");
      String gender = console.readLine();
  public static String information(){
    Writer.say("Name: ["+name+"]");
    Writer.say("Say confirm options?");

  };
  //why doesnt this work?
};

  private static Tarot reading = new Tarot();
  public static void main(String args[]){ reading.init(); }
};
