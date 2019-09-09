package aed.orderedmap;

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.lang.management.ManagementFactory;
// import java.lang.reflect.*;
// import es.upm.aedlib.Position;
// import es.upm.aedlib.positionlist.*;
import java.util.Comparator;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Iterator;


public class MainExample {

    public static void main(String[] args) {
	OrderedMap<String, Integer> m =
	    new PositionListOrderedMap<String,Integer>(new StringComp());

	try {
	   
		
		m.put("Jose", 23);
	    m.put("Carlos", 35);
	    m.put("Miriam", 25);
	    m.get(null);
	    System.out.println(m.toString());

	}  catch (Exception e) {
	    System.out.println(e.toString());
	}

    }


    static class StringComp implements Comparator<String> {
	public StringComp() { }

	public int compare(String o1, String o2) {
	    return o1.compareTo(o2);
	}
    }
}
