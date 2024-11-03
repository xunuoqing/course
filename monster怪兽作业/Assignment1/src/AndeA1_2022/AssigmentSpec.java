package AndeA1_2022;


/**
 * 
 * Welcome to Assignment 1 for Programming Fundamentals<br>
 * <br>
 * In this assignment, you are approached by a game company which wants to create a card game.
 * They have provided you with the basic structure of each player having a deck and hand full of cards. 
 * However, they are unsure how to implement such features, so you have been selected to help them!
 * 
 * In this assignment you are to create five classes (Card, Deck Hand, Dragon and Game).  
 * The Card class will list the details of the card itself, while the Deck will store cards 
 * The Hand class will contain the users health, energy and damage values, alongside the ability to draw cards from the deck
 * and play the cards from their hand to increase their health or damage.
 * The Dragon class will be a basic enemy with a health and damage value the player must defeat.
 * The Game class is where a simple game will take place where the players Hand and a Dragon will battle each other until one wins.
 * <br>
 * <strong>Description</strong>
 * 
 * In this game we want to concentrate on the management of cards
 * You will create a Card class to represent one card that contains the name, attack power, health and cost of each card.
 * The class will also have a number of methods related to a single card (See API documentation).
 * You will also have a Deck which contains an array of 50 Cards and a Hand which contains 6 Cards.
 * The Dragon is a static enemy which can have a default or custom health and damage values
 * The Game itself will check for if either the player or the dragon and run out of health.
 * The game will also progress through turns where the player will play a card and the dragon will attack.
 * This continues until a win condition is met.
 * Your job is to create the Card, Deck, Hand, Dragon and Game classes. <br>
 * <br>
 * <strong>Data Structure</strong><p>
 * To make your life easier you will be provided with an API specification 
 * (just like the JavaDocs you use for your programming). This file is stored in the doc folder.
 * You must only use an array to store your cards in the Deck and Hand classes.
 * You are not permitted to use any collection Classes (or Array class methods) in this assignment.
 * You will need to implement each class based on the API specification for them.
 * This class is just to specify the functionality required.
 * Each method will contain a list of the permissible method calls.
 * I have also left an indication of the length of a solution. Your solution can be shorter or longer,
 * its just an indication so that you get an idea of how long a solution might be.<br>
 * <p><br>
 * <strong>Testing</strong><p>
 * A test program is also provided for you to use.  Please read it carefully as you will be expected
 * to generate your own in assignment 2.  Use the test driver as a starting point to test your Class
 * as thoroughly as possible.  Note that the marker reserves the right to test more conditions 
 * if they think of them.<br>
 * <p><br>
 * <strong>How to Do The Assignment</strong><p><br>
 * I suggest you do your assignment in the following order<br>
 * <ul>
 * <li>Clean your project (Menu Project - Clean)
 * <li>Create the five classes (Hand, Card, Deck, Dragon and Game)
 * <li>Fill in the methods using the API with blank bodies (return null if necessary)
 * <li>Compile and make sure that the TEST program runs (it won't work because the methods are empty, 
 * but make sure it compiles with no errors). 
 * <li>Write the constructors.  Test.
 * <li>Write the appropriate setters and getters for each class.  Test.
 * <li>Write the simplest least dependencies methods first then move on to each more complicated method.  Test each time.
 * <li>You will likely want to start with the Card class for this. While saving the Game class for last.
 * </ul>
 * <p><br>
 * Note that when you add functionality you may have to add test scenarios to other test methods to 
 * ensure you have covered all the possibilities. <br>
 * <p><br>
 * <strong>Additional Requirement.</strong><p>
 * In addition to what is above there are a number of requirements for this assignment. Most of these are 
 * to introduce interesting problems for you to solve and must be obeyed. <br>
 * <ul>
 * <li> As you are programming you will also need to comment your code thoroughly in each of your methods.   
 * <li> You are only permitted to use the the specified methods in the java doc comments for each method.  
 * <li> You may create additional methods (private only) but they are still constrained by the rules of the calling method
 * <li> Make sure you set emailID to your current email id (not student id)
 * </ul>
 * <p>
 * <strong>How We Will Mark Your Assignment.</strong>
 * <ul>
 * <li>We will run javadoc on your code to see if your code generates the API correctly.
 * <li>We will read your code to look for style and commenting problems.
 * <li>We will use a different variation of the test classes and see if we get the expected results
 * </ul>
 * <p><br>
 * <strong>Marking Scheme</strong><p>
 * 75 Percent for it working totally correct (eg no issues with the testing system). Note that some of the tests
 * will pass if you just fill in the method calls.  <strong>They will not get marks if they are side effects.</strong>  
 * There is 25 Percent for commenting/style of code.  Finally there is a 5% bonus 
 * for shuffling the deck<br>
 * <p><br>
 * Hint:  Many of the more complicated methods can use the easier methods to do part of their job.  You 
 * will notice that some methods are only one or two lines long thats because I have taken advantage of
 * other methods to do the job. It is highly encouraged for you to do this where possible to improve your style marks<br>
 * <br>
 * <strong>Note you do not need to generate this class</strong>
 * @author Ben Volmer and Stewart Von Itzstein
 *
 */
public class AssigmentSpec {

}
