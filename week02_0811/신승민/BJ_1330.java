import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1330{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] A = br.readLine().split(" ");
        int a = Integer.parseInt(A[0]);
        int b = Integer.parseInt(A[1]);
        
        if (a > b) System.out.println(">");
        else if (a == b) System.out.println("==");
        else System.out.println("<");
            
        // int result = A[0].compareTo(A[1]);
        // if (result>0){
        //     System.out.println(">");
        // }
        // else if (A[0].equals(A[1])) {
        //     System.out.println("==");
        // }
        // else {
        //     System.out.println("<");
        // }
    }
}