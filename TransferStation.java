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

    public void addTransferStationNext(Station a) {
        if (this.color.equals(a.color)) {
            this.next = a;
            a.prev = this;
        } else {
            this.otherStations.add(a);
            a.prev = this;
        }
    }

    public void addTransferStationPrev(Station a) {
        if (this.color.equals(a.color)) {
            this.prev = a;
            a.next = this;
        } else {
            this.otherStations.add(a);
            a.next = this;
        }
    }

    @Override
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

        String result = "TRANSFERSTATION " + name + ": " + color + " line, in service: " + service + ", previous station: " + prev1 + ", next station: " + next1 + "\n\tTransfers: \n";

        for (int i = 0; i < this.otherStations.size(); i++) {
            Station curr = otherStations.get(i);
            String prev2;
            String next2;

            if (curr.prev == null) {
                prev2 = "none";
            } else {
                prev2 = curr.prev.name;
            }

            if (curr.next == null) {
                next2 = "none";
            } else {
                next2 = curr.next.name;
            }

            String type;
            if (curr instanceof EndStation) {
                type = "ENDSTATION";
            }
            else if (curr instanceof TransferStation) {
                type = "TRANSFERSTATION";
            } else {
                type = "STATION";
            }

            result += "\t" + type + " " + curr.name + ": " + curr.color + " line, in service: " + curr.service + ", previous station: " + prev2 + ", next station: " + next2 + "\n";

            if (curr instanceof TransferStation) {
                result += "\tTransfers: \n\n";
            }
        }

        return result;
    }
}
