import java.util.Scanner;
public class KGİRİS {
    public static void main(String[] args){
      String kadi,sifre,yenisifre;
      int secim;
      Scanner inp=new Scanner(System.in);
              System.out.println("Kullanıcı adınızı giriniz;");
              kadi=inp.nextLine();
              System.out.println("Sifrenizi giriniz; ");
              sifre=inp.nextLine();
              if(kadi.equals("selcuk")){

                  if(sifre.equals("123123")){
                      System.out.println("Giriş yaptınız..");
                  }
                  else {
                      System.out.println("hatalı şifre girişi yaptınız");
                      System.out.println("şifrenizi yenilemek ister misiniz?");
                      System.out.println("Evet/1 - Hayır/2");
                      secim = inp.nextInt();
              switch (secim){
                  case 1:
                      System.out.println("yeni şifrenizi giriniz:");
                      yenisifre= inp.next();
                      if(yenisifre.equals("123123")){
                          System.out.println("yeni şifre eski şifreyle aynı olamaz lütfen yeniden başlatın");
                      }
                      else{
                          System.out.println("Şifreniz başarıyla değiştirildi");
                      }
                      break;
                  case 2:
                      System.out.println("Şifre yenilememeyi seçtiniz lütfen yeniden başlatın");
                      break;
                  default:
                      System.out.println("Hatalı seçim yaptınız lütfen yeniden başlatın");
                      break;
              }
                  }
              }
              else{
                  System.out.println("kullanıcı adınızı yanlış girdiniz lütfen yeniden başlatın");
              }
    }
}

