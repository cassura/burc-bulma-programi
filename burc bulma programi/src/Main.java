
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int day, month;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz:");
        month = input.nextInt();

        System.out.println("Günü giriniz:");
        day = input.nextInt();

        if (month==1){
            if((day<=31)&&(day>=1)){
                if (day<22) {
                    System.out.println("Oğlak burcu");
                }else {
                    System.out.println("Kova burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month==2){
            if((day<=29)&&(day>=1)){
                if (day<20){
                    System.out.println("Kova burcu");
                }else{
                    System.out.println("Balık burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month==3){
            if((day<=31)&&(day>=1)){
                if (day<20){
                    System.out.println("Balık burcu");
                }else {
                    System.out.println("Koç burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month ==4){
            if((day<=30)&&(day>=1)){
                if (day<21){
                    System.out.println("Koç burcu");
                }else {
                    System.out.println("Boğa burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month==5){
            if((day<=31)&&(day>=1)){
                if (day<22){
                    System.out.println("Boğa burcu");
                }else {
                    System.out.println("İkizler burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month==6){
            if((day<=30)&&(day>=1)){
                if (day<23){
                    System.out.println("İkizler burcu");
                }else {
                    System.out.println("Yengeç burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month==7){
            if((day<=31)&&(day>=1)){
                if (day<24){
                    System.out.println("Yengeç burcu");
                }else {
                    System.out.println("Aslan burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month==8){
            if((day<=30)&&(day>=1)){
                if (day<23){
                    System.out.println("Aslan burcu");
                }else {
                    System.out.println("Başak burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month==9){
            if((day<=30)&&(day>=1)){
                if (day<23){
                    System.out.println("Başak burcu");
                }else {
                    System.out.println("Terazi burcu");
                }
            }else{
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month==10) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 23) {
                    System.out.println("Terazi burcu");
                    } else {
                        System.out.println("Akrep burcu");
                    }
                } else {
                System.out.println("hatalı giriş yaptınız");
            }
        }
        if (month == 11) {
                if ((day <= 30) && (day >= 1)) {
                    if (day < 22) {
                        System.out.println("Akrep burcu");
                    } else {
                        System.out.println("Yay burcu");
                    }
                } else {
                    System.out.println("hatalı giriş yaptınız");
                }
        }
        if (month == 12) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 22) {
                            System.out.println("Yay burcu");
                    } else {
                            System.out.println("Oğlak burcu");
                    }
                } else {
                        System.out.println("hatalı giriş yaptınız");
                    }
                }
            }
        }