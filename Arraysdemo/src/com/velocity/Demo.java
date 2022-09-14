package com.velocity;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	 
		List<String> asList = Arrays.asList( "abhi "+"sham");
		Iterator<String>  itr = asList.iterator();
          while(itr.hasNext()) {
        	  System.out.println(itr.next());
          }
	}

}
