package taksimetre_hesapla;

import java.util.Scanner;

public class Taksimetre_Hesapla {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double acilis = 10; 
        double indi_bindi = 20;
        double km_fiyat = 2.2;
        
        System.out.println("Taksimetre Hesaplama Uygulamasına Hoşgeldiniz...");
        
        // Kullanıcıdan veri girişi almak için kullanılır.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Taksimetre Açılış Ücreti : " + acilis + "\n"
                         + "İndi - Bindi Ücreti : " + indi_bindi +"\n"
                         + "Kilometre Ücreti : " + km_fiyat);
        
        System.out.print("Lütfen Kaç Kilometre Seyahat Ettiğinizi Girin : ");
        double km = scanner.nextDouble();
        
        double borc = (km_fiyat * km ) ;
        if((borc) < indi_bindi){
            System.out.println("Ödemeniz : İndi - Bindi " + indi_bindi + " TL. ");
        }
        else{
            System.out.println("Ödemeniz : " + borc + " TL. ");
        }
    }
    
}
