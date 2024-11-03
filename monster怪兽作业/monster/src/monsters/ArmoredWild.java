package monsters;

import exceptions.InvalidArgumentException;
import exceptions.ItemDestroyedException;
import exceptions.MonsterDeadException;
import items.Armor;

/*
A special wild monster, already equipped with armor
 */
public class ArmoredWild extends WildMonster{


    public ArmoredWild(String ArmoredWildname, float ArmoredWildhitPoints, float ArmoredWildmaxHitPoints, int ArmoredWilddamage)  throws InvalidArgumentException {
        super(ArmoredWildname, ArmoredWildhitPoints, ArmoredWildmaxHitPoints,ArmoredWilddamage);
    }

    public Armor getArmor() {
        return this.armor;
    }
    /*

    public ArmoredWild(WildMonster other) throws InvalidArgumentException {super(other);}



    public String toString() {
        
    }
    /*
    set armor
     */
    public void setArmor(Armor armor) throws InvalidArgumentException{

    }

    @Override
    public void receiveDamage(float damage) throws InvalidArgumentException, MonsterDeadException {

    }


}
