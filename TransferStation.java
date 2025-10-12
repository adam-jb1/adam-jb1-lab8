import java.util.*;

public class TransferStation extends Station {
    protected ArrayList<Station> otherStations;

    public TransferStation (String color, String name) {
        super(color, name);
        this.service = true;
        this.next = null;
        this.prev = null;        
    }

    public void addTransferStationNext(Station a) {
        return;
    }

    public void addTransferStationPrev(Station a) {
        return;
    }

    public void otherStations(Station a) {
        return;
    }

        public String toString(){
        String prev1;
        String next1;

        if (prev == null) {
            prev1 = "none";
        } else {
            prev1 = prev.name;
        }

        if (next == null) {
            next1 = "none";
        } else {
            next1 = next.name;
        }

        return "TRANSFERSTATION " + name + ": " + color + " line, in service: " + service + ", previous station: " + prev1 + ", next station: " + next1;
    }
}
