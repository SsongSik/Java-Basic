package day3;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		int[] iarr1 = new int[10];
		int[] iarr2 = new int[10];
		int[] iarr3 = new int[] {100, 95, 80, 60, 70};
		char[] ch = {'a', 'b', 'c', 'd' };
		
		for(int i=0; i<iarr1.length; i++) {
			iarr1[i]=i+1;
		}
		for(int i=0; i<iarr2.length; i++) {
			iarr2[i]= (int)(Math.random()*10)+1;
		}
		for(int i=0; i<iarr1.length; i++) {
			System.out.print(iarr1[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iarr2));
		System.out.println(Arrays.toString(iarr3));
		System.out.println(Arrays.toString(ch));
		System.out.println(iarr3);
		System.out.println(ch);
	}

}
