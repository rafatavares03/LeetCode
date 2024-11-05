class Solution {
    public String minString(String[] strs) {
        int min = 0;
        for(int i = 1; i < strs.length; i++) {
            if(strs[min].length() > strs[i].length()) {
                min = i;
            }
        }
        return strs[min];
    }

    public String longestCommonPrefix(String[] strs) {
        String shortest = minString(strs);
        int amount = 0;
        for(int i = 0; i < shortest.length(); i++) {
            boolean valid = true;
            for(String str : strs) {
                valid = (shortest.charAt(i) == str.charAt(i)) ? true : false;
                if(valid == false) break;
            }
            if(valid == false) break;
            amount++;
        }
        return shortest.substring(0, amount);
    }
}