package pvm;

import general.Item;
import general.Node;

import static pvm.DataDirectory.existingDrops;

/**
 * Created by joaop on 22/12/2016.
 */
public class Drop {
    public static final String ID_DIVIDER = "|";
    private Node node;
    private float dropRate;

    private Drop(){}
    private Drop(Node node, float dropRate){
        this.node = node;
        this.dropRate = dropRate;
    }

    public Node getNode() {return node;}
    public float getDropRate(){
        return dropRate;
    };

    public static String getId(Node node, float dropRate){
        return node.getNodeId() + ID_DIVIDER + dropRate;
    }

    public String getId(){
        return getId(getNode(), getDropRate());
    }

    public static Drop newInstance(Node node, float dropRate) {
        String id = getId(node, dropRate);
        Drop drop = existingDrops.get(id);
        if (drop == null){
            drop = new Drop(node, dropRate);
            existingDrops.put(drop.getId(), drop);
        }
        return drop;
    }

    @Override
    public String toString() {
        return getNode().toString() + " [" + String.format("%.2f",dropRate*100) + "%]";
    }
}
