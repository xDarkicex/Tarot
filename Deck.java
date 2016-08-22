public class Deck {
  public enum Card{
    //Main Arcaina
    THEFOOL("The Fool", "Let go of expectations and trust your instincts.", "Let yourself be spontaneous enough to stretch beyond the realm of logic. There is no advantage to be gained by thinking you possess the knowledge, power, or control to direct reality. Open and receive without question, instead of trying to manage what's happening right now. The Fool has no ambition to manipulate a specific outcome. Just be happy to be part of the whole."),
    THEEMPEROR("The Emperor", "You have the wisdom and authority to achieve your goals.", "You have the necessary abilities to be the final authority. This situation is an opportunity to showcase your competence and skill. Act with the confidence of someone who knows how to take care of business."),
    STRENGTH("Strength", "Balance your primal force with intution and compassion.", "Demand and expect the same from others who have some power in this situation. You cannot challenge them to live to a higher standard if you, yourself, have not yet done so. Influence others by setting an example of integrity. Your self-esteem will increase to the degree that you succeed in your efforts."),
    THEHANGEDMAN("The Hanged Man", "You have reached a crossroads, making it possible to clear the slate and start over.", "Stop resisting your circumstances and let some time go by. Eventually, you will be released a little wiser and not much the worse for wear. You will come to realize in time how you collaborated with the problem. However, the issues you were stuck on when you were first hung up have subsided and no longer concern you. You are free to take up new endeavors. You will ultimately feel refreshed and grateful that you were derailed from your former track."),
    THETOWER("The Tower", "Because of circumstances beyond your control, you have no choice.", "Now you may be at the forefront, acknowledging and accepting the bracing presence of the future bursting in on the present. Try to mediate the harsher parts of the changes as they unfold, so the most vulnerable are the most cushioned. Acknowledge yourself, as well as the others in your life, who are offering their resources to usher in a better future."),
    JUDGEMENT("Judgement", "You have the power to make changes and feel complete.", "It's not necessary to reject others, but refuse to be manipulated by those who cry foul. This process isn't about them anyway. It is about you and the desire you feel to change your life and become a more complete person. Trust your impulses and allow this remarkable awakening to happen."),
    THEMAGICIAN("The Magician", "Be creative and stay open -- your possibilities are endless.", "You do not have to understand it all intellectually. Besides, intuition is your ace in the hole. Respond in a spontaneous manner to what is right in front of you. There is no reason to hold yourself back. Your natural urges are exactly what is needed, and, your ingenuous timing and elegant style will help smooth over any awkwardness."),
    THEHIEROPHANT("The Hierophant", "Expand your inner knowledge and share it with others.", "Earn respect and recognition by completing your education and broadening your experience. If you already have all the necessary experience you need, then rewrite your resume so others can appreciate who you are and what you can bring to a situation. Focus on your goal and be determined. You may be destined to be a master in your realm."),
    THEHERMIT("The Hermit", "Gaze into the mysteries of your inner life.", "Now may be the moment for you to tell everyone to leave you alone. When you are fully ready, you will be able and willing to give others what they need."),
    DEATH("Death", "Shed the old to make room for the new.", "Do not allow nostalgia and outworn loyalties to hold you back. Be willing to go through whatever it takes to get to where you really want to be."),
    THESTAR("The Star", "Rise above your day-to-day and connect with the divine.", "Now is a period for quiet contemplation. Listen for the voice within. Anything that would interfere with this communion may not be serving your best interests right now."),
    THEWORLD("The World", "You are in a timeless state of grace where all is well.", "What matters is divine intention. Whether or not human beings approve is less important. If you allow your ego to inflate, however, you cease to be useful to the greater plan."),
    THEHIGHPRIESTESS("The High Priestess", "Get your self out of the way and become attuned to a more spiritual view.", "Until you consider this as vital to your well-being as the need to eat and sleep, you are likely to be eternally restless and deeply dissatisfied. A spiritual routine that suits your temperament, practiced every day, is the most trustworthy path to freedom."),
    THELOVERS("The Lovers", "Integrate two potential realities or let go of one of them.", "Be willing to make some compromises, then stick with the commitments you finally make. Trust your intuition along with your rational intellect, and once you make your choice, carry it out with conviction."),
    WHEELOFFORTUNE("Wheel of Fortune", "Learn to go with the flow without resisting ups and downs.", "This is a safe place for you to be. You are watched over and protected as you go round and round the wheel. You will learn a lot. You will also learn it quickly, and what you absorb will benefit you for a long time to come."),
    TEMPERANCE("Temperance", "The time is now for self-healing.", "Prepare to use spiritual practices, studies, or lifestyle changes that can assist you in your quest. A tremendous amount of benefit is available if you can organize yourself and be disciplined at this time."),
    THEMOON("The Moon", "This is an opportunity to draw messages from your inner self.", "The everyday mind may not be prepared for strange oceanic circumstances. Plus, it has no game plan. Your intuitive body will support you unerringly if you do not interfere with or try to control what you perceive. A better approach would be to meditate. Try to just be a witness. Do nothing; let nature carry you forward. This may be your best option in this situation."),
    THEEMPRESS("The Empress", "Look for opportunities to be generous, warm, and nurturing.", "Demonstrate this through caring actions, a forgiving and generous attitude, and wise understanding of others' needs and struggles. Bring a healing influence to the current situation and take full credit for the supportive part you play."),
    THECHARIOT("The Chariot", "Use your powers of freedom and flexibility to drive your future.", "You may be asked to live out of a suitcase and consider every place your home for a while. Be receptive to new people who come into your life. Most especially, become more fluid and taste the joys of freedom. The Charioteer is nothing if not self-sufficient. Be prepared and self-contained for the changes that will sweep in and carry you with them."),
    JUSTICE("Justice", "Balance the scales to support truth and serve the greatest good.", "As you witness people's account of themselves, your understanding will go beyond the words you hear. Subtle inferences and clues will reveal the truths that will enable you to make a wise and accurate assessment."),
    DEVIL("Devil", "Put subtlety aside and empower your passion and confidence.", "Assert your agenda, express yourself honestly, and let the chips fall where they may. Your best bet could be to express your true emotions, possibly even including anger. Acknowledge that you have whatever feelings you have. While it may not be necessary to act out what you feel in every situation, accepting the power and depth of your inner experience enables you to remain true to yourself."),
    THESUN("The Sun", "You are in the right place at the right time.", " Step into the full light of truth and reveal your motives and principles. Once done, you will no longer give away power to the people that criticize and shame you. Focus on the positive and the real. Your authentic shining self can be a light for others if you project it without contrivance."),
    ACEOFWANDS("Ace of Wands", "Stay attentive to your goal even as change accelerates.", "You may need to make your move soon, so make sure you are fully prepared. Trust your instincts and spontaneity. When the opportunity comes you may want to seize it without hesitation. So quicken your senses and raise you"),
    TWOOFWANDS("Two of Wands", "Assess your situation with patience and self-restraint.", "Keep meditating, watching the situation and witnessing the forces at work. At some point you will have enough information to see clearly. The decision-making process will be over and the choice will be clear."),
    THREEOFWANDS("Three of Wands", "You are prepared to take risks to explore new opportunities or enterprises.", "Every fiber of your being may be saying this is a great opportunity, even if those around you aren't as convinced. There's nothing to lose from taking a risk; this is a great moment in your entrepreneurial growth. Make your move and sort out the details later."),
    FOUROFWANDS("Four of Wands", "When you act upon a shared vision it will have far reaching effects.", "Your enthusiasm empowers your vision, which is thriving with possibilities. As you share more freely what is on your mind and in your heart, others will see themselves in your vision, so you naturally receive approval, support, assistance and abundance. In your own way, you are addressing a universal need."),
    FIVEOFWANDS("Five of Wands", "Let your focus be on advancing your cause.", "Identify what energizes you, what you would fight for and what you are passionate about -- even when you're tired or discouraged. Strive to make that the centerpiece of your mission. This is how you find your livelihood and establish your path of service."),
    SIXOFWANDS("Six of Wands", "Your enthusiastic stewardship is producing dramatic results.", "You may find yourself becoming something of a leader. Usually the first person to break away from conventional thought is the one to define a new trend. Under the circumstances, there is a solid need for a fresh voice and vision -- so make your move. Those around you who are ready for change will support your leadership."),
    SEVENOFWANDS("Seven of WAnds", "A positive attitude and strong potential will prime you to achieve your personal best.", "Even if slightly unprepared, you may want to push yourself beyond your usual limits, thinking in larger terms and tweaking your competitive nature. Time and effort spent in preparation could pay off handsomely. You might be the one who vaults right over the heads of those who thought they could outdo you. Move beyond rhetoric and verbal challenges. Now could be the moment to prove what puts you head and shoulders above the rest by demonstrating it in action."),
    EIGHTOFWANDS("Eight of Wands", "Accelerating growth challenges you to keep up with what you are creating in your life.", "Even if you had to leave it all behind, you know you could start all over among total strangers and succeed once again. This valuable self-confidence makes you free to strike out in new directions and not just cling to past successes and previous accomplishments."),
    NINEOFWANDS("Nine of Wands", "Find someone who can fill in for you and take time to refresh your energy.", "There is nothing more to bring to the mission unless you regenerate and restore the energy you have put into the cause. While it is praiseworthy to give all you have for something or someone that means a lot to you, masochism and martyrdom are ill advised. Take a break. No one can fault you for it now."),
    TENOFWANDS("Ten of Wands", "You are beginning to realize that what you have been pursuing is actually internal.", " Now may be the time to reach deep into yourself and identify your purest, most wholesome impulses. As you do this, allow your optimistic and honorable side to see what's good about the world. Look beyond the challenges, setbacks, disappointments and frustrations you tend to see so easily. As you reawaken your high minded inner child, you will refresh your daily life with a joyful purpose."),
    PAGEOFWANDS("Page of Wands", "You are an agent of innovation and change.", "Think of yourself as a secret agent for the greater good. In due time, others may recognize the role you play in the transformation from divisiveness to unity. However, right now you are being asked to watch quietly from the sidelines."),
    KNIGHTOFWANDS("Knight of Wands", "A new journey of discovery is about to be embarked upon.", "Not only can you get a clear sense of the proper path, but you will also have enough instructions to be self-directing. Necessary skills and resources are available to you, and the time is right for you to act. Once you get started, you may be surprised how easy it can feel, but don't be seduced by that feeling. There will be comfortable stretches of the road and there will be distinctly uncomfortable ones. Know that any form of motion is better than no motion."),
    QUEENOFWANDS("Queen of Wands", "Decisiveness and a willingness to lead produce tangible rewards.", "A perceived deficiency in leadership may make you want to take hold of the reins, but don't do it! Restrain yourself and remain loyal to your higher-ups. Stay focused and energetic. Enthusiastically confront the challenges directly in front of you. Perform in good faith and encourage others to do the same."),
    KINGOFWANDS("King of Wands", "Stay balanced and use power wisely to set a good example.", "You are the determining factor in this situation and circumstances will proceed in the direction that you steer them. Indecision or doubt are not appropriate responses when clarity and confidence are critical. As you take on a bigger role, it will begin to feel more comfortable. Seize the opportunity to influence events, because everything is waiting for you.");
    // ("", "", ""),
    // ("", "", ""),
    // ("", "", ""),
    // ("", "", "");
    String name;
    String description;
    String intro;
    Card(String name, String intro, String description) {
      this.name = name;
      this.intro = intro;
      this.description = description;
    }
    public String toString() { return name+"\n"+intro+"\n"+description; }
  }
  private Card[] deck = new Card[]{
    Card.THEFOOL,
    Card.THEEMPEROR,
    Card.STRENGTH,
    Card.THEHANGEDMAN,
    Card.JUDGEMENT,
    Card.THETOWER,
    Card.KINGOFWANDS,
    Card.THEMAGICIAN,
    Card.THEHIEROPHANT,
    Card.THEHERMIT,
    Card.THESTAR,
    Card.THEWORLD,
    Card.THEMOON,
    Card.THESUN,
    Card.DEATH,
    Card.ACEOFWANDS,
    Card.THEHIGHPRIESTESS,
    Card.THELOVERS,
    Card.WHEELOFFORTUNE,
    Card.QUEENOFWANDS,
    Card.TEMPERANCE,
    Card.THECHARIOT,
    Card.DEVIL,
    Card.THEEMPRESS,
    Card.TWOOFWANDS,
    Card.THREEOFWANDS,
    Card.FOUROFWANDS,
    Card.FIVEOFWANDS,
    Card.SIXOFWANDS,
    Card.SEVENOFWANDS,
    Card.EIGHTOFWANDS,
    Card.NINEOFWANDS,
    Card.TENOFWANDS,
    Card.PAGEOFWANDS,
    Card.KNIGHTOFWANDS,
  };
  private int seed;
  Deck(int seed) {
    this.seed = seed;
  }
  public Card draw() {
    return deck[(int)(Math.random()*deck.length)];
  }
}
