package Chap08;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BidAmount {

	public static void main(String[] args) {
	//testcast 2개로 TEST
		int[] n = {4,6}; // 물품갯수
		int[][] amounts = {
				{ 1000000, 490000, 700000, 290000 },
				{30000, 70000, 10000}};// 참가자들의 자본
		
		BidAmount ex = new BidAmount();
				
		for(int i=0;i<n.length; i++) {
			System.out.println("==========testcase " + i + "번째");
			int[] result = ex.solution(n[i], amounts[i]);
			System.out.println(Arrays.toString(result));
		}	
	}


	private int[] solution(int i, int[] js) {
		int m = js.length; // 참가자 수
		int[] prices = new int[i];
		int[] result = new int[i];
		int[][] member = new int[m][2];
		
	    // 맴버 등록
		for(int j = 0; j < m; ++m) {
			member[j][0] = j;
			member[j][1] = js[j];
		}
		
		// 구매 결정
		// 자본 가장 많은 것부터 구하기
		
		for(int num = 0; num < js.length; ++i) {
			prices[num] = js[num];
			Arrays.sort(prices);
			
			result[num] = js[i-1] + 10000; // 낙찰 금액 넣기
			
		}
		
		
		/*
		 * int[] bidMoney = {}; int[] result = {}; Arrays.sort(js); for(int num = 0; num
		 * < i; ++i) { bidMoney[num] = js[num]; }
		 */
		
		
		return result;
	}

}
