public static void sort01(int[] bitArray) {

        int i = 0;
        int j = 0;

        while(i<bitArray.length)
        {
            if(bitArray[i] == 1)
            {
                i++;
            }
            else{
               swapInt(bitArray, i, j);
               i++;
               j++;
            }
        }
        
     }

     public static void swapInt(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
     }
