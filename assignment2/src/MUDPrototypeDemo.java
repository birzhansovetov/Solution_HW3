public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room firstRoom = new Room("Hall", " A grand hall with high ceilings and chandeliers");
        Npc  prototypeNpc = new Npc("Death King" ,"Final Boss", 1000);
        Npc clonedNpc = prototypeNpc.cloneEntity();
        Room clonedRoom = firstRoom.cloneEntity();
        clonedRoom = new Room("Treasure Chamber", "A room filled with gold and jewels");
        System.out.println("Original objects: " );
        prototypeNpc.display();
        firstRoom.display();

        System.out.println("Cloned objects: " );
        clonedNpc = new Npc(clonedNpc.getName(), "boss defender", 150);
        clonedRoom.display();
        clonedNpc.display();

    }
}
