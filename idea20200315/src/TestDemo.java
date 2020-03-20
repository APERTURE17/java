import java.util.Arrays;

public class TestDemo {

    public static void bubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length-1; i++) {
            flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(!flg) {
                return;
            }
        }
    }

    public static void main1(String[] args) {
        int[] array = {1,4,3,5,8,2,7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
       }
    }

    public static void main2(String[] args) {
        int[] array = {1,4,3,5,8,2,7};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void transform(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }
            while (left < right && array[right] % 2 != 0) {
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] =  tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,4,3,5,8,2,7};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
}
