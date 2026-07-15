class Solution {


    public boolean isAnagram(String s, String t) {
        if (s == t) return true;
        if (s == null || t == null) return false;
        final int n = s.length();
        if (n != t.length()) return false;

        final int[] counts = new int[26];
        final char[] a = s.toCharArray();
        final char[] b = t.toCharArray();

        for (int i = 0; i < n; i++) {
            counts[a[i] - 'a']++;
            counts[b[i] - 'a']--;
        }
        for (int c : counts) if (c != 0) return false;
        return true;    }

    }