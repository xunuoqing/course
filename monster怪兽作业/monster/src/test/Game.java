package test;

import java.util.ArrayList;


// don't do this in the future ideally, I am just being lazy. ;)
// should import each individually
import exceptions.*;
import items.*;
import monsters.*;

public class Game {
	
	
	// EXAMPLE OUTPUT:
	// Note: The health the dragon has at the end may differ.
/*
	Invalid arguments passed:Durablity outside 0-100 Range
	Should output somewhere between 10 and 50:20.0
	Should return 10:10.0
	Should return 10:10.0
	Repair Bots Exhausted
	Should return between 100 and 500:378.0
	Should return zero:0.0
	Should be 0:0.0
	Should be 800:800.0
	
	
	
	
	
	
	Dogo Health Should be 25
	MechaMosnter
	Name=Dogo
	Current HitPoints=25.0
	Max HitPoints=40.0
	Status=ALIVE
	Repair Item=null
	Weapon=null
	Armor=null
	
	
	RangedWeapon [name=Small gun, durability=0.0, minDamage=30.0, maxDamage=50.0, radius=10.0]
	RangedWeapon [name=Average gun, durability=100.0, minDamage=40.0, maxDamage=60.0, radius=15.0]
	RangedWeapon [name=Small gun, durability=0.0, minDamage=30.0, maxDamage=50.0, radius=10.0]
	WildMonster
	Name=Lion
	Current HitPoints=50.0
	Max HitPoints=50.0
	Status=ALIVE
	Damage=20
	
	
	
	ArmoredWild
	Name=Dragon
	Current HitPoints=200.0
	Max HitPoints=300.0
	Status=ALIVE
	Armor=Armor [name=Vital Shield, durability=100.0, weight=5.0, protection=200.0]
	
	
	
	
	MechaMosnter
	Name=Mothem
	Current HitPoints=70.0
	Max HitPoints=80.0
	Status=ALIVE
	Repair Item=null
	Weapon=Weapon [name=ElectroSword, durability=100.0, weight=5.0, minDamage=10.0, maxDamage=50.0]
	Armor=Armor [name=Scrappy Shield, durability=100.0, weight=5.0, protection=200.0]
	
	
	
	
	WeaponizedMech
	Name=Tyrantzard
	Current HitPoints=500.0
	Max HitPoints=700.0
	Status=ALIVE
	Equipped Guns->
	[RangedWeapon [name=Small gun, durability=0.0, minDamage=30.0, maxDamage=50.0, radius=10.0], RangedWeapon [name=Average gun, durability=100.0, minDamage=40.0, maxDamage=60.0, radius=15.0], RangedWeapon [name=Large gun, durability=100.0, minDamage=70.0, maxDamage=80.0, radius=30.0]]
	Repair Item=null
	Weapon=Weapon [name=Electric Lance, durability=100.0, weight=5.0, minDamage=10.0, maxDamage=50.0]
	Armor=Armor [name=Advanced Shield, durability=100.0, weight=5.0, protection=200.0]
	
	
	
	
	Lets Simulate a Battle Between Dragon and Mothem
	Note this is probably the hardest part to do so don't stress about it
	Get this working last after your structure etc.. is working
	And yes, the armor is really strong in this game!
	Dragon Health/Armor:  200.0/99.0
	Mothem Health/Armor:  70.0/99.0
	Dragon Health/Armor:  200.0/98.0
	Mothem Health/Armor:  70.0/98.0
	Dragon Health/Armor:  200.0/97.0
	Mothem Health/Armor:  70.0/97.0
	Dragon Health/Armor:  200.0/96.0
	Mothem Health/Armor:  70.0/96.0
	Dragon Health/Armor:  200.0/95.0
	Mothem Health/Armor:  70.0/95.0
	Dragon Health/Armor:  200.0/94.0
	Mothem Health/Armor:  70.0/94.0
	Dragon Health/Armor:  200.0/93.0
	Mothem Health/Armor:  70.0/93.0
	Dragon Health/Armor:  200.0/92.0
	Mothem Health/Armor:  70.0/92.0
	Dragon Health/Armor:  200.0/91.0
	Mothem Health/Armor:  70.0/91.0
	Dragon Health/Armor:  200.0/90.0
	Mothem Health/Armor:  70.0/90.0
	Dragon Health/Armor:  200.0/89.0
	Mothem Health/Armor:  70.0/89.0
	Dragon Health/Armor:  200.0/88.0
	Mothem Health/Armor:  70.0/88.0
	Dragon Health/Armor:  200.0/87.0
	Mothem Health/Armor:  70.0/87.0
	Dragon Health/Armor:  200.0/86.0
	Mothem Health/Armor:  70.0/86.0
	Dragon Health/Armor:  200.0/85.0
	Mothem Health/Armor:  70.0/85.0
	Dragon Health/Armor:  200.0/84.0
	Mothem Health/Armor:  70.0/84.0
	Dragon Health/Armor:  200.0/83.0
	Mothem Health/Armor:  70.0/83.0
	Dragon Health/Armor:  200.0/82.0
	Mothem Health/Armor:  70.0/82.0
	Dragon Health/Armor:  200.0/81.0
	Mothem Health/Armor:  70.0/81.0
	Dragon Health/Armor:  200.0/80.0
	Mothem Health/Armor:  70.0/80.0
	Dragon Health/Armor:  200.0/79.0
	Mothem Health/Armor:  70.0/79.0
	Dragon Health/Armor:  200.0/78.0
	Mothem Health/Armor:  70.0/78.0
	Dragon Health/Armor:  200.0/77.0
	Mothem Health/Armor:  70.0/77.0
	Dragon Health/Armor:  200.0/76.0
	Mothem Health/Armor:  70.0/76.0
	Dragon Health/Armor:  200.0/75.0
	Mothem Health/Armor:  70.0/75.0
	Dragon Health/Armor:  200.0/74.0
	Mothem Health/Armor:  70.0/74.0
	Dragon Health/Armor:  200.0/73.0
	Mothem Health/Armor:  70.0/73.0
	Dragon Health/Armor:  200.0/72.0
	Mothem Health/Armor:  70.0/72.0
	Dragon Health/Armor:  200.0/71.0
	Mothem Health/Armor:  70.0/71.0
	Dragon Health/Armor:  200.0/70.0
	Mothem Health/Armor:  70.0/70.0
	Dragon Health/Armor:  200.0/69.0
	Mothem Health/Armor:  70.0/69.0
	Dragon Health/Armor:  200.0/68.0
	Mothem Health/Armor:  70.0/68.0
	Dragon Health/Armor:  200.0/67.0
	Mothem Health/Armor:  70.0/67.0
	Dragon Health/Armor:  200.0/66.0
	Mothem Health/Armor:  70.0/66.0
	Dragon Health/Armor:  200.0/65.0
	Mothem Health/Armor:  70.0/65.0
	Dragon Health/Armor:  200.0/64.0
	Mothem Health/Armor:  70.0/64.0
	Dragon Health/Armor:  200.0/63.0
	Mothem Health/Armor:  70.0/63.0
	Dragon Health/Armor:  200.0/62.0
	Mothem Health/Armor:  70.0/62.0
	Dragon Health/Armor:  200.0/61.0
	Mothem Health/Armor:  70.0/61.0
	Dragon Health/Armor:  200.0/60.0
	Mothem Health/Armor:  70.0/60.0
	Dragon Health/Armor:  200.0/59.0
	Mothem Health/Armor:  70.0/59.0
	Dragon Health/Armor:  200.0/58.0
	Mothem Health/Armor:  70.0/58.0
	Dragon Health/Armor:  200.0/57.0
	Mothem Health/Armor:  70.0/57.0
	Dragon Health/Armor:  200.0/56.0
	Mothem Health/Armor:  70.0/56.0
	Dragon Health/Armor:  200.0/55.0
	Mothem Health/Armor:  70.0/55.0
	Dragon Health/Armor:  200.0/54.0
	Mothem Health/Armor:  70.0/54.0
	Dragon Health/Armor:  200.0/53.0
	Mothem Health/Armor:  70.0/53.0
	Dragon Health/Armor:  200.0/52.0
	Mothem Health/Armor:  70.0/52.0
	Dragon Health/Armor:  200.0/51.0
	Mothem Health/Armor:  70.0/51.0
	Dragon Health/Armor:  200.0/50.0
	Mothem Health/Armor:  70.0/50.0
	Dragon Health/Armor:  200.0/49.0
	Mothem Health/Armor:  70.0/49.0
	Dragon Health/Armor:  200.0/48.0
	Mothem Health/Armor:  70.0/48.0
	Dragon Health/Armor:  200.0/47.0
	Mothem Health/Armor:  70.0/47.0
	Dragon Health/Armor:  200.0/46.0
	Mothem Health/Armor:  70.0/46.0
	Dragon Health/Armor:  200.0/45.0
	Mothem Health/Armor:  70.0/45.0
	Dragon Health/Armor:  200.0/44.0
	Mothem Health/Armor:  70.0/44.0
	Dragon Health/Armor:  200.0/43.0
	Mothem Health/Armor:  70.0/43.0
	Dragon Health/Armor:  200.0/42.0
	Mothem Health/Armor:  70.0/42.0
	Dragon Health/Armor:  200.0/41.0
	Mothem Health/Armor:  70.0/41.0
	Dragon Health/Armor:  200.0/40.0
	Mothem Health/Armor:  70.0/40.0
	Dragon Health/Armor:  200.0/39.0
	Mothem Health/Armor:  70.0/39.0
	Dragon Health/Armor:  200.0/38.0
	Mothem Health/Armor:  70.0/38.0
	Dragon Health/Armor:  200.0/37.0
	Mothem Health/Armor:  70.0/37.0
	Dragon Health/Armor:  200.0/36.0
	Mothem Health/Armor:  70.0/36.0
	Dragon Health/Armor:  200.0/35.0
	Mothem Health/Armor:  70.0/35.0
	Dragon Health/Armor:  200.0/34.0
	Mothem Health/Armor:  70.0/34.0
	Dragon Health/Armor:  200.0/33.0
	Mothem Health/Armor:  70.0/33.0
	Dragon Health/Armor:  200.0/32.0
	Mothem Health/Armor:  70.0/32.0
	Dragon Health/Armor:  200.0/31.0
	Mothem Health/Armor:  70.0/31.0
	Dragon Health/Armor:  200.0/30.0
	Mothem Health/Armor:  70.0/30.0
	Dragon Health/Armor:  200.0/29.0
	Mothem Health/Armor:  70.0/29.0
	Dragon Health/Armor:  200.0/28.0
	Mothem Health/Armor:  70.0/28.0
	Dragon Health/Armor:  200.0/27.0
	Mothem Health/Armor:  70.0/27.0
	Dragon Health/Armor:  200.0/26.0
	Mothem Health/Armor:  70.0/26.0
	Dragon Health/Armor:  200.0/25.0
	Mothem Health/Armor:  70.0/25.0
	Dragon Health/Armor:  200.0/24.0
	Mothem Health/Armor:  70.0/24.0
	Dragon Health/Armor:  200.0/23.0
	Mothem Health/Armor:  70.0/23.0
	Dragon Health/Armor:  200.0/22.0
	Mothem Health/Armor:  70.0/22.0
	Dragon Health/Armor:  200.0/21.0
	Mothem Health/Armor:  70.0/21.0
	Dragon Health/Armor:  200.0/20.0
	Mothem Health/Armor:  70.0/20.0
	Dragon Health/Armor:  200.0/19.0
	Mothem Health/Armor:  70.0/19.0
	Dragon Health/Armor:  200.0/18.0
	Mothem Health/Armor:  70.0/18.0
	Dragon Health/Armor:  200.0/17.0
	Mothem Health/Armor:  70.0/17.0
	Dragon Health/Armor:  200.0/16.0
	Mothem Health/Armor:  70.0/16.0
	Dragon Health/Armor:  200.0/15.0
	Mothem Health/Armor:  70.0/15.0
	Dragon Health/Armor:  200.0/14.0
	Mothem Health/Armor:  70.0/14.0
	Dragon Health/Armor:  200.0/13.0
	Mothem Health/Armor:  70.0/13.0
	Dragon Health/Armor:  200.0/12.0
	Mothem Health/Armor:  70.0/12.0
	Dragon Health/Armor:  200.0/11.0
	Mothem Health/Armor:  70.0/11.0
	Dragon Health/Armor:  200.0/10.0
	Mothem Health/Armor:  70.0/10.0
	Dragon Health/Armor:  200.0/9.0
	Mothem Health/Armor:  70.0/9.0
	Dragon Health/Armor:  200.0/8.0
	Mothem Health/Armor:  70.0/8.0
	Dragon Health/Armor:  200.0/7.0
	Mothem Health/Armor:  70.0/7.0
	Dragon Health/Armor:  200.0/6.0
	Mothem Health/Armor:  70.0/6.0
	Dragon Health/Armor:  200.0/5.0
	Mothem Health/Armor:  70.0/5.0
	Dragon Health/Armor:  200.0/4.0
	Mothem Health/Armor:  70.0/4.0
	Dragon Health/Armor:  200.0/3.0
	Mothem Health/Armor:  70.0/3.0
	Dragon Health/Armor:  200.0/2.0
	Mothem Health/Armor:  70.0/2.0
	Dragon Health/Armor:  200.0/1.0
	Mothem Health/Armor:  70.0/1.0
	Dragon Health/Armor:  200.0/0.0
	Mothem Health/Armor:  70.0/0.0
	Item Destroyed:Weapon Worn Out
	Drops decayed weapon and uses fists
	Dragon Health/Armor:  200.0/0.0
	Attention Mothem Armor Destroyed Please Replace Soon
	Mothem Health/Armor:  50.0/0.0
	Dragon armor has been destoryed!
	Dragon Health/Armor:  190.0/0.0
	Attention Mothem Armor Destroyed Please Replace Soon
	Mothem Health/Armor:  30.0/0.0
	Dragon armor has been destoryed!
	Dragon Health/Armor:  184.0/0.0
	Attention Mothem Armor Destroyed Please Replace Soon
	Mothem Health/Armor:  10.0/0.0
	Dragon armor has been destoryed!
	Dragon Health/Armor:  175.0/0.0
	Attention Mothem Armor Destroyed Please Replace Soon
	Mothem Died

	*/


