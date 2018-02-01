package pe.edu.utp.javawebregionlist.models;

public class Region {
    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public Region setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Region setName(String name) {
        this.name = name;
        return this;
    }
}
