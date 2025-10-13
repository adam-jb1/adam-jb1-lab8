import java.util.*;

public class Station{
    protected String name;
    protected String color;
    protected boolean service;
    protected Station next;
    protected Station prev;


    public Station(String color, String name){
        this.color = color;
        this.name = name;
        this.service = true;
        this.next = null;
        this.prev = null;
    }

    public void addNext(Station a){
        this.next = a;
        a.prev = this;
    }

    public void addPrev(Station a){
        this.prev = a;
        a.next = this;
    }

    public void switchAvailable(){
        if(service == false) {
            service = true;
        }
        else {
            service = false;
        }
    }

    public boolean isAvailable(){
        if (this.service == true) {
            return true;
        } 
        else {
            return false;
        }
    }

    public void connect(Station a) {
        this.next = a;
        a.prev = this;
    }

    public boolean equals(Station a){
        if (this.name.equals(a.name) && this.color.equals(a.color)) {
            return true;
        }

        return false;
    }

    public int tripLength(Station dest) {
        ArrayList<Station> visited = new ArrayList<Station>();

        return helper(dest, visited);
    }

    public int helper(Station dest, ArrayList<Station> visited) {
        int count = 0;
        if(dest == null) {
            return -1; 
        }
        if (this == dest) {
            return 0;
        }



        Station iterator = this;
        while (iterator.next != dest) {
            visited.add(iterator);
            iterator = iterator.next;
            count++;
            
            for (int i = 0; i < visited.size(); i++) {
                if (visited.get(i).equals(iterator)) {
                    return -1;
                }
            }
        }
        count++;

        return count;
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

        return "STATION " + name + ": " + color + " line, in service: " + service + ", previous station: " + prev1 + ", next station: " + next1;
    }

}