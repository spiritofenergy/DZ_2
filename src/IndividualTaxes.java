


import java.util.Scanner;

public class IndividualTaxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] incomes = new int[size];
        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = scanner.nextInt();
        }
        int[] percents = new int[size];
        for (int i = 0; i < percents.length; i++) {
            percents[i] = scanner.nextInt();
        }
        int max1 = 0;
        int max_index1 = 0;

        for (int i = 0; i < incomes.length; i++) {
            if (percents[i] > max1) {
                max1 = percents[i];
                max_index1 = i;
            }
        }

        int max2 = 0;
        int max_index2 = 0;

        for (int i = 0; i < percents.length; i++) {
            for (int j = i + 1; j < percents.length; ++j) {
                if (percents[i] > max2) {
                    max2 = percents[i];
                    max_index2 = i;
                    {
                        if (percents[j] > max2) {
                            max2 = percents[j];
                            max_index2 = j;
                        }
                    }
                    if (percents[i] == percents[j]) {
                        System.out.println(max_index1 + 1);
                        break;
                    } else {
                        System.out.println(max_index2 + 1);
                        break;
                    }
                }
            }
        }
    }
}

