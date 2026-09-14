class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> s1 = new HashSet <> ();
        HashSet <Integer> s2 = new HashSet <> ();

        for(int num: nums1){
            s1.add(num);
        }

        for(int num: nums2){
            s2.add(num);
        }

        int[] result = new int[Math.min(s1.size(), s2.size())];

        int k =0;
        for(int num : s1){
            if(s2.contains(num)){
                result[k] = num;
                k++;
            }
        }

        return Arrays.copyOfRange(result,0 ,k);


    }
}