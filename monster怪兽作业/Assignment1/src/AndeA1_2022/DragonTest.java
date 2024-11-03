package AndeA1_2022;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Class to test and provide example marks for the Dragon class
 * 
 * DO NOT MODIFY
 *
 */
public class DragonTest {
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
	    System.out.println("Mark For Dragon Test: "+totalMark);
	    System.out.println("csv,"+Dragon.emailID+",Dragon,"+totalMark);
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
	   * Test method for {@link AndeA1_2022.Dragon#Dragon()}.<p>
	   * Tests<p>
	   * <ul>
	   * <li>
	   * </ul>
	   */
	  @Test
	  public final void testDefaultConstructor() {
	    System.out.print("Test Default Constructor:");
	    //test normal case
	    {
	      Dragon d1 = new Dragon();
	      assertEquals("Health:",1000,(int)ToolKit.getVar(d1, "health"));
	      assertEquals("Damage:",20,(int)ToolKit.getVar(d1, "damage"));mark++;
	    }
	  }
	  
	  /**
	   * Test method for {@link AndeA1_2022.Dragon#Dragon(int,int)}.<p>
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
	      Dragon d1 = new Dragon(500, 10);
	      assertEquals("Health:",500,(int)ToolKit.getVar(d1, "health"));
	      assertEquals("Damage:",10,(int)ToolKit.getVar(d1, "damage"));mark++;
	    }
	    //test erroneous input case negative value for health
	    {
    	  Dragon d1 = new Dragon(-1, 10);
    	  assertEquals("Health:",1000,(int)ToolKit.getVar(d1, "health"));
    	  assertEquals("Damage:",10,(int)ToolKit.getVar(d1, "damage"));mark++;
	    }
	    //test erroneous input case negative value for damage
	    {
    	  Dragon d1 = new Dragon(500, -1);
    	  assertEquals("Health:",500,(int)ToolKit.getVar(d1, "health"));
    	  assertEquals("Damage:",20,(int)ToolKit.getVar(d1, "damage"));mark++;
	    }	    
	  }
	  
	  /**
	   * Test method for {@link AndeA1_2022.Dragon#getHealth()}.<p>
	   * Test method for {@link AndeA1_2022.Dragon#getDamage()}.<p>
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
	      Dragon d1 = new Dragon(500,10);
	      //The get methods should return the same values as the instance variable
	      assertEquals("Health:",d1.getHealth(),(int)ToolKit.getVar(d1, "health"));
	      assertEquals("Damage:",d1.getDamage(),(int)ToolKit.getVar(d1, "damage"));
	      mark++;
	 	 }
	  }
	  

	  /**
	   * Test method for {@link AndeA1_2022.Dragon#takeDamage(int)}.<p>
	   * <p>
	   * <ul>
	   * <li>
	   * </ul>
	   */
	  @Test
	  public final void testTakeDamage() {
	    System.out.print("Test takeDamage:");
	    //test normal case
	    {
	      Dragon d1 = new Dragon();
	      d1.takeDamage(500);
	      assertEquals("Health:",500,(int)ToolKit.getVar(d1, "health"));
	      mark++;
	    }

	  }

	  /**
	   * Test method for {@link AndeA1_2022.Dragon#toString()}.<p>
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
	      Dragon d1 = new Dragon(500, 10);
	      //The get methods should return the same values as the instance variable
	      assertEquals("toString:","Dragon [health=500, damage=10]",d1.toString());mark++;
	    }

	  }
}
