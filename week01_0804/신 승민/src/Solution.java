

public class Solution {
    public int solution(int n) {
        String[] A = String.valueOf(n).split("");

        int answer = 0;
        for (int i = 0; i<A.length; i++){
            answer = answer + Integer.parseInt(A[i]);
        }
        

        return answer;
    }
}