package Singleton;

import Singleton.SingleObject;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // illegal construct
        // compile Time error : The Constructor SingleObject is not visible
        // SingleObject object = new SIngleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // show message
        object.showMessage();
    }
}