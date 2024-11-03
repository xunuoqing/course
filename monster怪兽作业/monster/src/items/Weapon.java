package items;

import exceptions.InvalidArgumentException;
import exceptions.ItemDestroyedException;

import javax.crypto.Mac;
import java.util.Random;

/*
arms
 */
public class Weapon extends  Item{
    /*
    minimal damage
     */
    protected float minDamage;
    /*
    max damage
     */
    protected float maxDamage;
    public Weapon(String Weaponname, float Weapondurability, float Weaponweight, float WeaponminDamage, float WeaponmaxDamage) throws InvalidArgumentException {
        super(Weaponname,Weapondurability,Weaponweight);
        if (WeaponminDamage < 0) {
            throw new InvalidArgumentException("minDamage  is invalid");
        }
        if (WeaponmaxDamage < 0) {
            throw new InvalidArgumentException("maxDamage  is invalid");
        }
        this.minDamage = WeaponminDamage;
        this.maxDamage = WeaponmaxDamage;
    }

    /*
    cause some damages
     */
    public float inflictDamage() throws ItemDestroyedException, InvalidArgumentException {
        if (super.getDurability() < 0) {
            throw  new ItemDestroyedException("durability  is invalid");
        }
        double newDamage = getRange();
        return (float) newDamage;
    }

    private double getRange() {
        return minDamage + (Math.random()) * (maxDamage - minDamage);
    }
}
