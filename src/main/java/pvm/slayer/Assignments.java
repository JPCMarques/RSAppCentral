package pvm.slayer;

import javafx.util.Pair;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joaop on 23/12/2016.
 */
public class Assignments {
    protected Map<String, Pair<Archetype, Integer>> assignmentMap;
    protected int totalWeight;

    public Map<String, Pair<Archetype, Integer>> getAssigmentMap(){
        if (assignmentMap == null) assignmentMap = new HashMap<>();
        return assignmentMap;
    }

    public Collection<Pair<Archetype, Integer>> getAssignmentList(){
        return getAssigmentMap().values();
    }

    public void addAssignment(Archetype archetype, int weight){
        Pair<Archetype, Integer> assignment = new Pair<>(archetype, weight);
        totalWeight += weight;
        getAssigmentMap().put(archetype.getId(), assignment);
    }


}
