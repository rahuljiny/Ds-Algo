package com.rahul.hackerRank;

public class Time {


	public static void main(String[] args) {
		System.out.println(timeInWords(1, 1));
	}

	static String timeInWords(int h, int m) {
		String response="";
		boolean beforeHalf=m<=30;
		String[] hours = new String[]{ "twelve", "one",
				"two", "three", "four",
				"five", "six", "seven",
				"eight", "nine","ten","eleven","twelve"};

		String[] minutes = new String[]{ "o' clock", "one",
				"two", "three", "four",
				"five", "six", "seven",
				"eight", "nine","ten","eleven","twelve", "thirteen", "fourteen", "quarter",
				"sixteen", "seventeen",
				"eighteen", "nineteen", "twenty",
				"twenty one", "twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven",
				"twenty eight","twenty nine","half",};


		String[] tens_multiple = new String[]{"", "", "twenty"};

		if(m==0){
			return hours[h] + " " +minutes[m];
		}
		if(beforeHalf){
			if(m%15==0){
				response= minutes[m] + " past " +hours[h];
			}else{
				if(m==1){
					response= minutes[m] + " minute past " +hours[h];
				}else {
					response= minutes[m] + " minutes past " +hours[h];
				}
			}
		}else {
			m=60-m;
			if(m==15){
				response= minutes[m] + " to " +hours[h+1];
			}else{
				if(m==1){
					response= minutes[m] + " minute to " +hours[h+1];
				}else {
					response= minutes[m] + " minutes to " +hours[h+1];
				}

			}
		}
		return response;
	}
}
