public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon Originaldungeon = builder
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance",""))
                .addRoom(new Room("Treasure Room","A room filled with gold and jewels"))
                .addNPC(new Npc("Goblin","npc"))
                .addNPC(new Npc("Dragon","Final Boss"))
                .build();
        System.out.println("Original Dungeon: ");
        Originaldungeon.showDetails();
        System.out.println("---------------------------------");
        System.out.println();
        Dungeon clonedDungeon = Originaldungeon.cloneEntity();
        clonedDungeon = builder
                .setDungeonName("Castle")
                .addRoom(new Room("Throne Room","There is a big throne from 1000 sword"))
                .addNPC(new Npc("King","Boss"))
                .build();
        System.out.println("Cloned Dungeon: ");
        clonedDungeon.showDetails();
        System.out.println("---------------------------------");
        Dungeon clonedDungeon2 = Originaldungeon.cloneEntity();
        clonedDungeon2 = builder
                .setDungeonName("Underwater Temple")
                .addRoom(new Room("Sunken Chamber", "Bioluminescent corals glow in the dark."))
                .addNPC(new Npc("Sea Serpent", "Guardian of the Depths"))
                .build();
        System.out.println("Cloned Dungeon2: ");
        clonedDungeon2.showDetails();
    }

}
