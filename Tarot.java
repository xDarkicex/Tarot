import java.io.Console;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;
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
    name_value = (int)(1.5 + (double)name.toCharArray().length);
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
    age_value = (int)((double)name_value + 100.00);
    Writer.say("What is your Gender");
    String[] genders = new String[]{"Male", "Female"};
    int choice = Interaction.choose(genders);
    gender = genders[choice-1];
    gender_value = (int)((double)age_value + (double)name_value + choice);
    confirm();

  }
  public void start() {
    int seed = (name_value + age_value + gender_value + Calendar.getInstance(TimeZone.getDefault()).get(Calendar.DAY_OF_YEAR)) / age;
    deck = new Deck(seed);
    String[][] titles = new String[][]{{"Hear Me",Writer.ANSI_RED}, {"Help Me",Writer.ANSI_PURPLE}, {"Hold Me",Writer.ANSI_CYAN}};
    while(true){
      for(int i = 0; i < 3; i++){
        Writer.with(titles[i][0],titles[i][1]);
        // Writer.say(deck.draw());
        deck.draw().write();
      };
      Writer.yellow("Continue?");
      if(Interaction.choose(new String[]{"Yes","No"}) == 2) { break; }
    }
  }
  public void confirm(){
    Writer.say("Name: ["+name+"]"+"\n"+"Name Value: ["+name_value+"]"+"\n"+"Age: ["+age+"]"+"\n"+"Age Value: ["+age_value+"]"+"\n"+"Gender: ["+gender+"]"+"\n"+"Gender Value: ["+gender_value+"]");
    Writer.say("confirm options?");
    int input = Interaction.choose(new String[]{"Yes","No"});
    // At this point, we should have a valid option.
    switch(input) {
      // read cards
      case 1:
        Tarot.clear_screen();
        start();

        break;
      // reenter values
      case 2:
        init();
        break;
    }
  }
  public static void clear_screen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
     }
  private static Tarot reading = new Tarot();
  public static void main(String args[]){
    reading.init();
    Tarot.clear_screen();

  }

}
