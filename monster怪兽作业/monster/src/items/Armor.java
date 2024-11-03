package items;

import exceptions.ItemDestroyedException;
import exceptions.InvalidArgumentException;

import javax.naming.Name;

/*
armor
 */
public class Armor extends Item {
    private String name;

    /*
    armor value
     */
    public float protection;
    /*
    Returns the amount of damage dealt by armor
     */
    public float calculateDamage(float damage) throws ItemDestroyedException, InvalidArgumentException {
        int zero = 0;
        if (super.getDurability() < zero) {
            throw new ItemDestroyedException("Durability is invalid");
        }
        if (protection > damage) {
            return zero;
        } else if (protection < damage) {
            return damage - protection;
        } else {
            return zero;
        }
    }

    public Armor(String name, float Armordurability, float Armorweight, float Armorprotection) throws InvalidArgumentException {
        super(name, Armordurability, Armorweight);
        if (Armorprotection < 0) {
            throw new InvalidArgumentException("protection is invalid");
        }

        this.name = name;


        this.protection = Armorprotection;


    }



    public float getProtection() {
        return protection;
    }

    @Override
    public String toString() {
        return "Armor [name=" + name + ", durability=" + getDurability() + ", weight=" + getWeight() + ", protection=" + getProtection() + "]";
    }


}
