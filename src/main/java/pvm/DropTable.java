package pvm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by joaop on 22/12/2016.
 */
public class DropTable {
    private Map<String, Integer> drops = new HashMap<>();
    private float value;

    public void addDrop(Drop drop, int count) {
        drops.put(drop.getId(), count);
        value+=drop.getNode().getValue();
    }

    public float getValue() {
        return value;
    }


}
