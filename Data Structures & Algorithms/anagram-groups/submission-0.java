class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
        // Create sorted key from chars
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);
        String key = new String(sorted);
        
        // merge: if key exists, add s to the list; if not, create new list with s
        map.merge(key, 
            new ArrayList<>(List.of(s)), 
            (existing, newList) -> { 
                existing.addAll(newList); 
                return existing; 
            }
        );
    }
    return new ArrayList<>(map.values());
    }
}
