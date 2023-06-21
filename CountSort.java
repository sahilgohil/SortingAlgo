public static void countSort(int[] arr, int min, int max) {
        int range = max-min+1;
        int[] freq = new int[range];
        int[] ans = new int[arr.length];

    
        // fill the frequency array
        for(int i=0;i<arr.length;i++)
        {
            int idx = arr[i]-min;
            freq[idx]++;
        }

        // make the prefix sum of frequency array
        for(int i=1;i<freq.length;i++)
        {
            freq[i] = freq[i] + freq[i-1];
        }

        for(int i=arr.length-1;i>=0;i--)
        {
            int element = arr[i];
            int eleIdx = element-min;
            ans[--freq[eleIdx]] = element;
            
        }
        for(int i=0;i<arr.length;i++)       
        {
            arr[i] = ans[i];
        }
     }
