package coding;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> alist = new ArrayList<Integer>();
		
		int [][] a = { {1,2,3,16,17,12}, {4,5,6,18,19,56}, {7,8,9,20,21,78},{10,11,12,22,23,98},{14,18,19,34,25,9},{13,14,15,24,25,76} };
		//int [][] a = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		alist=spiralOrder(a);
		System.out.println(alist);
	}
	
//	[
//	 [ 1,  2,  3, 16  17  12 ],
//	 [ 4,  5,  6  18  19  56],
//	 [ 7,  8,  9  20 . 21 78],
//	 [ 10, 11, 12 22  23  98] ,  		
//	 [ 14, 18, 19 34 . 25 09], 
//	 [ 13, 14, 15 24 . 25 76],
//	]
	
	
	public static List<Integer> spiralOrder(int[][] matrix) {
	       
	       List<Integer> al = new ArrayList<Integer>();
	       
	       int rb = 0;
	       int re = matrix.length -1;
	       
	       int cb = 0;
	       int ce = matrix[re].length-1;
	       
	       
	       while(rb<=re &&cb<=ce){
	           

	              
	            for(int j=cb;j<=ce;j++){
	                   al.add(matrix[rb][j]);
	               }
	               
	               rb++;  //1
	     	      
	          
	        	   for(int j= rb; j<=re;j++){
	                al.add(matrix[j][ce]);
	               
	               }
	               
	               ce--; //4
	           
//	           if(cb<=ce){
//	               
//	               //for(xxxxxx; ce--){
//	        	   for(int j=ce;cb<=j; j--){
//	               al.add(matrix[re][j]);
//	               }
//	               
//	               
//	               re--;   //2 
//	           }
//	           
//	           if(rb<=re){
//	               
//	               //for(xxxx;re--){
//	        	  for(int j=re;j>=rb;j--){
//	               al.add(matrix[j][cb]);
//	                   
//	               }
//	               
//	               cb++; //1
//	                               //cb=1; rb=1; ce=4; re=2
//	           }
//	           
//	           
	               
	               
	               if(rb<=re){
	            	   // Traverse Left
		               
		        	   for(int j=ce;cb<=j; j--){
		               al.add(matrix[re][j]);
		               }
		               
		               
		               re--;   //2 
		           }
		           
		          
		           
		           if(cb<=ce){
		        	   // Traver Up
		               
		        	  for(int j=re;j>=rb;j--){
		               al.add(matrix[j][cb]);
		                   
		               }
		               
		               cb++; //1
		                               //cb=1; rb=1; ce=4; re=2
		           }
		            
	           
	       }
		return al;
   }
}