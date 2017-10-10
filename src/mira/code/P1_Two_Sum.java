package mira.code;

import java.util.HashMap;

public class P1_Two_Sum {

	public int[] twoSum(int[] nums, int target) {

		if (nums == null || nums.length == 0) {
			return null;
		}

		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
			} else {
				map.put(nums[i], i);
			}

		}
		return result;
	}
}
