class KeyPadPhone {
    @Deprecated
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone {
    @Override
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }
}

public class CWH {
    public static void main(String args[]) {
        @SuppressWarnings("deprecation")
        AndroidPhone samsung = new AndroidPhone();
        samsung.sendMessage();
    }

    @Override
    public String toString() {
        return "CWH []";
    }
}



// public class FunctionalInterfaceExample {
//     public static void main(String args[]) {
//         System.out.println("Functional interface annotation");
//     }
// }

// @FunctionalInterface
// interface MyFunctionalInterface {
//     void thisMethod();
//     // void thisMethod2();
// }

class NewPhone /* extends Phone */ {
    @Override
    public void showTime() {
        System.out.println("Time is 8PM");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class JavaAnnotationsExample {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
    }
}
