import java.util.*;

public class EndStation extends Station {
    
    public EndStation (String color, String name) {
        super(color, name);
        this.service = true;
        this.next = null;
        this.prev = null;        
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

        return "ENDSTATION " + name + ": " + color + " line, in service: " + service + ", previous station: " + prev1 + ", next station: " + next1;
    }
    
}