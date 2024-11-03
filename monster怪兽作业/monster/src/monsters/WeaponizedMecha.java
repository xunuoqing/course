package monsters;

import exceptions.InvalidArgumentException;
import items.RangedWeapon;

import java.util.ArrayList;
import java.util.List;

/*
Fully mechanical monster upgrade
Can be equipped with up to three ranged weapons to assist them in battle
 */
public class WeaponizedMecha extends MechaMonster{

    /*
Take the weapon according to the subscript
 */
    public RangedWeapon selectRangedWeapon(int value) throws InvalidArgumentException{
       
    }




    @Override
    public String toString() {
        return super.toString();
    }
    /*
       Weapon List
        */
    private List<RangedWeapon> weapons = new ArrayList<>();
    public WeaponizedMecha(String WeaponizedMechaname, float hitPoints, float WeaponizedMechamaxHitPoints) throws InvalidArgumentException {
        

    }
    public void equipRangedWeapons(RangedWeapon r1, RangedWeapon r2, RangedWeapon r3) {

    }

}
