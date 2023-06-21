public static void radixSort(int[] arr) {

        int max = Integer.MIN_VALUE;
        for(int i:arr)
        {
            max = Math.max(max, i);
        }

        int exp = 1;
        while(exp <= max)
        {

            countSortRedix(arr, exp);
            exp = exp*10;
        }
        
     }

     public static void countSortRedix(int[] arr, int exp) {
        // here we need to make frequency array for digits so the length will be 10
        int[] freq = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            int idx = arr[i]/exp%10;
            freq[idx]++;
        }

        for(int i=1;i<freq.length;i++)
        {
            freq[i] = freq[i] +freq[i-1];
        }

        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            int idx = arr[i]/exp%10;
            ans[--freq[idx]] = arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = ans[i];
        }
        
     }
