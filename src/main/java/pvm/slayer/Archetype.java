package pvm.slayer;

import pvm.Monster;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static pvm.slayer.DataDirectory.existingArchetypes;

/**
 * Created by joaop on 23/12/2016.
 */
public class Archetype {
    protected Map<String, Monster> containedMonsters;
    protected String id;

    private Archetype(){}

    public Archetype newInstance(String id){
        Archetype archetype = existingArchetypes.get(id);
        if(archetype == null) {
            archetype = new Archetype();
            archetype.setId(id);
        }
        existingArchetypes.put(archetype.getId(), archetype);
        return archetype;
    }

    public Map<String, Monster> getContainedMonsters(){
        if (containedMonsters == null) containedMonsters = new HashMap<>();
        return containedMonsters;
    }

    public void addMonster(Monster monster){
        getContainedMonsters().put(monster.getName(), monster);
    }

    public Collection<Monster> getMonsters(){
        return getContainedMonsters().values();
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}
