   public static void findPivotInRotetedSorted(int[] arr) {

        int lo = 0;
        int hi = arr.length-1;

        while(lo<hi)
        {
            int mid = lo + ((hi-lo)/2);
            if(arr[mid] < arr[hi])
            {
                hi = mid;
            }
            else{
                lo = mid+1;
            }
        }
        System.out.println("Pivot is : "+arr[hi]);
        
     }
