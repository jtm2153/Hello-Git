package com.jtm10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("jtm");
        c.add("jtm2");
        c.add("jtm3");

        Iterator<String> it = c.iterator();
    }
}
