package items;

import exceptions.InvalidArgumentException;
import exceptions.ItemDestroyedException;

/*
Ranged weapons have attack radius
 */
public class RangedWeapon extends Weapon {
    private String name ;




    /*
    attack radius
     */
    private float radius ;

    public RangedWeapon(String RangedWeaponName, float RangedWeaponDurability, float RangedWeaponWeight, float RangedWeaponMinDamage, float maxDamage, float RangedWeaponRadius) throws InvalidArgumentException {
        super(RangedWeaponName,RangedWeaponDurability,RangedWeaponWeight,RangedWeaponMinDamage,maxDamage);



        if (0>RangedWeaponRadius) {
            throw new InvalidArgumentException("radius is invalid ");
        }
        this.name = RangedWeaponName;




        this.radius = RangedWeaponRadius;
    }


    public float inflictDamage(float distanceFromTarget) throws InvalidArgumentException {
        if (distanceFromTarget < 0) {
            throw new InvalidArgumentException("distanceFromTarget is invalid");
        }
        if (distanceFromTarget>radius ) {
            return 0;
        }

        if (super.getDurability() < 0) {
            throw  new InvalidArgumentException("Durability is invalid");
        }

        double newDamage = getRange();
        return (float) newDamage;
    }

    private double getRange() {
        float temp = maxDamage - minDamage;
        return minDamage + (Math.random()) * temp;
    }

    @Override
    public String toString() {


        return "RangedWeapon [name=" + name + ", durability=" + getDurability() + ", minDamage=" + minDamage + ", maxDamage=" + maxDamage + ", radius=" + radius + "]";
    }
}
