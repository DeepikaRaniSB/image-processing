/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maskoperation;

import java.awt.Dimension;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Maskoperation {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
		System.out.println("enter the dimensions(mxn) of the image");
	int row=in.nextInt();
		int column =in.nextInt();
		System.out.println("enter the pixel values of image");
		int image[][]=getinput(row, column);
		 System.out.println();
		 System.out.println("the image=  ");
		 printMatrix(image);
                 //Dimension d=new Dimension(row,column);
                 System.out.println("the output =");
                 int m=3;
                  int ima[][]=new int[row][column];
                 
                 lpf(image,ima,row,column,m);
                 
                 
        
    }
    public static int[][] getinput(int r, int c){
		int i,j;
		Scanner inp =new Scanner(System.in);
		int[][] result=new int[r][c];

        for(i=0;i<r;i++){
        	for (j=0;j<c;j++ ) {
        		result[i][j]=inp.nextInt();

        	}
        }
        return result;
              
	}
    public static void printMatrix(int[][] matrix) {
       int rows = matrix.length;
       int columns = matrix[0].length;
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
       }
}
    
    public static void lpf(int p1[][], int p2[][], int width, int height, int maskSize){ 
   int w = width;
  int h=height;
  int max = 0, i=0, j=0;
  int start = maskSize/2;
  int size = maskSize*maskSize;
  int sum=0; 
    try{ 
      for(i = start; i < h-start; i++){
          for(j = start; j < w-start; j++){
              sum=0;
      
 
    for(int k = -1*start; k < (start+1); k++){
        for(int l = -1*start; l < (start+1); l++){
            //System.out.println("k = " + k + " l = " + l);      
            sum += p1[i+k][j+l];     
                }
    }
        p2[i][j] = sum/size; 
        } 
    } 
   for(i = 0; i < h; i++)   
      for(j = 0; j < w; j++)   
          if(i==0||j==0||i==h-1||j==w-1) 
              p2[i][j] = p1[i][j]; 
  }
  catch(Exception e)
  {
      System.out.println("E i = " + i + " j = " + j);
  }
   System.out.println();
	for ( i = 0; i < w; i++) {
           for ( j = 0; j < h; j++) {
               System.out.print((int)p2[i][j] + " ");
           }
           System.out.println();
       }
    } 
    
}
