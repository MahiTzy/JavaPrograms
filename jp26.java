//wap too enter input in a matrix of 3x3 and print 
import java.util.*;
class jp26 {
	public static void main(String [] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		char[][] arr = new char[n][n];
		/*for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}*/
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0 || j==0 || i==n-1 || j==n-1){
					if(i==0 && j==0 || i==0 && j==n-1 || i==n-1 && j==n-1 || i==n-1 && j==0){
						arr[i][j]='*';	
						}
					else{
					arr[i][j]='#';
					}
				}
				else if(i==j || i+j==n-1){
					arr[i][j]='*';
				}
				else{
					arr[i][j]='@';
				}
			}
		}
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+ " ");
			}
		System.out.println();
		}
		
	}
}