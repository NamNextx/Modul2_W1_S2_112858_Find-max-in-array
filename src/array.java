import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length;
        System.out.println("Input length of array");
        System.out.print("Length: ");
        do {
            length = sc.nextInt();
            if (length > 20) {
                System.out.println("Pls input length (less than 20)");
            }
        } while (length > 20);
        int arr[] = new int[length];

        int i = 0;
        while (i < length) {
            System.out.print("Enter value arr[" + i + "]=");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println(" Your array is: ");
        display(arr,length);

        System.out.println("The maximum value in array is:"+findMax(arr));

    }
    static void display(int arr[],int length){
        for (int i=0;i<length;i++){
            System.out.println("a["+i+"] = "+arr[i]);
        }
    }

    static int findMax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }


}
