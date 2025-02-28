public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance"))
                .addRoom(new Room("Treasure Room"))
                .addNPC(new NPC("Goblin"))
                .addNPC(new NPC("Dragon"))
                .build();
        dungeon.showDetails();
    }
}
