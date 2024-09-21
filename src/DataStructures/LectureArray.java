package DataStructures;

public class LectureArray {
    public static void main(String[] args) {
        ArrayItem[] arr = new ArrayItem[10];

        arr[0] = new ArrayItem("Kerem",123);
        arr[1] = new ArrayItem("Ali",1234);
        arr[2] = new ArrayItem("Ahmet",12345);

        int[] num = new int[50];
        int[] num2 = new int[30];
        for(int i = 0; i < 50; i++) {
            num[i] = (int) (Math.random() * 100) + 1;  // [0,1)
        }
        //bubbleSort(num);
        for(int i = 0; i < 50; i++) {
            System.out.print( num[i] + ",");
        }
        System.out.println("\n-------------------------------");
        for(int i = 0; i < 30; i++) {
            num2[i] = (int) (Math.random() * 200) + 1;  // [0,1)
        }

        // num
        // num2
        bubbleSort(num);
        bubbleSort(num2);
        int[] res = new int[num.length + num2.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < num.length && j < num2.length) {
            if (num[i] < num2[j]) {
                res[idx] = num[i];
                i++;
                idx++;
            } else {
                res[idx] = num2[j];
                j++;
                idx++;
            }
        }
        while(i < num.length) {
            res[idx] = num[i];
            i++;
            idx++;
        }
        while(j < num2.length) {
            res[idx] = num2[j];
            j++;
            idx++;
        }


        for(int k = 0; k < num.length; k++) {
            System.out.print(num[k] + " ");
        }

        System.out.println();

        for(int k = 0; k < num2.length; k++) {
            System.out.print(num2[k] + " ");
        }

        System.out.println();

        for(int k = 0; k < res.length; k++) {
            System.out.print(res[k] + " ");
        }

    }

    public static void bubbleSort(int[] num) {
        boolean flag;
        do {
            flag = true;
            for (int i = 1; i < num.length; i++) {
                if (num[i] < num[i - 1]) {
                    int tmp = num[i];
                    num[i] = num[i - 1];
                    num[i - 1] = tmp;
                    flag = false;
                }
            }
        } while (!flag);
    }
}
