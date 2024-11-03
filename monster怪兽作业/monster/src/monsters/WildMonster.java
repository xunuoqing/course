package monsters;

import exceptions.InvalidArgumentException;

/*
beast
 */
public class WildMonster extends Monster{

    public WildMonster(WildMonster other)throws InvalidArgumentException{
        
    }





    /*
    self-inflicted damage
     */
    public int getDamage(){
        return this.d;
    }

    public  WildMonster(String WildMonstername, float WildMonsterhitPoints, float WildMonstermaxHitPoints, int WildMonsterdamage) throws InvalidArgumentException {
        
    }
    @Override
    public String toString() {
        
    }

    /*
 own default damage
  */
    private int d;
}
