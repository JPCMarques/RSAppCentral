package general;

import org.apache.commons.io.IOUtils;

/**
 * Created by joaop on 21/12/2016.
 */
public enum CharmType implements Node{
    GOLD("Gold"), GREEN("Green"), CRIMSON("Crimson"), BLUE("Blue");
    String name;

    CharmType(String name){
        this.name = name + " charm";
    }

    @Override
    public String getNodeId() {
        return toString();
    }

    @Override
    public float getValue() {
        return 0;
    }

    public static void main(String[] args){
        System.out.println(GOLD.toString());
    }

    @Override
    public String toString() {
        return name;
    }
}
