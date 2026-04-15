class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;

        /*Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        return map.size() == 26;*/
        
    }
}
//owncode
