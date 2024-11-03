package items;

import exceptions.InvalidArgumentException;
import exceptions.ItemDestroyedException;

/*
Maintanence project
 */
public class RepairItem extends Item{
    /*
    Repairable Gross
     */
    private float repairAmount;
    public RepairItem(String RepairItemname, float RepairItemdurability, float RepairItemweight, float RepairItemrepairAmount) throws InvalidArgumentException {
        super(RepairItemname,RepairItemdurability,RepairItemweight);
        if (RepairItemrepairAmount < 0) {
            throw new InvalidArgumentException("repairAmount  is invalid");
        }
        this.repairAmount = RepairItemrepairAmount;

    }

    public float repair(float count) throws ItemDestroyedException, InvalidArgumentException{
        if (count <= 0) {
            throw new InvalidArgumentException("count  is invalid");
        }

        if (super.getDurability() <= 0) {
            throw new ItemDestroyedException("Durability<0");
        }
        if (repairAmount <= 0) {
            throw new ItemDestroyedException("count<0");
        }

        return caculate(count);
    }

    private float caculate(float amount) {
        if (repairAmount > amount) {
            this.repairAmount = repairAmount - amount;
            return amount;
        } else if (repairAmount < amount) {
            float rtn = this.repairAmount;
            this.repairAmount = 0;

            return rtn;
        }else{
            this.repairAmount = 0;
            return amount;
        }
    }

    @Override
    public String toString() {
        return "RepairItem{}";
    }
}
