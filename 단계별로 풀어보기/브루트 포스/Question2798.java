package y202501.d04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2798 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int cardNum = Integer.parseInt(strings[0]);
            int targetValue = Integer.parseInt(strings[1]);
            int[] cards = new int[cardNum];

            String[] card = reader.readLine().split(" ");

            // 카드 입력
            for (int i = 0; i < cardNum; i++) {
                cards[i] = Integer.parseInt(card[i]);
            }

            System.out.println(getTotalValueSum(cardNum, cards, targetValue));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getTotalValueSum(int cardNum, int[] cards, int targetValue) {
        int totalValueSum = 0;

        for (int i = 0; i < cardNum - 2; i++){
            for (int j = i + 1; j < cardNum - 1; j++){
                for (int k = j + 1; k < cardNum; k++){
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= targetValue && sum > totalValueSum) {
                        totalValueSum = sum;
                    }
                }
            }
        }
        return totalValueSum;
    }
}
