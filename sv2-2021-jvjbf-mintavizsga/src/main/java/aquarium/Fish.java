package aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getStatus() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(", ").append("weight: ").append(weight)
                .append(", color: ").append(color)
                .append(", short-term memory loss: ").append(hasMemoryLoss());
        return sb.toString();
    }

    public abstract void feed();

    public boolean hasMemoryLoss() {
        return false;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
