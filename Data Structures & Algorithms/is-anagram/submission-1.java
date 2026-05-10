class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> ls = new HashMap<>();
        for(char ch:s.toCharArray()){
            ls.put(ch,ls.getOrDefault(ch,0)+1);
        } 
        for(char ch:t.toCharArray()){
            if(!ls.containsKey(ch) || ls.get(ch)==0){
                return false;
            }
            ls.put(ch,ls.getOrDefault(ch,0)-1);
        }
        return true;
    }
}
