
public class Product {
   int price;
   int bonusPoint;
   String name;
   
}

class Tv extends Product{
   String screen;
   int inch;
   
   Tv(){   }
   Tv(String name, int price, String screen, int inch){
      this.name = name;
      this.price = price;
      this.screen = screen;
      this.inch = inch;
      this.bonusPoint = price/10;
   }
   
}
class Ref extends Product{
   int liter;
   String door; //1or2
   boolean hdr = false;
   
   Ref(){  }
   Ref(int price, String name, int liter, String door) {
      this.price = price;
      this.name = name;
      this.liter = liter;
      this.door = door;
      this.bonusPoint = price/10;
   }
   

}
class Wash extends Product{
   int size;
   String shape;
   
   Wash(){   }
   Wash(int price, String name, int size, String shape){
      this.price = price;
      this.name = name;
      this.size = size;
      this.shape = shape;
      this.bonusPoint = price/10;
   }
   
   
}

//Tv
class Lcd_Tv extends Tv{
   //이름, 가격, 포인트, 화면, 인치
   Lcd_Tv(){
      super("Lcd_TV  ",1000,"LCD",65);
   }
}
class Led_Tv extends Tv{
   
   Led_Tv(){
      super("Led_TV  ",2000,"LED",75);
   }
}
class Oled_Tv extends Tv{
   
   Oled_Tv(){
      super("Oled_Tv ",3000,"OLED",55);
   }
}


//냉장고
class D_Ref extends Ref{
   D_Ref(){
      super(1000,"일반냉장고   ",160,"일반 1개"); //가격, 이름, 리터, 문
   }
}
class DD_Ref extends Ref{
   //더블냉각기능
   
   DD_Ref(){
      super(2000,"양문형냉장고 ",500,"양문 2개"); //가격, 이름, 리터, 문
   }
   
   void d_cooling() {
         
   }
}

//세탁기
class Tong_Wash extends Wash{
   
   Tong_Wash(){
      super(1000,"통돌이 세탁기 ",100,"통돌이");
   }
}
class D_Wash extends Wash{
   
   D_Wash(){
      super(2000,"드럼세탁기   ",200,"드럼");
   }
   
   //살균기능
   void Sterilization() {

   }
}
class DD_Wash extends Wash{

   DD_Wash(){
      super(3000,"드럼건조세탁기 ",300,"드럼건조");
   }
   
   //살균기능
   void Sterilization() {
            
   }
}