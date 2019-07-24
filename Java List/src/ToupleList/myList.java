package ToupleList;

import org.javatuples.Quartet;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

public class myList {
     private List<Quartet> entries = new ArrayList<>();

    public void addInfo(Quartet info){
        entries.add(info);
    }

    public Quartet giveInfo(int x){
        Quartet Temp = null;
        try {
             Temp = entries.get(x);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Out of bounds my dude. Returning the last element of the List");
            Temp =entries.get (entries.size()-1);
        }
        return Temp ;

    }
}
