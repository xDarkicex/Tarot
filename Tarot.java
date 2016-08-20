import java.io.Console;

public class Tarot{
  private Console console = System.console();
  String input = console.readLine();
  public void run(){
  Writer.say(input);
  //why doesnt this work?
};

  private static Tarot reading = new Tarot();
  public static void main(String args[]){ reading.run(); }
};
