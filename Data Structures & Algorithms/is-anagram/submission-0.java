class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> mapS = new HashMap<>();
      HashMap<Character,Integer> mapT = new HashMap<>();

      for(Character c: s.toCharArray()){
        mapS.put(c, mapS.getOrDefault(c, 0)+1);
      }
      for(Character c: t.toCharArray()){
        mapT.put(c, mapT.getOrDefault(c, 0)+1);
      }
      return mapS.equals(mapT);
    }
}
