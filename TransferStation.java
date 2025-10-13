import java.util.*;

public class TransferStation extends Station {
    protected ArrayList<Station> otherStations;

    public TransferStation (String color, String name) {
        super(color, name);
        this.service = true;
        this.next = null;
        this.prev = null;       
        this.otherStations = new ArrayList<Station>(); 
    }

    