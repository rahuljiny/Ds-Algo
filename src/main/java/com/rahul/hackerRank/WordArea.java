package com.rahul.hackerRank;

import java.util.UUID;

public class WordArea {
	public static void main(String[] args) {
		int[] h={1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		String word="abc";
		System.out.println(designerPdfViewer(h,word));
	}

	static int designerPdfViewer(int[] h, String word) {


		int maxHeight=Integer.MIN_VALUE;
		for(int i=0;i<word.length();i++){
			int height=h[word.charAt(i)-'a'];
			if(height>maxHeight){
				maxHeight=height;
			}
		}
		return maxHeight*word.length();
	}
}
