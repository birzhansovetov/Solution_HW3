public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String Name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
}
