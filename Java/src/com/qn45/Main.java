package com.qn45;

class Demo {
	
    public String publicVar = "I am a Public Variable";

    protected String protectedVar = "I am a Protected Variable";

    private String privateVar = "I am a Private Variable";

    public void publicMethod() {
        System.out.println("This is a Public Method");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(privateVar);
    }

    protected void protectedMethod() {
        System.out.println("This is a Protected Method");
    }

    private void privateMethod() {
        System.out.println("This is a Private Method");
    }

}


public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();

        System.out.println(d.publicVar);

        System.out.println(d.protectedVar);

        //System.out.println(d.privateVar); //Cannot Access it as it is private.

        d.publicMethod();

        d.protectedMethod();

        //d.privateMethod(); //Cannot Access it as it is private.

    }
}
