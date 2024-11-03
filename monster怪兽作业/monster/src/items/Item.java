package items;

import exceptions.InvalidArgumentException;

/*
abstract objects
durability
 */
public abstract class Item {
    /**
     * durability
     */
    protected float durability;

    /*
    name
     */
    private String name;

    /*
    weight
     */
    private float weight;
    public Item(String Itemname, float Itemdurability, float Itemweight) throws InvalidArgumentException {
        if (Itemweight < 0) {
            throw new InvalidArgumentException("weight is invalid");
        }


        if (Itemdurability < 0) {
            throw new InvalidArgumentException("Durablity outside 0-100 Range");
        }

        this.durability = Itemdurability;



        this.name = Itemname;

        this.weight = Itemweight;
    }


    public float getWeight(){
        return this.weight;
    }

    public float getDurability() {
        return this.durability;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Item{durability=" + durability + ", weight=" + weight + '}';
    }
}
