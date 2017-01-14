package common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by joaop on 13/01/2017.
 */
public class InstanceManager<ManagedClass> {
    private Map<String, ManagedClass> knownInstances;

    public Map<String, ManagedClass> getKnownInstances(){
        if (knownInstances == null) knownInstances = new HashMap<>();
        return knownInstances;
    }

    public ManagedClass newInstance(FactoryConstructor<ManagedClass> factoryConstructor, Object... args){
        String id = factoryConstructor.computeId(args);
        ManagedClass instance = knownInstances.get(id);
        if(instance == null){
            instance = factoryConstructor.construct(args);
            knownInstances.put(id, instance);
        }
        return instance;
    }

}
