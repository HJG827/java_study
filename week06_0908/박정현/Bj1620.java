package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj1620 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String, String> pokemon = new HashMap<String, String>(200000);
		for (int i=1;i<N+1;i++) {
			String pokemonName = bf.readLine();
			pokemon.put(Integer.toString(i), pokemonName);
			pokemon.put(pokemonName, Integer.toString(i));
		}
		for (int i=0;i<M;i++) {
			String result = pokemon.get(bf.readLine());
			System.out.println(result);
		}
	}

}
