import java.util.Scanner;

public class CalculadoraXP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de missões: ");
        int totalMissoes = scanner.nextInt();

        int xpBase = 50;
        int xpTotal = 0;

        for (int missao = 1; missao <= totalMissoes; missao++) {
            if (missao <= 100) {
                xpTotal = missao * xpBase;
            } else {
                xpTotal = 100 * xpBase + (missao - 100) * (xpBase * 2);
            }
        }

        System.out.println("Total de XP ganho: " + xpTotal);

        scanner.close();
    }
}



