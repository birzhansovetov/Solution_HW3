import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    String name;
    List<Room> rooms;
    List<NPC> npcs;
    public Dungeon() {
        rooms = new ArrayList<>();
        npcs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<NPC> getNpcs() {
        return npcs;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNpc(NPC npc) {
        npcs.add(npc);
    }

    public void addRoom(Room room ) {
        rooms.add(room);
    }
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Rooms: " + rooms.size());
        System.out.println("NPCs: " + npcs.size());
        for (NPC npc : npcs) {
            System.out.println("NPC: " + npc.getName());
        }
        for (Room room : rooms) {
            System.out.println("Room: " + room.getName());
        }
    }
}
