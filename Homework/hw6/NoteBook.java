package java_gb_23.Homework.hw6;

public class NoteBook {
    private int ram;
    private int memory;
    private String os;
    private String color;

    //Constructor
    public NoteBook(int ram, int memory, String os, String color){
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }

    // Getters and setters methods
    public Integer getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }

    public Integer getMemory() { return memory; }
    public void setMemory(int memory) { this.memory = memory; }

    public String getOs() { return os; }
    public void setOS(String os) { this.os = os; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return String.format("ram: %d, memory: %d, os: %s, color: %s\n", ram, memory, os, color);
    }

}

