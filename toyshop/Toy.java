package toyshop;


public class Toy {

    int id;
    int count;
    String name;
    double weight;

    public Toy(int id, int count, String name, double weight) {
        this.id = id;
        this.count = count;
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", count=" + count + ", name=" + name + ", weight=" + weight + "]";
    }
}