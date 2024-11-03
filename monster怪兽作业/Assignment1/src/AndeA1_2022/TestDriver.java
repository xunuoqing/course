package AndeA1_2022;
/**
 * Simple class to try out concepts in your code. 
 * This is not a test class just a simple test program 
 * to make sure the basic code works. (Game is not tested here). <br>
 * <br>
 * You should just use this to see how the code works<br>
 * <br>
 * Read the Assignment Class for Assignment Specification<br> 
 * @author Ben Volmer and Stewart Von Itzstein
 *
 */
public class TestDriver {

  /**
   * @param args arguments from command line
   */
  public static void main(String[] args) {


    Deck deck = new Deck(false);  //turning off random the program will work the same way every time.
    System.out.println(deck);
    Hand hand = new Hand(deck);
    
    System.out.println(hand);
    
    Dragon dragon = new Dragon();
   
    // testing a hand and dragon dealing damage to each other until the player runs out of cards to draw
    for (int i=0;i<1000;i++) {
      Card current = hand.play(1);
      if (current==null&&deck.getCardsRemaining()==0) {
        System.out.println("Out of Cards");
        break;
      }
      if (current!=null) {
        System.out.println(current);
      } else {
        System.out.println("Bad Play (null)");
      }
      dragon.takeDamage(hand.getDamageDealt());
      hand.takeDamage(dragon.getDamage());
    }
    System.out.println("FINAL CARD  Damage Dealt in Game:"+hand.getDamageDealt());
    System.out.println("Total Energy Remaining:"+hand.getEnergy());
    
    System.out.println("Dragon health (will be negative)" + dragon.getHealth());
    System.out.println("Player health (will be negative)" + hand.getHealth());
  }
}
