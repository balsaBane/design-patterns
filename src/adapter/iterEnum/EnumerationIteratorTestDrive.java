package adapter.iterEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationIteratorTestDrive {
    public static void main(String [] args){

        ArrayList<String> array = new ArrayList(Arrays.asList(args));

        Enumeration e = Collections.enumeration(array);

        EnumerationIterator enumerationIterator = new EnumerationIterator(e);

        while(enumerationIterator.hasNext()){
            System.out.println(enumerationIterator.next());
        }

    }
}
