package iducs.java.b;

public class AnimalsTest {
	public static void enable(Animals animal) {
		animal.breathe();
		animal.eat();
		animal.move();
	}
	
	public static void main(String[] args) {
		Animals human = new Human();
		enable(human);
		//human.breathe();
		// ����ð��� ������ �߻���, ������ å���Ͽ� Ŭ���� ����ȯ�� ������ -> �����Ϸ��� �ϰ� ����
		//((FamilyCustomer) human).applySale(5000.00);
		
		human = new FamilyCustomer();
		enable(human);
		// Human -> Customer -> FamilyCustomer : �޼ҵ尡 �߰� , ������ ��
		//human.breathe();
		// ������ �������� ������ Ȯ��, ����ð����� ���� ��ü�� ����
		((FamilyCustomer) human).buy("��", 10000.00);
		
		human  = new VipCustomer();
		enable(human);		
		human.breathe();
		// ������ �������� ������ Ȯ��, ����ð����� ���� ��ü�� ����
		((VipCustomer) human).buy("��", 10000.00);
	}
}