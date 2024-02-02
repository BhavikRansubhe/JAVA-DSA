package Recursion;

public class mergeSort {

    static void merge(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];
        int idx1 = si, idx2 = mid + 1;
        int i = 0;
    
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[i++] = arr[idx1++];
            } else {
                merged[i++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[i++] = arr[idx1++];
        }
    
        while (idx2 <= ei) {
            merged[i++] = arr[idx2++];
        }
    
        for (int x = 0, j = si; x < merged.length; x++, j++) {
            arr[j] = merged[x];
        }
    }
    

    static void sort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = (si + ei)/2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }
    public static void main(String args[]) {
        int arr[] = {4, 2, 7, 3, 9, 1};
        int n = arr.length;
        sort(arr, 0, n - 1);
    
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
