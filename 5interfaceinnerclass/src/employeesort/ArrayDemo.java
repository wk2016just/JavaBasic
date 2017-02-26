package employeesort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayDemo {

	   public static void main(String[] args) {

	      Short sArr[] = new Short[]{3, 13, 1, 9, 21};
	      for (short number : sArr) {
	         System.out.println("Number = " + number);
	      }

	      Comparator<Short> comp = Collections.reverseOrder();
	      Arrays.sort(sArr, comp);

	      System.out.println("short array with some sorted values(1 to 4) is:");
	      for (short number : sArr) {
	         System.out.println("Number = " + number);
	      }
	      
}}