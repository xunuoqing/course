package AndeA1_2022;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Class to test and provide example marks for the Game class
 * 
 * DO NOT MODIFY
 *
 */
public class GameTest {

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
	    System.out.println("Mark For Game Test: "+totalMark);
	    System.out.println("csv,"+Game.emailID+",GAME,"+totalMark);
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
	   * Test method for {@link AndeA1_2022.Game#Game(boolean)}.<p>
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
	   
	      Game g1 = new Game(false);
	      assertNotEquals("Hand:",null,ToolKit.getVar(g1, "hand"));
	      assertNotEquals("Deck:",null, ToolKit.getVar(g1, "deck"));
	      assertNotEquals("Dragon:",null, ToolKit.getVar(g1, "dragon"));
	      assertEquals("Turn:",0,(int)ToolKit.getVar(g1, "turn"));
	      assertEquals("GameOver:",false,(boolean)ToolKit.getVar(g1, "gameOver"));
	      mark++;
	      
	    }
	    
	  }
	  
	
	  

	  /**
	   * Test method for {@link AndeA1_2022.Game#toString()}.<p>
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
	      Game g1 = new Game(false);
	      assertEquals("toString:","Game [Player health: 100, Dragon health: 1000, Turn: 0]",g1.toString());mark++;
	    }
	  }
	  
	  /**
	   * Test method for {@link AndeA1_2022.Game#checkWinner()}.<p>
	   * <p>
	   * <ul>
	   * <li>
	   * </ul>
	   */
	  @Test
	  public final void testCheckWinner() {
	    System.out.print("Test checkWinner:");
	    //test player win case
	    {
	      Game g1 = new Game(false);
	      g1.getDragon().takeDamage(1000);
	      assertEquals("Player wins:","player",g1.checkWinner());mark++;
	    }
	    //test dragon win cases
	    {
	    	Game g1 = new Game(false);
	    	g1.getHand().takeDamage(100);
	    	assertEquals("Dragon wins:","dragon",g1.checkWinner());
	    	
	    	// test deck out
	    	g1 = new Game(false);
	    	for(int i=0;i<44;i++) {
	    	      g1.getHand().swapOutCard(1);
	    	   }
	    	assertEquals("Dragon wins:","dragon",g1.checkWinner());mark++;
	    }
	    // test rare draw condition
	    {
	    	Game g1 = new Game(false);
	    	g1.getHand().takeDamage(100);
	    	g1.getDragon().takeDamage(1000);
	    	assertEquals("Tie:","tie",g1.checkWinner());mark++;
	    }
	  }
	  
	  /**
	   * Test method for {@link AndeA1_2022.Game#playGame()}.<p>
	   * <p>
	   * <ul>
	   * <li>
	   * </ul>
	   */
	  @Test
	  public final void testPlayGame() {
	    System.out.print("Test toString:");
	    //test normal case
	    {
	      Game g1 = new Game(false);
	      String result = g1.playGame();
	      
	      assertEquals("Dragon health:",670, g1.getDragon().getHealth());
	      assertEquals("Turn:",5,(int)ToolKit.getVar(g1, "turn"));
	      assertEquals("Game Over: ", true, (boolean)ToolKit.getVar(g1, "gameOver"));mark++;
	      assertEquals("Result:","The winner was: dragon after 5 turns.", result);mark++;
	     
	    }
	    // test random case 
	    // (Note results may differ and test for marking may differ
	    // most important thing is showcasing that the game is running and we get a clear winner or tie)
	    {
	    	Game g1 = new Game(true);
	    	g1.playGame();
	    	assertNotEquals("Turn: ", 0, (int)ToolKit.getVar(g1, "turn"));
	    	assertEquals("Game Over: ", true, (boolean)ToolKit.getVar(g1, "gameOver"));
	    	mark++;
	    }
	  }
	  
	  
	  /**
	   * Test method for {@link AndeA1_2022.Game#resetGame(boolean)}.<p>
	   * <p>
	   * <ul>
	   * <li>
	   * </ul>
	   */
	  @Test
	  public final void testResetGame() {
	    System.out.print("Test resetGame:");
	    //test normal case
	    {
	      Game g1 = new Game(true);
	      g1.playGame();
	      assertEquals("Game Over:",true,(boolean)ToolKit.getVar(g1, "gameOver"));
	      g1.resetGame(false);
	      assertEquals("Game Over:",false,(boolean)ToolKit.getVar(g1, "gameOver"));
	      assertEquals("Turn:",0,(int)ToolKit.getVar(g1, "turn"));
	      assertNotEquals("Hand:",null,ToolKit.getVar(g1, "hand"));
	      assertNotEquals("Deck:",null, ToolKit.getVar(g1, "deck"));
	      assertNotEquals("Dragon:",null, ToolKit.getVar(g1, "dragon"));mark++;
	    }
	  }
}
