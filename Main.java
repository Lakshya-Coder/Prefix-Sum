public class Main {
    public static void main(String[] args) {
        // I created a method which take -> (array, i, j)
        // Time Complexty of an algo - O(n)
        // Space Complexty of an algo - O(1)

        int[] arr = { 6, 3, -2, 4, -1, 0, -5 };
        int n = arr.length;

        // Range Query variable!
        int i = n - 3, j = n - 1;

        System.out.println(solution(arr, i, j));
    }

    public static int solution(int[] arr, int i, int j) {

        int n = arr.length;

        for (int index = 1; index < n; index++) {
            arr[index] = arr[index - 1] + arr[index];
        }

        int ans = i == 0 ? arr[j] : arr[i] - arr[j];
        return ans;
    }
}