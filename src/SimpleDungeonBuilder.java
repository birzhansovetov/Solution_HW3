public class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;
    public SimpleDungeonBuilder() {
        this.dungeon = new Dungeon();
    }

    @Override
    public IDungeonBuilder setDungeonName(String Name) {
        dungeon.setName(Name);
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        dungeon.addRoom(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        dungeon.addNpc(npc);
        return this;
    }

    @Override
    public Dungeon build() {
        return this.dungeon;
    }

}
