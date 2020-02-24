package interview.java.practice.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem statement at following link
 * 
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * 
 * @author tgirase
 *
 */
public class Solution {
	public static void main(String[] args) {
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		int totalPairs = 0;
		int n = 9;
		int[] arr = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		for (int i = 0; i < n; i++) {
			int count = result.getOrDefault(arr[i], 0);
			count++;
			if (count == 2) {
				totalPairs++;
				result.put(arr[i], 0);
			} else {
				result.put(arr[i], 1);
			}
		}
		System.out.println(totalPairs);
	}

}
