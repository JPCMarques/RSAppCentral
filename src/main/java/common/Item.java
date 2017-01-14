package common;

import pvm.Monster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by joaop on 14/01/2017.
 */
public class Item {
    private static InstanceManager<Item> instanceManager;
    private static FactoryConstructor<Item> defaultConstructor;

    private static void initDefaultConstructor(){
        if(defaultConstructor == null){
            defaultConstructor = new FactoryConstructor<Item>() {
                @Override
                public Item construct(Object... args) {
                    Item item = new Item((String) args[0]);
                    item.id = computeId(args);
                    return item;
                }

                @Override
                public String computeId(Object... args) {
                    return ((String) args[0]).replace(" ", "_");
                }
            };
        }
    }

    public static Item newInstance(String name){
        initDefaultConstructor();
        return newInstance(name, defaultConstructor);
    }

    public static Item newInstance(String name, FactoryConstructor<Item> itemConstructor){
        if(instanceManager == null) instanceManager = new InstanceManager<Item>();
        return instanceManager.newInstance(itemConstructor, name);
    }

    private String name;
    private String id;
    private int value;
    private List<Monster> droppingMonsters;

    private Item(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Monster> getDroppingMonsters() {
        if(droppingMonsters == null) droppingMonsters = new ArrayList<>();
        return droppingMonsters;
    }
}
