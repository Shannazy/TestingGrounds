package ToupleList;

import org.javatuples.Quartet;

public class EntryPoint {

    public static void main(String[] args) {
        myList ob = new myList();
        Quartet<String, String, String,Integer> my4bitInfo = Quartet.with("Doc_name","Doc_id","Revision_id",5);
        ob.addInfo(my4bitInfo);
        System.out.println(ob.giveInfo(3).getValue(1));

    }
}
