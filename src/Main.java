/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogumYili,burcSayisi;
        String burcAdi;
        
        System.out.println("Doğum yılınızı giriniz:  ");
        dogumYili = scanner.nextInt();
        
             burcSayisi = dogumYili%12;
             
             switch(burcSayisi){
                 case 0:
                     burcAdi = "Maymun";
                     break;
                 case 1:
                     burcAdi = "Horoz";
                     break;
                     
                 case 2:
                     burcAdi ="Köpek";
                     break;
                     
                 case 3:
                     burcAdi ="Domuz";
                     break;
                     
                 case 4:
                     burcAdi ="Fare";
                     break;
                     
                 case 5:
                     burcAdi = "Öküz";
                     break;
                                       
                 case 6:
                     burcAdi ="Kaplan";
                    break;
                    
                 case 7:
                     burcAdi ="Tavşan";
                     break;
                     
                 case 8:
                     burcAdi = "Ejederha";
                     break;
                     
                 case 9:
                     burcAdi = "Yılan";
                     break;
                 case 10:
                     burcAdi ="At";
                     break;
                  
                 case 11:
                     burcAdi = "Koyun";
                     break;
                 
                 default:
                      burcAdi = "Nothing";
  
                   
                 
             }
             
           System.out.println("Çin zodyağı  burcunuz: " + burcAdi);
        
        
    }
}
