package pvm;

import java.util.LinkedList;

import static pvm.DataDirectory.existingMonsters;

/**
 * Created by joaop on 21/12/2016.
 */
public class Monster {
    private String name;
    private int slayerLevel;
    private LinkedList<MonsterStats> monsterStats;
    private DropTable dropTable;

    private Monster(){}

    public static Monster newInstance(String name){
        Monster monster = existingMonsters.get(name);
        if (monster == null) {
            monster = new Monster();
            monster.setName(name);
        }
        existingMonsters.put(monster.getName(), monster);
        return monster;
    }

    public static class MonsterStats{
        private String id;
        private String examine;
        private int combatLevel;
        private float combatExp;
        private float hpExp;
        private float slayerExp;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getExamine() {
            return examine;
        }

        public void setExamine(String examine) {
            this.examine = examine;
        }

        public int getCombatLevel() {
            return combatLevel;
        }

        public void setCombatLevel(int combatLevel) {
            this.combatLevel = combatLevel;
        }

        public float getCombatExp() {
            return combatExp;
        }

        public void setCombatExp(float combatExp) {
            this.combatExp = combatExp;
        }

        public float getHpExp() {
            return hpExp;
        }

        public void setHpExp(float hpExp) {
            this.hpExp = hpExp;
        }

        public float getSlayerExp() {
            return slayerExp;
        }

        public void setSlayerExp(float slayerExp) {
            this.slayerExp = slayerExp;
        }
    }

    public LinkedList<MonsterStats> getMonsterStats(){
        if(monsterStats == null) monsterStats = new LinkedList<>();
        return monsterStats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSlayerLevel() {
        return slayerLevel;
    }

    public void setSlayerLevel(int slayerLevel) {
        this.slayerLevel = slayerLevel;
    }

    public DropTable getDropTable() {
        return dropTable;
    }

    public void setDropTable(DropTable dropTable) {
        this.dropTable = dropTable;
    }
}
