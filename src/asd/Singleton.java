package asd;

public class Singleton {
	private static Singleton instance=null;

    public static synchronized Singleton getInstance(){

        if(instance==null){

               instance=new Singleton();

        }

        return instance;

    }
//    private Singleton(){
//
//    }
//    private static final Singleton instance = new Singleton();
//
//    private Singleton(){
//
//        //do something
//
//    }
//
//    //�����ṩ��һ�����ⲿ���ʱ�class�ľ�̬����������ֱ�ӷ���
//
//    public static Singleton getInstance(){
//
//        return instance;
//
//    }
    public void doSomething(){

        System.out.println("singleton is doing something");

    }
    public static void main(String args[]){

        Singleton.getInstance().doSomething();

    }
}

