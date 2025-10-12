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
        next = a;
        a.prev = this;;

        return;
    }

    public void addPrev(Station a){
        prev = a;
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
        if (service == true) {
            return true;
        } 
        else {
            return false;
        }
    }

    public void connect(Station a) {
        next = a;
    }

    public boolean equals(Station a){
        if (name.equals(a.name) && color.equals(a.color)) {
            return true;
        }

        return false;
    }

    public int tripLength(Station a) {
        return 0;
    }

    public void makeEnd() {
        
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