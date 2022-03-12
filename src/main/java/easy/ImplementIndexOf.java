package easy;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementIndexOf {

    public static void main(String[] args) {
        String haystack = "", needle = "";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        int m = haystack.length();
        int n = needle.length();

        int i = 0;

        while (i <= m - n) {
            if (haystack.charAt(i) != needle.charAt(0) || haystack.charAt(i + n -1) != needle.charAt(n - 1)) {
                i++;
                continue;
            }

            int j = 0, k = 0;
            if( haystack.charAt(i) == needle.charAt(0)){
                k=i;
                j = 0;

                while( k<m && j<n && haystack.charAt(k) == needle.charAt(j) ) {
                    k++; j++;
                }
                if( j == n )
                    return i;
            }

            i++;
        }

        return -1;
    }


}
