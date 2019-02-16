package adapter.iterEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {
    public static void main(String [] args){
        ArrayList<String> array = new ArrayList<String>(Arrays.asList(args));
        Enumeration enumeration = new IteratorEnumeration(array.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
