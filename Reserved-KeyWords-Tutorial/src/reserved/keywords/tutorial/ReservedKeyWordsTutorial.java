/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserved.keywords.tutorial;

/**
 *
 * @author Administrator
 */
public class ReservedKeyWordsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        displayFirstEvenNumber(new int[]{5, 3, 4, 8, 8});
        displayMonth(1);
    }

    private static void displayMonth(int i) {
        switch (i) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Month unknown");
        }
    }

    private static void displayFirstEvenNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }

}
