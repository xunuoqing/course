package AndeA1_2022;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Class to test and provide example marks for the Deck class
 * 
 * DO NOT MODIFY
 *
 */
public class DeckTest {
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
    System.out.println("Mark For Deck Test: "+totalMark);
    System.out.println("csv,"+Card.emailID+",DECK,"+totalMark);
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
   * Test method for {@link AndeA1_2022.Deck#Deck(boolean)}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testConstructor() {
    System.out.print("Test Constructor:");

    //test random set
    {
      assertEquals("Constructor:",true,(boolean)ToolKit.getVar(new Deck(true), "random"));
      assertEquals("Constructor:",false,(boolean)ToolKit.getVar(new Deck(false), "random"));
    }



    //test cards are being created as required
    {
      Deck d1 = new Deck(true);
      Card[] cards = (Card[])ToolKit.getVar(d1, "cards");

      assertEquals("Constructor:",30,cards[0].getEnergyCost());
      assertEquals("Constructor:",50,cards[4].getEnergyCost());
      assertEquals("Constructor:",50,cards[7].getEnergyCost());
      assertEquals("Constructor:",30,cards[10].getEnergyCost());
      assertEquals("Constructor:",30,cards[17].getEnergyCost());
      assertEquals("Constructor:",50,cards[24].getEnergyCost());
      assertEquals("Constructor:",40,cards[28].getEnergyCost());
      assertEquals("Constructor:",10,cards[32].getEnergyCost());
      assertEquals("Constructor:",5,cards[36].getEnergyCost());
      assertEquals("Constructor:",5,cards[40].getEnergyCost());
      assertEquals("Constructor:",5,cards[45].getEnergyCost());
      assertEquals("Constructor:",5,cards[49].getEnergyCost());mark+=2;

      assertEquals("Constructor:",250,cards[0].getValueDone());
      assertEquals("Constructor:",175,cards[4].getValueDone());
      assertEquals("Constructor:",150,cards[7].getValueDone());
      assertEquals("Constructor:",125,cards[10].getValueDone());
      assertEquals("Constructor:",100,cards[17].getValueDone());
      assertEquals("Constructor:",75,cards[24].getValueDone());
      assertEquals("Constructor:",50,cards[28].getValueDone());
      assertEquals("Constructor:",45,cards[32].getValueDone());
      assertEquals("Constructor:",30,cards[36].getValueDone());
      assertEquals("Constructor:",20,cards[40].getValueDone());
      assertEquals("Constructor:",20,cards[45].getValueDone());
      assertEquals("Constructor:",20,cards[49].getValueDone());mark+=2;

    }
  }


  /**
   * Test method for {@link AndeA1_2022.Deck()}.<p>
   * Testing that email ID is correct
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testEmailID() {
    System.out.print("Test Email ID:");
    //test student put a sensible email id in
    {
      Deck d1 = new Deck(false);
      String emailID =  (String)ToolKit.getVar(d1, "emailID");    
      assertTrue("checkEmailID:Wrong Length", emailID.length()==8);
      for (int i=5;i<8;i++) {
        assertTrue("checkEmailID:Non Number Found in Number Part:"+i, Character.isDigit(emailID.charAt(i)));
      }
      for (int i=0;i<5;i++) {
        assertTrue("checkEmailID:Non Letter Found in Letter Part:"+i, Character.isAlphabetic(emailID.charAt(i)));
      }
    }
    mark++;
  }



  /**
   * Test method for {@link AndeA1_2022.Deck()}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testInstanceVariables() {
    System.out.print("Test Instance Variables:");

    //test cards not null
    {

      Deck d1 = new Deck(false);
      Card[] cards = (Card[])ToolKit.getVar(d1, "cards");
      assertNotEquals("cards never null:",null,cards);mark++;
    }
  }


  /**
   * Test method for {@link AndeA1_2022.Deck#getCardsRemaining()}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testGetCardsRemaining() {
    System.out.print("Test GetCardsRemaining:");

    //test cards remaining counter
    {
      Deck d1 = new Deck(true);
      //THIS TEST DEPENDS ON getRandomCard Working
      d1.getRandomCard();
      d1.getRandomCard();
      d1.getRandomCard();
      Card[] cards = (Card[])ToolKit.getVar(d1, "cards");mark++;

      //removed and discarded 3 cards
      assertEquals("getCardsRemaining:",47,(int)ToolKit.getVar(d1, "cardsRemaining"));mark++;
    }
    //check should condition (1 left) and then empty
    {
      Deck d1 = new Deck(true);
      //THIS TEST DEPENDS ON getRandomCard Working


      //removed and discarded all but one card
      for (int i=0;i<49;i++) {
        d1.getRandomCard();
      }
      assertEquals("getCardsRemaining:",1,(int)ToolKit.getVar(d1, "cardsRemaining"));mark++;
      Card[] cards = (Card[])ToolKit.getVar(d1, "cards");
      assertEquals("getCardsRemaining:",null,((Card[])ToolKit.getVar(d1, "cards"))[1]);mark++;

      //remove last card
      d1.getRandomCard();
      assertEquals("getCardsRemaining:",null,((Card[])ToolKit.getVar(d1, "cards"))[0]);mark++;
      assertEquals("getCardsRemaining:",0,(int)ToolKit.getVar(d1, "cardsRemaining"));mark++;
    }

  }



  /**
   * Test method for {@link AndeA1_2022.Deck#shuffle()}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testShuffle() {
    System.out.print("Test Shuffle(no marks):");

    //test normal case
    //Intentionally not implemented.
    {
      Deck d1 = new Deck(false);
      Hand h1 = new Hand(d1);
    }
  }



  /**
   * Test method for {@link AndeA1_2022.Deck#toString()}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testToString() {
    System.out.print("Test ToString:");

    //test normal case
    //check should condition (1 left) and then empty
    {
      Deck d1 = new Deck(false);
      //THIS TEST DEPENDS ON getRandomCard Working
      for (int i=0;i<49;i++) {
        d1.getRandomCard();
      }

      String result = d1.toString();
      assertEquals("ToString:","Deck [\n1:Card [name=Critical Slash, energyCost=30, valueDone=250, damage=true]\n]",result);mark++;

      //removed and discarded all but one card
      Card[] cards = (Card[])ToolKit.getVar(d1, "cards");

      //remove last card
      d1.getRandomCard();
      String result2 = d1.toString();
      //      System.out.println(d1);
      assertEquals("ToString:",0,(int)ToolKit.getVar(d1, "cardsRemaining"));mark++;
      assertEquals("ToString:","Deck [\n]",result2);mark++;
    }
  }
}


