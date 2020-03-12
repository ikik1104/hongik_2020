
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
   //�̸�, ����, ����Ʈ, ȭ��, ��ġ
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


//�����
class D_Ref extends Ref{
   D_Ref(){
      super(1000,"�Ϲݳ����   ",160,"�Ϲ� 1��"); //����, �̸�, ����, ��
   }
}
class DD_Ref extends Ref{
   //����ð����
   
   DD_Ref(){
      super(2000,"�繮������� ",500,"�繮 2��"); //����, �̸�, ����, ��
   }
   
   void d_cooling() {
         
   }
}

//��Ź��
class Tong_Wash extends Wash{
   
   Tong_Wash(){
      super(1000,"�뵹�� ��Ź�� ",100,"�뵹��");
   }
}
class D_Wash extends Wash{
   
   D_Wash(){
      super(2000,"�巳��Ź��   ",200,"�巳");
   }
   
   //��ձ��
   void Sterilization() {

   }
}
class DD_Wash extends Wash{

   DD_Wash(){
      super(3000,"�巳������Ź�� ",300,"�巳����");
   }
   
   //��ձ��
   void Sterilization() {
            
   }
}