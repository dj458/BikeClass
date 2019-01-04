package hackerRank;


public class FraudNotifiCountingSorting {

    private static int solve(int[] expenditure,  int d) {
        int ans = 0;
        int MAX_EXPENDITURE=200;
        int[] histogram = new int[MAX_EXPENDITURE + 1];

        // Carry a histogram of the last d expenditures
        for (int i = 0; i < d; i++) {
            histogram[expenditure[i]] = histogram[expenditure[i]] + 1;
        }

        for (int i = d; i < expenditure.length; i++) {
            int cursor = 0;
            int currentAmount = expenditure[i];
            double median = 0;
            int left = -1;
            int right = -1;
            for (int e = 0; e <= MAX_EXPENDITURE; e++) {
                cursor += histogram[e];
                if (d % 2 == 1) {
                    // Odd -> Pick middle one for median
                    if (cursor >= d / 2 + 1) {
                        median = e;
                        break;
                    }
                } else {
                    // Even -> Pick average of two middle values for median
                    if (cursor == d / 2) {
                        left = e;
                    }

                    if (cursor > d / 2 && left != -1) {
                        right = e;
                        median = (left + right) / 2.0;
                        break;
                    }

                    if (cursor > d / 2 && left == -1) {
                        median = e;
                        break;
                    }
                }

            }

            if (currentAmount >= 2 * median) {
                ans++;
            }

            // Update histogram: slide window 1 index to right
            histogram[expenditure[i - d]] = histogram[expenditure[i - d]] - 1;
            histogram[expenditure[i]] = histogram[expenditure[i]] + 1;
        }


        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int [] newArr=new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5};
        int[] newArr2=new int [] {1, 2, 3, 4, 4};
        solve(newArr,5);


    }
}