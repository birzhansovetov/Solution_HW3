public class Room implements Cloneable{
    private String name;
    private String description;
    public Room(String name, String description) {
        this.name = name;
        this.description = description;

    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }
}
class Npc implements Cloneable{
    private String name;
    private String role;
    public Npc(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public String getName() {
        return name;
    }
    public Npc cloneEntity() {
        return new Npc(this.name, this.role);
    }
    }
