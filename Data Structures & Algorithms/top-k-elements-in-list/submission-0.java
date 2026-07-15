class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> count = new HashMap<>();
       Map<Integer,List<Integer>> freq = new HashMap<>();
       
       for(int i = 1 ; i < nums.length+1; i++){
            freq.put(i, new ArrayList<Integer>());
       }

       for(int n :nums){
            count.merge(n, 1, Integer::sum);
       }

count.forEach((num, frequency) -> {
    if (freq.get(frequency) == null) {
        freq.put(frequency, new ArrayList<>());
    }
    freq.get(frequency).add(num);
});


       List<Integer> res = new ArrayList<>();
       
    for (int i = nums.length; i >= 0; i--) {
    List<Integer> bucket = freq.get(i);
    if (bucket != null) {
        for (int num : bucket) {
            res.add(num);
            if (res.size() == k) return res.stream().mapToInt(n -> n).toArray();
        }
    }
}
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
