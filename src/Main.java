import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km, age, tip;
        double totalPrice=0,lessTwelveYearsOldDiscount=0.5,betweenTwelveAndTwentyFourYearsOldDiscount=0.1,
                greaterThanSixtyFiveYearsOldDiscount=0.3,roundTripDiscount=0.2,discountPrice=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Yolculuk yapmak istediğiniz mesafeyi km cinsinden giriniz : ");
        km = sc.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1=>Tek Yön, 2=>Gidiş Dönüş) : ");
        tip = sc.nextInt();
        if (km > 0) {
            totalPrice+=km*0.1;
            if(age> 0) {

                if(age<12){
                    discountPrice+=totalPrice*lessTwelveYearsOldDiscount;
                }else if(age>=12 && age<=24) {
                    discountPrice += totalPrice * betweenTwelveAndTwentyFourYearsOldDiscount;
                }else if(age>=65){
                    discountPrice += totalPrice * greaterThanSixtyFiveYearsOldDiscount;
                }
                switch(tip) {
                    case 1:
                        System.out.println("Tek yön yolculuk tipi seçtiniz");
                        System.out.println("Toplam tutar : "+totalPrice);
                        break;
                    case 2:
                        System.out.println("Gidiş dönüş yolculuk tipi seçtiniz");
                        discountPrice+=(totalPrice-discountPrice)*roundTripDiscount;
                        totalPrice=(totalPrice-discountPrice)*2;
                        System.out.println("Toplam tutar : "+totalPrice);
                        break;
                    default:
                        System.out.println("Hatalı veri girdiniz.");
                }

            }else{
                System.out.println("Hatalı veri girdiniz.");
            }
        }else{
            System.out.println("Hatalı veri girdiniz");
        }

    }
}
