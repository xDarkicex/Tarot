import java.io.Console;

public class Tarot{
  private Console console = System.console();
  String name;
  int age;
  String gender;
  int name_value;
  int age_value;
  int gender_value;
  Deck deck;
  public void init(){
    Writer.say("What is your name?");
    name = console.readLine();
    name_value = (int)(1.5 + 100.00 * Math.random());
    // converts age input into int
    while(true) {
      Writer.say("What is your age?");
      String raw_age = console.readLine();
      try {
        age = Integer.parseInt(raw_age);
        // Double.parseDouble();
        break;
      } catch(NumberFormatException e) { Writer.red("Invalid input, enter an integer."); }
    }
    age_value = (int)((double)name_value + 100.00 * Math.random());
    Writer.say("What is your Gender");
    gender = console.readLine();
    gender_value = (int)((double)age_value + (double)name_value + (double)gender.toCharArray().length * Math.random());
    confirm();

  }
  public void start() {
    int seed = (name_value + age_value + gender_value) / age;
    Writer.say(seed);
    deck = new Deck(seed);
    String[] titles = new String[]{"Hear Me", "Help Me", "Hold Me"};
    while(true){
      for(int i = 0; i < 3; i++){ Writer.blue(titles[i]); Writer.say(deck.draw()); };
      Writer.yellow("Continue?");
      if(Interaction.choose(new String[]{"Yes","No"}) == 2) { break; }
    }
  }
  public void confirm(){
    Writer.say("Name: ["+name+"]"+"\n"+"Name Value: ["+name_value+"]"+"\n"+"Age: ["+age+"]"+"\n"+"Age Value: ["+age_value+"]"+"\n"+"Gender: ["+gender+"]"+"\n"+"Gender Value: ["+gender_value+"]");
    Writer.say("Say confirm options?");
    int input = Interaction.choose(new String[]{"Yes","No"});
    // At this point, we should have a valid option.
    switch(input) {
      // read cards
      case 1:
        start();
        break;
      // reenter values
      case 2:
        init();
        break;
    }
  }

  private static Tarot reading = new Tarot();
  public static void main(String args[]){
    reading.init();
  }

}
