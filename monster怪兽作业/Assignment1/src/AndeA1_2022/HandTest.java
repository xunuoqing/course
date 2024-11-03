package AndeA1_2022;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Class to test and provide example marks for the Hand class
 * 
 * DO NOT MODIFY
 *
 */
public class HandTest {
  public static int mark = 0;
  public static int totalMark = 0;

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    System.out.println("End All Tests");
    System.out.println("Mark For Hand Test: "+totalMark);
    System.out.println("csv,"+Card.emailID+",HAND,"+totalMark);
  }
  
  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
    //    System.out.println("End Test Set:"+mark);
    System.out.println(mark);
    totalMark+=mark;
    mark=0;
  }


  /**
   * Test method for {@link AndeA1_2022.Deck.Hand#Hand(Deck)}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testConstructor() {
    System.out.print("Test Constructor:");
    //test normal case
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      assertEquals("Hand Constructor:",100,(int)ToolKit.getVar(h1, "currentEnergy"));
      assertEquals("Hand Constructor:",0,(int)ToolKit.getVar(h1, "damageDealt"));mark++;
      assertEquals("Hand Constructor:",100,(int)ToolKit.getVar(h1, "currentHealth"));
      assertNotEquals("Hand Constructor:",null,(Object)ToolKit.getVar(h1, "cardDeck"));
      assertNotEquals("Hand Constructor:",null,(Object)ToolKit.getVar(h1, "hand"));mark++;
    }
  }


  /**
   * Test method for {@link AndeA1_2022.Hand#getCard(int)}.<p>
   * Test method for {@link AndeA1_2022.Hand#getEnergy()}.<p>
   * Test method for {@link AndeA1_2022.Hand#getHealth()}.<p>
   * Test method for {@link AndeA1_2022.Hand#getDamageDealt()}.<p>
   * Test method for {@link AndeA1_2022.Hand#numberOfCardsInHand()}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testGetMethods() {
    System.out.print("Test Get Methods:");
    //test normal case
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      // get low damage
      assertEquals("GetCard Method:","Card [name=Weak Punch, energyCost=5, valueDone=20, damage=true]",h1.getCard(0).toString());
      // get high damage
      assertEquals("GetCard Method:","Card [name=Critical Slash, energyCost=30, valueDone=250, damage=true]",h1.getCard(200).toString());
      mark++;
      assertEquals("getEnergy Method:",h1.getEnergy(),(int)ToolKit.getVar(h1, "currentEnergy"));
      assertEquals("getHealth Method:",100,h1.getHealth(),(int)ToolKit.getVar(h1, "currentHealth"));mark++;
      assertEquals("getDamageDealt Method:",h1.getDamageDealt(),(int)ToolKit.getVar(h1, "damageDealt"));
      assertEquals("NumberOfCardsInHand Method:",6,h1.numberOfCardsInHand());mark++;
    }
  }


  /**
   * Test method for {@link AndeA1_2022.Hand#getStrongest()}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testGetStrongest() {
    System.out.print("Test Get Strongest:");
    //test normal case
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      for (int i=0;i<6;i++) {
        h1.swapOutCard(i, new Card(i+1,i+10,true,"Card"+i));
      }
      assertEquals("getStrongest:","Card5",h1.getStrongest().getName());mark++;
    }

    //test all the same weight
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      for (int i=0;i<6;i++) {
        h1.swapOutCard(i, new Card(100,100,true,"Card"+i));
      }
      assertEquals("getStrongest:","Card0",h1.getStrongest().getName());mark++;
    }
  }




  /**
   * Test method for {@link AndeA1_2022.Hand#getStrongest(int)}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testGetStrongestInt() {
    System.out.print("Test Strongest <int>:");
    //test normal case
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      for (int i=0;i<5;i++) {
        h1.swapOutCard(i, new Card(i+1,i+10,true,"Card"+i));
      }
      assertEquals("getStrongestInt:","Card1",h1.getStrongest(2).getName());mark++;
    }

    //test same weight cards
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      for (int i=0;i<5;i++) {
        h1.swapOutCard(i, new Card(2,2,true,"Card"+i));
      }
      assertEquals("getStrongestInt:","Card0",h1.getStrongest(2).getName());mark++;
    }

    //none are suitable
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      for (int i=0;i<5;i++) {
        h1.swapOutCard(i, new Card(100,100,true,"Card"+i));
      }
      assertEquals("getStrongestInt:",null,h1.getStrongest(2));mark++;
    }
  }



  /**
   * Test method for {@link AndeA1_2022.Hand#toString()}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testToString() {
    System.out.print("Test ToString:");
    //test normal case
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      assertEquals("toString:","Hand [energy=100, health=100, hand=\nCard [name=Critical Slash, energyCost=30, valueDone=250, damage=true]\n"+
          "Card [name=Weak Punch, energyCost=5, valueDone=20, damage=true]\n"+
          "Card [name=Weak Punch, energyCost=5, valueDone=20, damage=true]\n"+
          "Card [name=Weak Punch, energyCost=5, valueDone=20, damage=true]\n"+
          "Card [name=Weak Punch, energyCost=5, valueDone=20, damage=true]\n"+
          "Card [name=Weak Punch, energyCost=5, valueDone=20, damage=true]\n"+
          "]",h1.toString());mark++;
    }
  }

  /**
   * Test method for {@link AndeA1_2022.Hand#play(int)}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testPlay() {
    System.out.print("Test Play:");
    //test normal case
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      for (int i=1;i<6;i++) {
        //should all be non nulls
        assertNotEquals("Play:",null,h1.play(i));mark++;
      }
    }
    //test shoulder case number of cards
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      assertEquals("Play:",null,h1.play(0));
      assertEquals("Play:",null,h1.play(7));mark++;
    }
    //test out of energy null returned
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      h1.swapOutCard(0, new Card(1000,1,true,"Card"));
      assertEquals("Play:",null,h1.play(1));mark++;
    }
    //test out of cards null returned
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      for(int i=0;i<44;i++) {
        d1.getRandomCard();
      }
      assertEquals("Play:",null,h1.play(1));mark++;
    }
    //test out of cards null returned shoulder condition 1 card left
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      //runs out at 95 100 cards - 5 in hand and 95 in deck.
      for(int i=0;i<43;i++) {
        d1.getRandomCard();
      }
      assertNotEquals("Play:",null,h1.play(1));mark++;
    }
    //test normal case
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      Card[] array = (Card[])ToolKit.getVar(h1, "hand");
      assertEquals("Play:","Critical Slash",array[0].getName());
      assertEquals("Play:","Weak Punch",array[1].getName());
      assertEquals("Play:","Weak Punch",array[2].getName());
      assertEquals("Play:","Weak Punch",array[3].getName());
      assertEquals("Play:","Weak Punch",array[4].getName());
      assertEquals("Play:","Weak Punch",array[5].getName());mark++;
    }
  }
  /**
   * Test method for {@link AndeA1_2022.Hand#powerOfHand()}.<p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testPowerOfHand() {
    System.out.print("Test Power Of Hand:");
    //test normal case
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      assertEquals("powerofhand:",350,h1.powerOfHand());mark++;
    }
  }


  /**
   * Test method for {@link AndeA1_2022.Hand#getCard(int)}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testGetCard() {
    //test normal case
	// bit of an overlap with other get tests but this class is important to get correct
    /*
     * Get the card that does the specified damage (or next greater) with 
     * the least mana used.  The card is removed from the hand.  
     * If there are two of equal value use the last one you find.<br>     * 
     */
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      Card[] value = new Card[5];
      value[0] = new Card(1,1,true,"A");
      value[1] = new Card(1,2,true,"B");
      value[2] = new Card(1,3,true,"C");
      value[3] = new Card(3,4,true,"D");
      value[4] = new Card(3,5,true,"E");
      ToolKit.setVar(h1, "hand", value);
      assertEquals("toString:","C",h1.getCard(3).getName());mark++;
    }
    //test should last in List
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      Card[] value = new Card[5];
      value[0] = new Card(1,1,true,"A");
      value[1] = new Card(1,2,true,"B");
      value[2] = new Card(1,3,true,"C");
      value[3] = new Card(3,4,true,"D");
      value[4] = new Card(3,5,true,"E");
      ToolKit.setVar(h1, "hand", value);
      assertEquals("toString:","E",h1.getCard(5).getName());mark++;
    }
    //test should first in List
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      Card[] value = new Card[5];
      value[0] = new Card(1,1,true,"A");
      value[1] = new Card(1,2,true,"B");
      value[2] = new Card(1,3,true,"C");
      value[3] = new Card(3,3,true,"D");
      value[4] = new Card(3,5,true,"E");
      ToolKit.setVar(h1, "hand", value);
      assertEquals("toString:","A",h1.getCard(1).getName());mark++;
    }
    //test all the same should get the first in the list
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      Card[] value = new Card[5];
      value[0] = new Card(1,1,true,"A");
      value[1] = new Card(1,1,true,"B");
      value[2] = new Card(1,1,true,"C");
      value[3] = new Card(1,1,true,"D");
      value[4] = new Card(1,1,true,"E");
      ToolKit.setVar(h1, "hand", value);
      assertEquals("toString:","A",h1.getCard(1).getName());mark++;
    }
    //test none suitable
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
      Card[] value = new Card[5];
      value[0] = new Card(1,1,true,"A");
      value[1] = new Card(1,1,true,"B");
      value[2] = new Card(1,1,true,"C");
      value[3] = new Card(1,1,true,"D");
      value[4] = new Card(1,1,true,"E");
      ToolKit.setVar(h1, "hand", value);
      assertEquals("toString:",null,h1.getCard(100));mark++;
    }
  }
}
