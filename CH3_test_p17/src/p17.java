
public class p17 {

	public static void main(String[] args) {
		
		Car car1;
		car1=new Car();
		car1.setNumGas(1234, 20.5);
		int number=car1.getNum();
		double gasoline=car1.getGas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����]��"+number+"�T�o�q�]��"+gasoline);
	
	}
}
class Car{

	int num;
	double gas;
	
	int getNum() {
		System.out.println("�լd����");
		return num;
	}
	double getGas() {
		System.out.println("�լd�T�o�q");
		return gas;
	}
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�����]��"+num+"�T�o�q�]��"+gas);

	}
	
	
	
}