package inherit;

public class ArrayInherit {

	public static void main(String[] args){
		Boss boss = new Boss("wk2016","many");
		Employee[] staff = new Employee[3];
		staff[0] = boss; //�൱�����ø�ֵ
		
		boss.setTalk("little");
		//staff[0].setTalk("little");  ��������staff[0]����Employee����
		//��Ϊ�������Ǿ�̬�󶨣����Բ�����staff[0]
		
		Boss[] b = new Boss[10];
		Employee[] a = b;
		a[0] = new Employee("a0");
		b[0].setTalk("error");//java.lang.ArrayStoreException
		
	}
}
