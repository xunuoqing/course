package monsters;

import exceptions.InvalidArgumentException;
import exceptions.ItemDestroyedException;
import exceptions.MonsterDeadException;
import items.Armor;
import items.RepairItem;
import items.Weapon;

/*
is a completely mechanical monster
Weapons such as swords can be used
Also equipped with armor to help them reduce damage -> class ArmoredWild

can also be repaired
 */
public class MechaMonster extends Monster {

    public RepairItem getRepairItem() {
        return this.repairItem;
    }


    public Weapon getWeapon() {
        return this.weapon;
    }
    public void setArmor(Armor a) throws InvalidArgumentException {

    }



    public Armor getArmor() {
        return armor;
    }

    public void setWeapon(Weapon weapon) throws InvalidArgumentException {


    }



    public MechaMonster(String MechaMonstername, float MechaMonsterhitPoints, float MechaMonstermaxHitPoints) throws InvalidArgumentException {
     

    }


    public MechaMonster(Monster other) throws InvalidArgumentException {
        super(other);
    }

    @Override
    public void receiveDamage(float damage) throws InvalidArgumentException, MonsterDeadException {
       

    }
    @Override
    public String toString() {

        

    }

    public void setRepairItem(RepairItem repairBots) {
        this.repairItem = repairBots;
    }


}
