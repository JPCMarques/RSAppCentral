package general;

/**
 * Created by joaop on 22/12/2016.
 */
public class Item implements Node{
    private String name;
    private String id;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String getNodeId() {
        return getId();
    }

    @Override
    public String toString() {
        return name + " (" + value + "gp)";
    }
}