	public Game() {
		Weapon sword = null;

		//Weapon
		//Try something that will break it
		try {
			sword = new Weapon("ElectroSword",-100,5,10,50); //Sword of 5 kg with min damage of 10 and max damage of 50 (with -100 durability)
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}
		
		
		try {
			sword = new Weapon("ElectroSword",50,5,10,50); //Sword of 5 kg with min damage of 10 and max damage of 50 (with 100 durability)
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}
		
		
		try {
			System.out.println("Should output somewhere between 10 and 50:"+sword.inflictDamage());  //do some random damage.
		} catch (ItemDestroyedException e) {
			System.out.println("Weapon Destroyed");
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}


		//HealingItem
		RepairItem repairBots=null;
		try {
			repairBots = new RepairItem("Minor Healing repairBots",100f,0.5f,20f); //healing repairBots of 100 durability, weigh of 0.5  with 20 hp remaining
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}
		try {
			System.out.println("Should return 10:"+repairBots.repair(10)); //heal 10 hp of damage
			System.out.println("Should return 10:"+repairBots.repair(10)); //heal 10 hp of damage
			System.out.println("Will Never Print This:"+repairBots.repair(10)); //This should abort and not print

		} catch (ItemDestroyedException e) {

			System.out.println("Repair Bots Exhausted");
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}

		//RangedWeapon
		try {
			RangedWeapon rpg = new RangedWeapon("RPG",100, 10,100,500,5); //RangedWeapon with weight of 10kg, min Damage 100 max Damage 500 and radius of 5 meters
			System.out.println("Should return between 100 and 500:" +rpg.inflictDamage(3));//rpg detonated 3 meters from target
			System.out.println("Should return zero:"+rpg.inflictDamage(6));//rpg detonated 6 meters from target
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}

		//Armor
		Armor shield = null;
		try {
			shield = new Armor("Shield",100f,5.0f,200f); //new shield with 100 durability, weight of 5.0 kg and 200 units of protection
		}catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}
		try {
			System.out.println("Should be 0:"+shield.calculateDamage(10)); //calculateDamage actually inflicted after shield absorbs
			System.out.println("Should be 800:"+shield.calculateDamage(1000)); //calculateDamage actually inflicted after shield absorbs
		} catch (ItemDestroyedException e) {
			System.out.println("Armor Exhausted");
		}	catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}
		System.out.println("\n\n");
		

		//WildMonster
		WildMonster lion = null;
		try {
			lion = new WildMonster("Lion", 50, 50, 20);  //New enemy with 50 out of 50 max hp and 20 damage.
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}

		//ArmoredWild
		ArmoredWild dragon = null;
		try {
			dragon = new ArmoredWild("Dragon", 200, 300, 20);  //New armored wild monster with 200 out of 300 max hp and 20 damage
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}
		//MechaMonster
		MechaMonster mothem = null; 
		try {
			mothem = new MechaMonster("Mothem", 70, 80);  //New mecha monster with 70 hp out of a max of 80
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}

		System.out.println("\n\n");
		
		MechaMonster dogo=null;
		try {
			dogo = new MechaMonster("Dogo", 5, 40);
			RepairItem repairBotsForDogo = new RepairItem("Healing repairBots", 100, 1, 20);
			dogo.heal(repairBotsForDogo.repair(35));
			System.out.println("Dogo Health Should be 25");
			System.out.println(dogo);
		} catch (InvalidArgumentException e2) {
			e2.printStackTrace();
		} catch (ItemDestroyedException e) {
			e.printStackTrace();
		}
		
		//WeaponizedMecha
		WeaponizedMecha tyrantzard = null;
		try {
			tyrantzard = new WeaponizedMecha("Tyrantzard", 500, 700);  //Mechanized monster with 500 hp out of a max of 700
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}

		
		// Lets do some more advanced tests. But inside a group!
		ArrayList<Monster> fighters = new ArrayList<Monster>();
		fighters.add(lion);
		fighters.add(dragon);
		fighters.add(mothem);
		fighters.add(tyrantzard);
		try {
			Weapon sword1 = new Weapon("ElectroSword",100f,5,10,50);//name, durability, weight, minDamage,maxDamage
			Weapon lance1 = new Weapon("Electric Lance",100f,5,10,50); 
			Armor shield1 = new Armor("Vital Shield",100f,5.0f,200f);
			Armor shield2 = new Armor("Scrappy Shield",100f,5.0f,200f);
			Armor shield3 = new Armor("Advanced Shield",100f,5.0f,200f);

			//set the monsters armor
			dragon.setArmor(shield1);
			mothem.setArmor(shield2);
			tyrantzard.setArmor(shield3);

			//set the characters weapon
			mothem.setWeapon(sword1);
			tyrantzard.setWeapon(lance1);
			
			// setup ranged weapons to equip to tyrantzard.
			RangedWeapon smallGun = new RangedWeapon("Small gun", 100, 5, 30, 50, 10);
			RangedWeapon averageGun = new RangedWeapon("Average gun", 100, 10, 40, 60, 15);
			RangedWeapon largeGun = new RangedWeapon("Large gun", 100, 20, 70, 80, 30);
			// tire out the small one
			for(int i = 0; i<102; i++) // durability should not drop below 0
				smallGun.inflictDamage(1);
			System.out.println(smallGun);
			tyrantzard.equipRangedWeapons(smallGun, averageGun, largeGun);
			// select the average gun 
			System.out.println(tyrantzard.selectRangedWeapon(1));
			// attempt to select the small gun
			System.out.println(tyrantzard.selectRangedWeapon(0));
			
		

		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		} 
		//Dump all combatants to screen
		for (Monster monster: fighters) {
			System.out.println(monster+"\n\n");
		}

		//Avatar hit 105 times should break armor
		System.out.println("Lets Simulate a Battle Between Dragon and Mothem");
		System.out.println("Note this is probably the hardest part to do so don't stress about it");
		System.out.println("Get this working last after your structure etc.. is working");
		System.out.println("And yes, the armor is really strong in this game!");
		while(true) {//keeping clubbing each other until one of them is dead
			try {
				//System.out.println("Avatar Before Hit" + avatar.getHitPoints());
				dragon.receiveDamage(mothem.getWeapon().inflictDamage());//basically the mothem strikes the dragon with their weapon.  The dragon should reduce the damage by the amount of armor protection.
				//System.out.println("Avatar After Hit" + avatar.getHitPoints());
			} catch (ItemDestroyedException e) {
				System.out.println("Item Destroyed:"+e.getMessage());
				System.out.println("Drops decayed weapon and uses fists");
				try {
					mothem.setWeapon(new Weapon("Rocket Fist",100f,5,5,10));
				} catch (InvalidArgumentException e1) {

				}
			} catch (InvalidArgumentException e) {
				System.out.println("Argument is broken:"+e.getMessage());
				//e.printStackTrace();
			} catch (MonsterDeadException e) {
				System.out.println("Dragon Died");
				break;
			}
			System.out.println("Dragon Health/Armor:  "+dragon.getHitPoints()+"/"+dragon.getArmor().getDurability());
			try {
				//System.out.println("Bad Guy Before Hit" + avatar.getHitPoints());
				mothem.receiveDamage(dragon.getDamage());//basically the dragon strikes mothem with their default damage.  Mothem should reduce the damage by the amount of armor protection.
				//System.out.println("Bad Guy After Hit" + avatar.getHitPoints());
			} catch (InvalidArgumentException e) {
				System.out.println("Argument is broken:"+e.getMessage());
				//e.printStackTrace();
			} catch (MonsterDeadException e) {
				System.out.println("Mothem Died");
				break;
			}
			System.out.println("Mothem Health/Armor:  "+mothem.getHitPoints()+"/"+mothem.getArmor().getDurability());

		}


		// Some additional array checks
		try {
			ArrayList<Monster> creatures = new ArrayList<Monster>();
			creatures.add(new WildMonster("Lion2", 99, 100, 20)); 
			creatures.add(new ArmoredWild("Dragon2", 300, 500, 50)); 
			creatures.add(new MechaMonster("Mothim2", 70, 80)); 
			creatures.add(new WeaponizedMecha("Tyrantzard2", 500, 700)); 


			ArrayList<Item> items = new ArrayList<Item>();
			items.add(new Armor("Armored Shield",100f,5.0f,200f));
			items.add(new Weapon("Vorpal Sword",100f,5,10,50));
			items.add(new RangedWeapon("RPG",100,10,100,500,5));
			items.add(new RepairItem("Repair Bots",100f,0.5f,20f));

			ArrayList<RepairItem> repairkit = new ArrayList<RepairItem>();
			//healingItems.add(new Armor("Armored Shield",100f,5.0f,200f));//Shouldnt compile
			//healingItems.add(new Weapon("Vorpal Sword",100f,5,10,50));//Shouldnt compile
			//healingItems.add(new RangedWeapon("RPG",100,10,100,500,5));//Shouldn't compile
			repairkit.add(new RepairItem("Repair Bots",100f,0.5f,20f));

			ArrayList<Weapon> weapons = new ArrayList<Weapon>();
			//weapons.add(new Armor("Armored Shield",100f,5.0f,200f));//Shouldnt compile
			weapons.add(new Weapon("Vorpal Sword",100f,5,10,50));
			weapons.add(new RangedWeapon("RPG",100,10,100,500,5));
			//weapons.add(new HealingItem("Repair Bots",100f,0.5f,20f));//Shouldn't compile
		} catch (InvalidArgumentException ex) {
			System.out.println("Invalid arguments passed:"+ex.getMessage());
		}


	}

	public static void main(String[] args) {
		new Game();

	}
}
