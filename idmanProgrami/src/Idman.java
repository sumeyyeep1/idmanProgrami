import java.util.Scanner;

public class Idman {
    private int squat;
    private int mekik;
    private int sınav;
    private int barfiks;

    public Idman(int squat,int mekik,int sınav,int barfiks) {
        this.squat = squat;
        this.barfiks=barfiks;
        this.mekik=mekik;
        this.sınav=sınav;
    }

    public int getBarfiks() {
        return barfiks;
    }

    public void setBarfiks(int barfiks) {
        this.barfiks = barfiks;
    }

    public int getMekik() {
        return mekik;
    }

    public void setMekik(int mekik) {
        this.mekik = mekik;
    }

    public int getSınav() {
        return sınav;
    }

    public void setSınav(int sınav) {
        this.sınav = sınav;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }

    public void hareketYap(String hareket, int tekrar){
     if(hareket.equals("squat")){
         squatYap(tekrar);
     }
    else if(hareket.equals("mekik")){
        mekikYap(tekrar);
     }
    else if(hareket.equals("barfiks")){
        barfiksYap(tekrar);
     }
    else if(hareket.equals("sınav")){
        sınavYap(tekrar);
     }
    else{
         System.out.println("Geçersiz Hareket");
     }

        }
       public void  squatYap(int sayı){
        if(squat == 0){
            System.out.println("Yapılacak squat kalmadı...");
        }
        else if(squat-sayı <0 ){
            System.out.println("Hedefledin squat sayısını geçtin tebrikler !! ");
        }
        else{
            squat -=sayı;
            System.out.println("Kalan squat sayınız : "+squat);
        }
        }
    public void  mekikYap(int sayı){
        if(mekik == 0){
            System.out.println("Yapılacak mekik kalmadı...");
        }
        else if(mekik-sayı <0 ){
            System.out.println("Hedeflediğin mekik sayısını geçtin tebrikler !! ");
        }
        else{
            mekik -=sayı;
            System.out.println("Kalan mekik sayınız : "+mekik);
        }
    }
    public void  sınavYap(int sayı){
        if(sınav == 0){
            System.out.println("Yapılacak şınav kalmadı...");
        }
        else if(sınav-sayı <0 ){
            System.out.println("Hedefledin şınav sayısını geçtin tebrikler !! ");
        }
        else{
            sınav -=sayı;
            System.out.println("Kalan şınav sayınız : "+sınav);
        }
    }
    public void  barfiksYap(int sayı){
        if(barfiks == 0){
            System.out.println("Yapılacak barfiks kalmadı...");
        }
        else if(barfiks-sayı <0 ){
            System.out.println("Hedeflediğin barfiks sayısını geçtin tebrikler !! ");
        }
        else{
            barfiks -=sayı;
            System.out.println("Kalan barfiks sayınız : "+barfiks);
        }
    }
    public boolean ıdmanTamamlandıMı() {
        if (getSquat() == 0 && getBarfiks() == 0 && getMekik() == 0 && getSınav() == 0) {
            return true;
        } else {
            return false ;

        }
    }
    }

