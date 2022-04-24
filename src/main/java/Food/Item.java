package Food;

public abstract class Item {
    String itemName;
    Integer preparationTimeOfPizza;
    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Integer getPreparationTime()
    {
        return preparationTimeOfPizza;
    }
    public void setPreparationTime(Integer preparationTimeOfPizza)
    {
        this.preparationTimeOfPizza=preparationTimeOfPizza;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", preparationTimeOfPizza=" + preparationTimeOfPizza +
                '}';
    }
}
