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
//    //这里提供了一个供外部访问本class的静态方法，可以直接访问
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

