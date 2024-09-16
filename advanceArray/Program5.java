package assignment2.advanceArray;

public class Program5 {
	public static void findPairs(int[] ar, int k) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length-1;j++) {
				if(ar[i]+ar[j]==k) {
					System.out.println(ar[i]+ " " +ar[j]);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int ar[]= {2,4,6,8,9,5,1};
		int k=10;
		findPairs(ar,k);

	}

	

}
