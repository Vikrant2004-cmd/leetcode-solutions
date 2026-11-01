class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minLength = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
                minIndex = i;
            }
        }

        String shortest = strs[minIndex];
        for (int i = 0; i < shortest.length(); i++) {

            char current = shortest.charAt(i);

            for (int j = 0; j < strs.length; j++) {

                if (strs[j].charAt(i) != current) {
                    return shortest.substring(0, i);
                }
            }
        }

        return shortest;
    }
}