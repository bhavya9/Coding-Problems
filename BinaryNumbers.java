package coding_problems;

public class BinaryNumbers {

		public static void main(String[] args){
			int n = 3;
			BinaryNumbers dtb = new BinaryNumbers();
			//System.out.println(Math.pow(2, n));
			dtb.decimalToBinary((int)Math.pow(2, n),n);
			
		}
		
		public void decimalToBinary(int d,int n){
			int k=0;		
			//StringBuilder sb = new StringBuilder();
			while(k<=d-1){
				StringBuilder sb = new StringBuilder();
				int i=k;
				while(i>0)	{
					sb.append(i%2);
					i=i/2;
					}
				if(sb.length()<n){
					int z=sb.length();
					while(z<n){
						sb.append("0");
						z++;
					}
				}
				System.out.println(sb.reverse().toString());
				k++;
				
			}
	}

}
