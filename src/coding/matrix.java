package coding;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int [][] example = new int[3][3]; define a 2D Array
		
		int [][] a = { {1,2,3}, {4,5,6}, {7,8,9}};
		
		int [][] res = switchMatrix(a);
		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				
				System.out.println(res[i][j]);
			}
		
		
		
		}
		
	}    	
	
	public static int [][] switchMatrix(int[][] arr){
		
		int row = arr.length;
		int colunm = arr[0].length;
		
		int[][] temp = new int[row][colunm];
		
		for(int i=0;i<arr.length; i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				temp[j][i] = arr[i][j];
				
				
			}
			
		}
		return temp;
	}

}
