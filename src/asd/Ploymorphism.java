package asd;

interface Parent//����ӿ�
{
    public void simpleCall();
}
class Child_A implements Parent
{
    public void simpleCall()
    {
    //�����ʵ��ϸ�ڣ�
    	System.out.println("study");
    }
}
 
class Child_B implements Parent
{
    public void simpleCall()
    {
    //�����ʵ��ϸ�ڣ�
    	System.out.println("read");
    }
}

public class Ploymorphism {
	public static void main(String[] args) {
		Parent pa = new Child_A();
		pa.simpleCall();
	}

}
