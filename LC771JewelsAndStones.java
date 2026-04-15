class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ct=0;   
        char[] j=jewels.toCharArray();
        int j_s=j.length;
        char[] s=stones.toCharArray();
        int s_s=s.length;
        for(int i=0;i<j_s;i++)
        {
            for(int k=0;k<s_s;k++)
            {
                if(j[i]==s[k])
                {
                    ct++;
                }
            }
        }
        return ct;
        /*Set<Character> s=new HashSet<>();
        for(char c:jewels.toCharArray())
        {
            s.add(c);
        }
        int ct=0;
        for(char c:stones.toCharArray())
        {
            if(s.contains(c))
            {
                ct++;
            }
        }            
        return ct;  */  
    }
}
