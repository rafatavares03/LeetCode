class longets_common_prefix {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}