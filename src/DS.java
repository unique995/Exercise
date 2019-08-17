public class DS {

    public static void QuickSort(int []array,int low,int high){
        if (low < high){
            int mid = GetMid(array,low,high);
            QuickSort(array,low,mid-1);
            QuickSort(array,mid+1,high);
        }
    }
    public static int GetMid(int []array,int low,int high){
        int key = array[low];
        while (low < high){

            while (low < high && array[high] > key){
                high--;
            }
            array[low] = array[high];

            while (low < high && array[low] < key){
                low++;
            }

            array[high] = array[low];
        }
        array[low] = key;
        return low;
    }
    public static void Bubble(int []array){
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length-1-i;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void InsertSort(int[] array){
        int i,j,key;
        for (i = 1;i < array.length;i++){
            key = array[i];
            for (j = i-1;j >= 0;j--){
                if(key > array[j]){
                    break;
                }else
                    array[j+1] = array[j];
            }
            array[j+1] = key;
        }
    }
    public static void SelectSort(int []array){
        for (int i = 0;i < array.length-1;i++){
            int minIndex = i;
            for (int j = i+1;j < array.length;j++){
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (minIndex != i){
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void Shell(int []array,int gap){
        for (int i = gap;i < array.length;i++){
            int j;
            int key = array[i];
            for (j = i - gap;j >= 0;j -= gap){
                if (array[j] < key){
                    break;
                }else
                    array[j+gap] = array[j];
            }
            array[j+gap] = key;
        }
    }
    public static void Gap(int []array){
        int gap = array.length;
        while (true){
            gap = gap/3 + 1;
            Shell(array,gap);
            if (gap == 1)
                break;
        }
    }
    public static void MergeSort(int []array,int left,int right){
        if (left >= right)
            return;
        int mid = (left+ right)/2;
        int start1 = left;
        int end1 = mid;
        int start2 = mid+1;
        int end2 = right;
        MergeSort(array,start1,end1);
        MergeSort(array,start2,end2);
        Merge(array,start1,end1,start2,end2);
    }

    public static void Merge(int []array,int start1,int end1,int start2,int end2){

        /*
        如果左边数组arr[left...mid]中的元素取完，则直接copy右边数组的元素到辅助数组
        右边同理
        我只要不断地取出两个有序数组中比较小的那一个放在一个辅助数组中（通过比较）
         */
        int []temp = new int[end2-start1+1];
        int i = 0;
        int start = start1;
        while (start1 <= end1 && start2 <= end2){
            if (array[start1] < array[start2]){
                temp[i++] = array[start1++];
            }else {
                temp[i++] = array[start2++];
            }
        }
        while (start1 <= end1){
            temp[i++] = array[start1++];
        }
        while (start2 <= end2){
            temp[i++] = array[start2++];
        }
        for (int j = 0;j < temp.length;j++){
            array[start+j] = temp[j];
        }

    }
    public static int[]  HeapSort(int []arr,int length){
        //构建二叉堆
        for (int i = (length-2)/2;i >= 0;i--){
            arr = DownAdjust(arr,i,length);
        }
        for (int i = length-1;i >= 1;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            arr = DownAdjust(arr,0,i);
        }
        return arr;
    }
    public static int[] DownAdjust(int[] arr,int parent,int length){
        int temp = arr[parent];
        int child = 2 * parent +1;
        while (child < length){
            if (child + 1 < length && arr[child] > arr[child+1]){
                child++;
            }
            if (temp <= arr[child]){
                break;
            }
            arr[parent] = arr[child];
            parent = child;
            child = 2 * parent +1;
        }
        arr[parent] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int []arr = new int[]{2,3,1,4,5};
        //QuickSort(arr,0,arr.length-1);
        //Bubble(arr);
        //InsertSort(arr);
        //SelectSort(arr);
        //Gap(arr);
        MergeSort(arr,0,arr.length-1);
        //HeapSort(arr,arr.length);
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
