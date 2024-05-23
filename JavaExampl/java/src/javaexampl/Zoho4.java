package javaexampl;

class Zoho4 {
    public int[] twoSum(int[] numbers, int target) {

        int start=0;
        int end=numbers.length-1;//3

        while(start<end)
        {
            if(numbers[start]+numbers[end]==target)
                return new int[]{start+1,end+1};

            if(numbers[start]+numbers[end]<target)
                start++;
            else
               end--;
        }
        return new int[]{};

    }
    public static void main(String[] args) {
    	int arr[] = {4,3,2,1};
    	Zoho4 z=new Zoho4();
    int a[]=	z.twoSum(arr, 5);
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]);
    }
    }
}