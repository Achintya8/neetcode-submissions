class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        int left=0;
        int right=cleaned.length()-1;
        cleaned = cleaned.toLowerCase();
        System.out.println(cleaned);
        while(left<=right){
            if(cleaned.charAt(left)!=cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
