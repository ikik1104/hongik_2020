import java.util.Scanner;

public class Main_Mall {

   public static void main(String[] args) {
      /* <<  20.03.05 (���θ�) ȸ������, �α���, ��ǰ����  >>
       *    1.ȸ������  - ���̵� �ߺ�üũ, ���̵���̴� 3�ڸ� �̻�, ��ü�� ArrayList����
       *    2.�α���
       *       - ArrayList �����Ϳ��� Ȯ���� �� �� map�� �����Ұ�
       *       - ���̵�/�н����� Ȯ��
       *       - ��ü �����ؼ� ArrayList ����
       *  3.�α׾ƿ� - ��ü����
       *  4.��ǰ����
       *     -Product ��� price, bonuspoint, name
       *     1) LCD_TV 2) LED_TV 3)OLED_TV ---- TV: screen, inch / hdr (���)
       *     4) �Ϲݳ����   5)�繮�������    ---- �����: liter,door / d_cooling ����ð�(���)- �繮����
       *     6) �뵹�̼�Ź��   7)�巳��Ź��   8)�帲������Ź��  ---- ��Ź�� : size,shape / Sterilization ���(���) -�巳
       *  
       *  5.��ǰ���� ��Ϻ���
       *     -��ǰ������ ����Ʈ id, ��¥
       *  
       *  8.ȸ�������˻� - ex)ȫ -> ȫ�浿,ȫ���,�蹫ȫ ��ü�˻�
       *  9.ȸ���������� - ȸ����ü������- �̸� �������� ����
       * */
      Scanner scan = new Scanner(System.in);
      Mall_excute m = new Mall_excute(); //���Ŭ���� ��ü ���� 
      m.start(); //�⺻���� Member������ �Է�
      
      loop:
      while(true) {
      
      //��������Ʈ
      int select = m.main_print();
      
      switch (select) {
      case 1://ȸ������
         m.insert();
         break;
      case 2://�α���
         m.login();
         break;
      case 3://�α׾ƿ�
         m.logout();
         break;
      case 4://��ǰ���� �� ����
         loop1:
         while(true) {
         System.out.println("-------------[   ��ǰ ���     ]--------------");
         System.out.println("1) LCD_TV      2) LED_TV     3)OLED_TV");
         System.out.println("4) �Ϲݳ����            5) �繮�������                               ");
         System.out.println("6) �뵹�̼�Ź��         7) �巳��Ź��          8)�帲������Ź�� ");
         System.out.println("----------------------------------------");
         System.out.print("���� �Ͻ� ��ǰ�� �����ϼ���. (�ڷΰ��� : 99)  >> ");
         
         switch (scan.nextInt()) {
         case 1:
            m.tv(new Lcd_Tv());
            break;
         case 2:
            m.tv(new Led_Tv());
            break;
         case 3:
            m.tv(new Oled_Tv());
            break;
         case 4:
            m.ref(new D_Ref());
            break;
         case 5:
            m.ref(new DD_Ref());
            break;
         case 6:
            m.wash(new Tong_Wash());
            break;
         case 7:
            m.wash(new D_Wash());
            break;
         case 8:
            m.wash(new DD_Wash());
            break;
         case 99:
            break loop1;
         default:
            System.out.println("[�� ERROR : �߸��� �Է��Դϴ�.]");
            break;
         }
      }
         break;
      case 5://���Ż�ǰ����
         //�α����� �ƴϸ� ����
         m.buy_list();
         break;
      case 8://ȸ������ �˻� (admin�� �� �� ����)
         m.u_select();
         break;
      case 9://ȸ������ (admin- ��ü ȸ�� / user -�ڽ��� �͸�
         m.u_list();
         break;
      case 0:
         System.out.println("[ ** �ý����� �����մϴ�. �ȳ���������. ** ]");
         break loop;

      default:
         System.out.println("[�� ERROR : �߸��� �Է��Դϴ�.]");
         break;
      }
      
      }
   }
}