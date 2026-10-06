class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
       return false;
      /* else
       {
        int count[]=new int[26];
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++)
            count[t.charAt(i)-'a']--;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
            return false;
        }
        return true;
       }*/
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        if(map.containsKey(s.charAt(i)))
        map.put(s.charAt(i),map.get(s.charAt(i))+1);
        else
        map.put(s.charAt(i),1);
       }
       for(int i=0;i<t.length();i++)
       {
        if(map.containsKey(t.charAt(i)))
        map.put(t.charAt(i),map.get(t.charAt(i))-1);
        else
        return false;
       }
       for(int value:map.values())
       {
        if(value!=0)
        return false;
       }
       return true;
    }
}