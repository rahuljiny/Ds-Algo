package com.rahul.dataStructure.matrix;

public class PermutedMatrix {
	public static void main(String[] args)
	{
		int n = 4;
		int mat[][] = {{1, 2, 3, 4},
				{4, 1, 2, 3},
				{3, 4, 1, 2},
				{2, 3, 4, 1}
		};
		if (isPermutedMatrix(mat, n))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	private static boolean isPermutedMatrix(int[][]mat, int n){
		String str_cat="";
		for(int i=0;i<n;i++){
			str_cat=str_cat+"_"+mat[0][i];
		}
		str_cat=str_cat+str_cat;
		for(int j=1;j<n;j++){
			String curr_cat="";
			for(int k=0;k<n;k++){
				curr_cat=curr_cat+"_"+mat[j][k];
			}
			if(str_cat.contentEquals(curr_cat))
				return false;

		}
		return true;
	}
}
