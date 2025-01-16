import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz...");
        String idmanlar = "Hareketler \n"
                +"Squat \n"
                +"Mekik\n"
                +"Şınav\n"
                +"Barfiks\n" ;
   System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun ");
        System.out.print("Squat Sayısı : ");
        int squat = scanner.nextInt();
        System.out.print("Mekik Sayısı : ");
        int mekik = scanner.nextInt();
        System.out.print("Şınav Sayısı : ");
        int sınav = scanner.nextInt();
        System.out.print("Barfiks Sayısı : ");
        int barfiks = scanner.nextInt();
        scanner.nextLine();

        Idman ıdman = new Idman(squat,mekik,sınav,barfiks);
        System.out.println("İdmanınız Başlıyor....");
        while(ıdman.ıdmanTamamlandıMı() == false){
            System.out.print("Hareket Türü: ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız :");
            int sayı = scanner.nextInt();
            scanner.nextLine();
            ıdman.hareketYap(tur,sayı);
        }
        System.out.println("İdmanını Başarıyla Tamamladın Tebriklerr !!");
    }
}