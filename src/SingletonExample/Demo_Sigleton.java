package SingletonExample;

public class Demo_Sigleton {
    public static void main(String[]args){

      //  illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //get the only object available

        SingleObject singleObject;
        singleObject = SingleObject.get_instance();
        singleObject.showMessage();


    }
}
