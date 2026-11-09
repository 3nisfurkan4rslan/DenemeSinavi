import java.util.Scanner;

public class Sinav {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Deneme sinavınız hesaplanacaktır.");
        
        System.out.println("Dogru sayisi");
        
        int dogru = sc.nextInt();
        
        System.out.println("yanlis sayisi");
        
        int yanlis = sc.nextInt();
        
        int topsoru = dogru + yanlis;
       
        int bos = 20 - topsoru;
      
                double net = dogru - (yanlis / 4.0);
                
                
                
                
                
                
        
        if (dogru < 0 || yanlis < 0 || dogru > 20 || yanlis > 20 || topsoru > 20) { 
            
            
        
        System.out.println("Hatalı, hatalı rakam girdiniz");
        
        
        
        
         } else if (net > -5 && 5 > net) { 
 System.out.println("Soru sayimiz: 20,dogru sayisi:" + dogru + ",yanlis sayisi:" + yanlis + ",bos sayisi:" + bos + ",net sayisi:" + net + ",Seviyen: geliştirilmeli");
       
     } else if (net >= 5 && 10 >= net) {
      System.out.println("Soru sayimiz:20, doğru sayisi:" + dogru + ",yanlis sayisi:" + yanlis + ",bos sayisi:" + bos + ",net sayisi:" + net  +", Seviyen:orta.");
                    
                 
           } else if (net > 10 && 15 >= net) {
                   
                 System.out.println("Soru sayimiz: 20,dogru sayisi:" + dogru + ",yanlis sayisi:" + yanlis + ",bos sayisi:" + bos + ",net sayisi:" + net + ",durum:iyi.");
                } else {
                System.out.println("Toplam soru sayisi: 20,doğru sayisi:" + dogru + ",yanlis sayisi:" + yanlis + ",bos sayisi:" + bos + ",net sayisi:" + net + ",durum:cok iyi.");    
                 
                }
        
        
        
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }