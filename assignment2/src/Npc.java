public class Npc implements CloneableGameEntity {
    private String name;
    private String role;
    private int health;
    public Npc(String name, String role , int health) {
        this.name = name;
        this.role = role;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public Npc cloneEntity() {
        return new Npc(this.name, this.role , this.health);
    }
    public void display() {
        System.out.println(this.name + " " + this.role + " Health: " + this.health);
    }
}
