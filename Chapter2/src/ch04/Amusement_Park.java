package ch04;
import java.util.Arrays;

public class Amusement_Park {

	public static void main(String[] args) {
		
		int tickets1 = 10;
		int tickets2 = 8;
		int tickets3 = 20000;
		int manNum;
		int[][] requests1 = {
				{1,7},
				{2,4},
				{2,3},
				{3,5}
		};
		int[][] requests2 = {
				{1,9},
				{2,5},
				{3,6}
		};
		int[][] requests3 = {
				{3,1},
				{2,5},
				{2,10},
				{3,8},
				{1,2}
		};
		
		System.out.printf("보유 티켓 수 : %d, 판매 티켓 수 : %d\n", tickets1, solution(tickets1, requests1));
		System.out.printf("보유 티켓 수 : %d, 판매 티켓 수 : %d\n", tickets2, solution(tickets2, requests2));
		System.out.printf("보유 티켓 수 : %d, 판매 티켓 수 : %d\n", tickets3, solution(tickets3, requests3));
	}

	private static int solution(int tickets, int[][] requests) {
		// 람다식을 이용하여 내림차순 정렬
		Arrays.sort(requests, (a, b) -> b[0] - a[0]);
		
		// 판매된 티켓 수
		int soldTickets = 0;
		
		// 인자로 받은 배열의 값을 받음
		for(int[] i : requests) {
			int grade = i[0];
			int requestTicket = i[1];
			
			// 보유 티켓수와 필요한 티켓수를 비교하여 판매 가능 여부 확인
			int sellTicket = Math.min(tickets, requestTicket);
			
			if (sellTicket == 0) {
				System.out.println("티켓이 모두 매진되었습니다.");
				break;
			}
			
			// 판매 시, 판매 티켓수를 보유 티켓값에서 뺴고 남은 판매 티켓수에 더함
			tickets -= sellTicket;
			soldTickets += sellTicket;
		
		}
		return soldTickets;
		
	}

}
