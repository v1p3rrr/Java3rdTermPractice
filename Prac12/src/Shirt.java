public class Shirt {
    private String id;
    private String type;
    private String color;
    private String size;

    public Shirt(String[] params) {
        // сделано под конкретную задачу с 4 параметрами, в противном случае нужно создавать доп проверку
        this.id = params[0];
        this.type = params[1];
        this.color = params[2];
        this.size = params[3];
    }

    @Override
    public String toString() {
        return "Shirt{ id: " + id + ", type: " + type + ", color: " + color + ", size: " + size + " }";
    }
}
