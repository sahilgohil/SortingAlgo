public static<T extends Comparable> void quickSelect(T[] arr, int lo, int hi, int k) {

        if(lo>hi)
        {
            return;
        }

        T pivot = arr[hi];
        int pivotIdx = partitionArray(arr, pivot, lo, hi);

        if(pivotIdx>k)
        {
            quickSelect(arr, lo, pivotIdx-1, k);
        }
        else if(pivotIdx < k)
        {
            quickSelect(arr, pivotIdx+1, hi, k);
        }
        else{
            System.out.println((k+1)+"th smallest element is : "+arr[pivotIdx]);
        }
        
     }
