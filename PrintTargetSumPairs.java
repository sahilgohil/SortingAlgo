  public static void printTargetSumPairs(int[] arr, int target) {

        int l = 0;
        int r = arr.length-1;

        Arrays.sort(arr);

        while(l!=r)
        {
            int sum = arr[l] + arr[r];

            if(sum < target)
            {
                l++;
            }
            else if(sum > target)
            {
                r--;
            }
            else{
                System.out.println(arr[l]+" + "+arr[r]);
                l++;
                r--;
            }
        }
        
     }
