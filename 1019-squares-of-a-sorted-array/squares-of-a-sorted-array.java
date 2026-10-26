import java.util.ArrayList;
class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int[] res = new int[n];

        for(int i= 0; i<n; i++){
            if(nums[i]<0){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }

        if(arr1.size()==0){
            for(int i = 0; i < n; i++){
                res[i]= nums[i]*nums[i];
            }

            return res;
        }

        if(arr2.size()==0){
            for(int i =0; i < n; i++){
                res[i]= nums[i]*nums[i];
            }
            int i =0;
            int j=res.length-1;
            while(i<j){
                int temp = res[i];
                res[i]= res[j];
                res[j]= temp;
                i++;
                j--;
            }
            return res;
        }

        int[] arr11 = new int[arr1.size()];
        for(int i=0; i< arr1.size() ; i++){
            arr11[i] = arr1.get(i)*arr1.get(i);
        }
        int i= 0;
        int j= arr11.length-1;
        while(i<j){
            int temp = arr11[i];
            arr11[i]= arr11[j];
            arr11[j]= temp;
            i++;
            j--;
        }

        int[] arr22 = new int[arr2.size()];
        for(int k=0; k< arr2.size() ; k++){
            arr22[k] = arr2.get(k)*arr2.get(k);
        }

        int l=0;
        int m=0;
        int id=0;

        while(l<arr11.length && m<arr22.length){
            if(arr11[l]<arr22[m]){
                res[id] = arr11[l];
                id++;
                l++;
            }else{
                res[id] = arr22[m];
                id++;
                m++;
            }
        }

        while(l<arr11.length){
            res[id] = arr11[l];
            id++;
            l++;
        }
        while(m<arr22.length){
            res[id] = arr22[m];
            id++;
            m++;
        }
        
        return res;
    }
}