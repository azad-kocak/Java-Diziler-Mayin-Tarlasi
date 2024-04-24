import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] mayınlıalan = {{1, 2}, {1, 3}, {1, 5}, {2, 4}};
        int kalanhakkınız = 3;
        int kurtulmaya_yakınlığınız = 0;

        System.out.println("Kurtulmak için 5 kere doğru bilmelisiniz.");
        System.out.println("Giriş hakkınız 3'tür.");
        System.out.println("Oyuna hoşgeldiniz.");
        System.out.println("5'e 5'lik dışında bir alan diyemezsiniz.");


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("x koordinatını giriniz:");
            int x = scanner.nextInt();
            System.out.println("y koordinatını giriniz:");
            int y = scanner.nextInt();

            boolean mayınlı = false;
            for (int[] mayın : mayınlıalan) {
                if (mayın[0] == x && mayın[1] == y) {
                    mayınlı = true;
                    break;
                }
            }

            if (mayınlı) {
                kalanhakkınız--;
                System.out.println("Kalan hakkınız: " + kalanhakkınız);
                if(kalanhakkınız==0){
                    System.out.println("sistemden çıkılıyor");
                    break;
                }
            } else {
                kurtulmaya_yakınlığınız++;
                System.out.println("Kurtulmaya bir adım daha yaklaştınız: " + kurtulmaya_yakınlığınız);
            }


        } while (kalanhakkınız > 0 && kurtulmaya_yakınlığınız < 5);
    }
}

