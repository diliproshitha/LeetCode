package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String str = longestCommonPrefix(strs);

        System.out.println("String: " + str);
    }

    public static String longestCommonPrefix(String[] strs) {

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int low = 0;
        int high = minLen;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (isCommonPrefix(strs, mid)) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return strs[0].substring(0, (low + high) / 2);
    }

    public static boolean isCommonPrefix(String[] strs, int length) {
        String maxStr = strs[0].substring(0, length);

        return Arrays.stream(strs).allMatch(itm -> itm.startsWith(maxStr));

    }
}
