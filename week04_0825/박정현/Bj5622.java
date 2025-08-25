package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Bj5622 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toCharArray();
		
		int time = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('A', 3);
		hm.put('B', 3);
		hm.put('C', 3);
		hm.put('D', 4);
		hm.put('E', 4);
		hm.put('F', 4);
		hm.put('G', 5);
		hm.put('H', 5);
		hm.put('I', 5);
		hm.put('J', 6);
		hm.put('K', 6);
		hm.put('L', 6);
		hm.put('M', 7);
		hm.put('N', 7);
		hm.put('O', 7);
		hm.put('P',  8);
		hm.put('Q',  8);
		hm.put('R',  8);
		hm.put('S',  8);
		hm.put('T',  9);
		hm.put('U',  9);
		hm.put('V',  9);
		hm.put('W',  10);
		hm.put('X',  10);
		hm.put('Y',  10);
		hm.put('Z',  10);
		for(char ch:word) {
			time+=(int)hm.get(ch);
			System.out.println("ch: "+ch+" time: "+time);
		}
		System.out.println(time);
		
	}

}
