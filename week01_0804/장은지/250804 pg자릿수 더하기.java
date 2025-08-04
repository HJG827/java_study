package week1;

import java.util.*;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        
        while (n != 0) {
        	answer += n % 10;
        	n /= 10;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(solution(sc.nextInt()));
	}
}