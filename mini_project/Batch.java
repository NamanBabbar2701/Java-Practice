package mini_project;

public class Batch {
    String slot;
    int spots;

    public Batch(String slot, int spots) {
        this.slot = slot;
        this.spots = spots;

    }

    @Override
    public String toString(){
        return slot + "- Spots Left: " + spots;
    }

}
