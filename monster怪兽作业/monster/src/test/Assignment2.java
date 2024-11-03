package test;

/**
<h1>Overview</h1>
In Assignment 1, you were approached by a game company to create a card game between a player and a dragon.
Well they were impressed with your job and would like to work again on another game!
This time they want the game to focus on battles between monsters and mechanical monsters.
Of course, this means you will need to create a good inheritance hierarchy of the monsters and items they may use.
In this assignment you will have two inheritance structures, the first on the types of monsters and the second on types of items.
The monsters will either hold the items as weapons, use the items as armor or have them equipped in other regions of their body.

<br>

Your task is to create an inheritance structure that best suits the multitude of classes in this specification.  
You should seek to remove any duplicated code via the use of inheritance.   You are welcome to create additional 
classes if you see fit.  However, the small amount of test code supplied must work without modification.
The following sections cover the basic components of the game system.  Please note when any input is wrong for any 
argument for any method you should throw an InvalidArgumentException that reports via the message field 
what is wrong to the caller.  Setters and Getters should be created where appropriate and only where appropriate.  
All classes should have a toString method that is appropriate and match the test output at the bottom of this class.
Some method signatures (without exceptions) have been given below as hints but there are others you should/must 
add for everything to work.  <br>

<h1>Monsters</h1>
All beings in this game are classified as monsters. They may be enhanced with certain items, or even be entirely mechanical.
However, no monster can just be a monster (E.g. you should  not allow Monster m1 = new Mosnter()).
A monster class has been supplied but feel free to modify it (in fact you will have to).  
All monsters are either WildMonsters or MechaMonsters. And there are specialized versions of both of these,
being the ArmoredWild and WeaponizedMecha.
All monsters have hit points maxHitpoints, a status (alive or dead), a level and a name. There should be a basic method
to calculate the amount of damage inflicted on the monster called recieveDamage. And another for the option to heal. <br>
You need at least the following methods in the Class.<br>
<li>public void receiveDamage(float damage) 
<li>public void heal(float healing)

<h2>Wild Monster</h2>
The WildMonster class is for creatures that are generally known to be wild beasts (such as a lion or a squirrel).
WildMonsters should have a damage value to represent how much damage they do with their natural abilities
(such as their claws, tail, biting etc). As these are natural parts of their body, they do not degrade unlike 
the weapons that mechanical monsters use.
You need at least the following methods in the Class.<br>
<li>public int getDamage() 


<h2>Armored Wild</h2>
The ArmoredWild class is a special kind of wild monster that has been equipped with armor. They should be able to
change their armor. They also should have a more specialized method called receiveDamage 
that passes the amount of damage into the armored wild taking into account any armor worn.  <br>
You need at least the following methods in the Class.<br>
<li>public void receiveDamage(float damage)

<h2>MechaMonster</h2>
MechaMonsters are monster that is entirely mechanical. Instead of attacking with something primitive like claws,
they use weapons such as swords (probably futuristic electroswords). They are also equipped with armor to help them take less damage,
similar to the ArmoredWild. Finally, all MechaMonsters are equipped with a repair item to make repairs (heal) to itself when needed.



<h2>Weaponized Mecha</h2>
The final type of monster is the WeaponizedMecha, these monsters have everything a mecha monster has, but they can also be
equipped with up to three ranged weapons to assist them in combat! This class should have a method to set the RangedWeapons.
It should also have a getter that will select the ranged weapon to fire, provided it has ammo (durability). 
<br>
You need at least the following methods in the Class.<br>
<li>public void equipRangedWeapons(RangedWep r1, RangedWep r2, RangedWep r3) 
<li>public RangedWeapon selectRangedWeapon(int value)


<h1>Items</h1>
Non-monsters in this game are classified as Item's.  Items explicitly have a durability a weight and a name.  Durability 
is a value between 0-100.   When the item is 0 its broken and useless.  Every time the item is used the durability
falls by 1 (e.g. 1%).  Items should not be allowed to be created only subclasses of item. Items can be Armor, RepairItems
or Weapons and a Weapon can either be just a Weapon or more specifically a Ranged Weapon.<br>  

<h2>Armor</h2>
Armor has a amount of damage it protects from (this is set in the constructor).  If the armor has durability it 
will reduce the damage taken by the amount of protection it provides.  E.g. if armor was 10 and someone did 12 
damage the damage inflicted would be 2.  The armor class should provide a method calculateDamage that returns 
the amount of damage inflicted after the armor reduces the damage.  However, if the item is destroyed due to the 
durability falling to less than zero the method should throw an ItemDestroyedException to the calling method. <br>
You need at least the following methods in the Class.<br>
<li>public float calculateDamage(float damage)

<h2>Repair Item</h2>
RepairItem has a repairAmount which can be used to repair a mechanical monster. In this class durability is not affected by use 
but when the repairAmount is expended it will throw the ItemDestroyedException just like any other worn out item.
RepairItem has a method repair that will take an argument of the amount of repairing to be done and return the amount of 
repairing that can be done.  E.g. if the repairbots are nearly out of power it may return a smaller amount than is requested. <br>
You need at least the following methods in the Class.<br>
<li>public float repair(float amount)

<h2>Weapon</h2>
Weapon's have the minimum damage and the maximum damage that the weapon could inflict.  Again if the weapon has 
< 0 durability it will do no damage and throw an ItemDestroyedException.  Weapon will also have an inflictDamage
method that will calculate the amount of damage (using Random and calculated between minDamage and maxDamage) 
that it inflicts.  <br>
You need at least the following methods in the Class.<br>
<li>public float inflictDamage()

<h2>Ranged Weapon</h2>
A ranged weapon works just like a weapon however, it adds an radius value which should be compared to the distance
to target to see if the ranged weapon hits the opponent. Ranged Weapon overloads the inflictDamage method to take into account the 
distance from the target that is passed in as an argument.  <br>
You need at least the following methods in the Class.<br>
<li>public float inflictDamage(float distanceFromTarget) 

<h1>Other Classes</h1>
You will need to create three exception classes to handle 
<li> An item has worn out (durability < 0 ) called ItemDestroyedException.
<li> A monster has died.  MonsterDeadException.  You will need to modify the monster class to make this work. 
<li> Invalid arguments passed in. InvalidArgumentException


<h1>Restrictions</h1>
There are a number of rules you must follow when addressing the requirements for this assignment.
<ol>
<li>You must use inheritance.
<li>You must have all the named classes.
<li>Your classes must have the specified methods EXACTLY as specified.   You may need to add throws clauses though.
<li>Ill say this one again Your classes must have the methods <b>EXACTLY as specified</b>.  If you don't it wont compile when I dump my testing class in the folder and you will <b>fail</b> the assignment.
<li>All classes must be in correct packages that represent them (I have provided the packages)
</ol>

<h1>Error Handling</h1>
A number of situations will require the use of exceptions.  You are to decided where and when to use it.  

<h1>Testing</h1>
Finally you should use the game class to test our your ideas.   You should also design a test outline for your 
assignment.  You are not expected to write a test driver (but it would be a good idea) but you are expected to 
document all the tests you will run on each class.  See the testoutline.txt file in this project, you will need 
to fill it in


<h2>Marking</h2>
The mark for the assignment will be composed of the following components. 
<li>(50%)	It Works
<li>(25%)	Code Quality
<li>(25%)	Testing Regime

<h2>How Am I Supposed To Do All This?</h2>
Break the problem down into simpler parts and solve each of these.   My suggestion is you sit down and look at the entire assignment 
and try to figure out what things you need to know to solve the assignment.  Then go figure how to write these parts independently 
and then integrate them together.  I suggest the following approach: 
<ol>
<li>Write down on a piece of paper all the classes you believe you need.
<li>Take all the classes you know about, create a project in eclipse and generate all the classes
<li>Put in the known method signatures for the classes you know about.
<li>Put in the java doc comments for classes.  Generate JavaDoc, Compile, Check
<li>Add all the instance variables.  Compile, Check
<li>Add all the setters and getters   Compile, Check
<li>Add all the toString methods    Compile, Check
<li>Add all the constructors   Compile, Check
<li>Write your tests for each method.
<li>Start working on methods  Compile, Check constantly
</ol>

<h2>Submitting your work</h2>
Zip the project folder and submit it to AssignIT. Name it with your email/networkID

- Ben Volmer and Stewart Von Itzstein
*/


public class Assignment2 {

}
