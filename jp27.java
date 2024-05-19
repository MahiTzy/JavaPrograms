import java.util.*;
class jp27 {
	public static void main(String [] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int c_0=0,c_1=0;
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j && arr[i][j]==1){
					c_1++;
				}
				else if(i!=j && arr[i][j]==0){
					c_0++;
				}
			}
		}
		if(c_1==n && c_0==n*(n-1))
		{
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		/*for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+ " ");
			}
		System.out.println();
		}*/
		
	}
}