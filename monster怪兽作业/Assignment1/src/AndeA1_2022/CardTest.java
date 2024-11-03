package AndeA1_2022;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Class to test and provide example marks for the Card class
 * 
 * DO NOT MODIFY
 *
 */
public class CardTest {
  public static int mark = 0;
  public static int totalMark = 0;

  /**
   * 
   * @throws java.lang.Exception on error
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  /**
   * @throws java.lang.Exception on error
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    System.out.println("End All Tests");
    System.out.println("Mark For Card Test: "+totalMark);
    System.out.println("csv,"+Card.emailID+",CARD,"+totalMark);
  }

  /**
   * @throws java.lang.Exception  on error
   */
  @Before
  public void setUp() throws Exception {}

  /**
   * @throws java.lang.Exception on error
   */
  @After
  public void tearDown() throws Exception {
    //    System.out.println("End Test Set:"+mark);
    System.out.println(mark);
    totalMark+=mark;
    mark=0;
  }


  
  /**
   * Test method for {@link AndeA1_2022.Card()}.<p>
   * Testing that email ID is correct<p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testEmailID() {
    System.out.print("Test EmailID:");
    //test student put a sensible email id in
    {
      Card var = new Card(1,1,true,"X");
      String emailID =  (String)ToolKit.getVar(var, "emailID");    
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
   * Test method for {@link AndeA1_2022.Card#Card(int,int,boolean,String)}.<p>
   * Tests<p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testConstructor() {
    System.out.print("Test Constructor:");
    //test normal case
    {
      Card c1 = new Card(10,99,true,"x");
      assertEquals("Name:","x",(String)ToolKit.getVar(c1, "name"));
      assertEquals("Energy:",10,(int)ToolKit.getVar(c1, "energyCost"));
      assertEquals("Value:",99,(int)ToolKit.getVar(c1, "valueDone"));
      assertEquals("Damage:",true,(boolean)ToolKit.getVar(c1, "damage"));mark++;
    }
    //test erroneous input case negative value for energy
    {
      Card c1 = new Card(-1,99,true,"x");
      assertEquals("Mana:",1,(int)ToolKit.getVar(c1, "energyCost"));//should be 1
      assertEquals("Value:",99,(int)ToolKit.getVar(c1, "valueDone"));
      assertEquals("Damage:",true,(boolean)ToolKit.getVar(c1, "damage"));mark++;
    }
    //test erroneous input case negative value for value Done
    {
      Card c1 = new Card(10,-100,true,"x");
      assertEquals("Value:",1,(int)ToolKit.getVar(c1, "valueDone"));//should be 1
      mark++;
    }
    //test shoulder condition 0 mana Done
    {
      Card c1 = new Card(0,99,true,"x");
      assertEquals("Mana:",0,(int)ToolKit.getVar(c1, "energyCost"));//should be 0
      assertEquals("Value:",99,(int)ToolKit.getVar(c1, "valueDone"));mark++;
    }
    //test shoulder condition 0 damage Done
    {
      Card c1 = new Card(10,0,true,"x");
      assertEquals("Value:",0,(int)ToolKit.getVar(c1, "valueDone"));//should be 0
      mark++;
    }
    
  }
  
  /**
   * Test method for {@link AndeA1_2022.Card#getName()}.<p>
   * Test method for {@link AndeA1_2022.Card#getEnergyCost()}.<p>
   * Test method for {@link AndeA1_2022.Card#getValueDone()}.<p>
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
      Card c1 = new Card(10,99,true,"x");
      //The get methods should return the same values as the instance variable
      assertEquals("Name:",c1.getName(),(String)ToolKit.getVar(c1, "name"));
      assertEquals("Mana:",c1.getEnergyCost(),(int)ToolKit.getVar(c1, "energyCost"));
      assertEquals("Value:",c1.getValueDone(),(int)ToolKit.getVar(c1, "valueDone"));
      assertEquals("Is Damage:", c1.getDamage(), (boolean)ToolKit.getVar(c1,  "damage"));mark++;
    }
  }

  /**
   * Test method for {@link AndeA1_2022.Card#toString()}.<p>
   * <p>
   * <ul>
   * <li>
   * </ul>
   */
  @Test
  public final void testToString() {
    System.out.print("Test toString:");
    //test normal case
    {
      Card c1 = new Card(10,99,true,"x");
      //The get methods should return the same values as the instance variable
      assertEquals("toString:","Card [name=x, energyCost=10, valueDone=99, damage=true]",c1.toString());mark++;
    }
  }
}
