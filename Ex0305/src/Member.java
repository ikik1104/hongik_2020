
class Member{
	String id;	//���̵�
	String pw;	//��й�ȣ
	String name;	//�̸�
	String tel;	//��ȭ��ȣ
	int money;	//�ܾ�?
	int bonuspoint;	//����Ʈ
	
	Member(){
		
	}
	Member(String id, String pw, String name, String tel){
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.bonuspoint = 0;
		this.money = 10000;
	}
	
}