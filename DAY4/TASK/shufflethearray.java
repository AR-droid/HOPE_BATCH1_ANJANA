class Solution {
    public int[] shuffle(int[] nums, int n) {
       int [] arr1=new int[n];
       int [] arr2=new int[n];
       arr1=Arrays.copyOfRange(nums,0,n);
       arr2=Arrays.copyOfRange(nums,n,nums.length);
       int i=0,j=0,k=0;
       int [] result=new int[nums.length];
       while(i<arr1.length && j<arr2.length){
        result[k++]=arr1[j++];
        result[k++]=arr2[j++];
       }
       return result;
        
            
        }

        
    }
