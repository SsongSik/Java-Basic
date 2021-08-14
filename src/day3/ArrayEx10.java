package day3;

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numarr = new int[10];
		
		for(int i=0; i<numarr.length; i++) {
			System.out.print(numarr[i]=(int)(Math.random()*10));
		}
		System.out.println();
		
		for(int j=0; j<numarr.length-1; j++) {
			for(int i=0; i<numarr.length-1-j; i++) {
				if(numarr[i]>numarr[i+1]) {
					int tmp = numarr[i];
					numarr[i] = numarr[i+1];
					numarr[i+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<numarr.length; i++) {
			System.out.print(numarr[i]);
		}
	}
}
/*°á°ú
9695742650
0245566799
*/
