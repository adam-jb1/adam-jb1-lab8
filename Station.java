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

        return helper(dest, this, 0, );
    }

    public int helper(Station dest, Station start, count, String[] visited) {
        if (start = dest) {
            return 0;
        }

        Station start = this;

        Station iterator = start;
        while (iterator.next != dest) {
            iterator = iterator.next;
            count++;
        }
        count++;

        return helper
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