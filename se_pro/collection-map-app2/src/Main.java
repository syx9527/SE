import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputData = s.nextLine();
        // System.out.println(inputData);
        String[] split = inputData.split(" ");
        // System.out.println(Arrays.toString(split));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (String value : split) {
            arr.add(Integer.parseInt(value));
        }
        int N = arr.get(0);
        int S = arr.get(1);
        for (int i = 0; i < N; i++) {
            arr1.add(s.nextInt());
        }
        int res = 0;
        for (int i = 0; i < arr1.size() - 1; i++) {
            for (int j = i+1; j < arr1.size(); j++) {

                if (arr1.get(i) + arr1.get(j) <= S) {
                    res += 1;
                }
            }
        }
        System.out.println(res);
    }
}
