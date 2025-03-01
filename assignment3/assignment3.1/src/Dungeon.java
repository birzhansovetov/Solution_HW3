import java.util.ArrayList;
import java.util.List;

public class Dungeon implements Cloneable{
    String name;
    List<Room> rooms;
    List<Npc> npcs;
    public Dungeon(String name, List<Room> rooms, List<Npc> npcs) {
        this.name = name;
        this.rooms = new ArrayList<>(rooms);
        this.npcs = new ArrayList<>(npcs);
    }
    public Dungeon() {
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNpc(Npc npc) {
        npcs.add(npc);
    }

    public void addRoom(Room room ) {
        rooms.add(room);
    }
    @Override
    public Dungeon cloneEntity() {
        return new Dungeon(this.name, this.rooms, this.npcs);
    }
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Rooms: " + rooms.size());
        System.out.println("NPCs: " + npcs.size());
        for (Npc npc : npcs) {
            System.out.println("NPC: " + npc.getName()+"| Role: "+npc.getRole());
        }
        for (Room room : rooms) {
            System.out.println("Room: " + room.getName() +"| Description :"+ room.getDescription());
        }
    }

}