package learningtest.jdk;

import java.util.Locale;

public class HelloUppercase implements ProxyTest.Hello {
    ProxyTest.Hello hello;

    public HelloUppercase(ProxyTest.Hello hello) {
        this.hello = hello;
    }

    @Override
    public String sayHello(String name) {
        return hello.sayHello(name).toUpperCase();
    }

    @Override
    public String sayHi(String name) {
        return hello.sayHi(name).toUpperCase();
    }

    @Override
    public String sayThankYou(String name) {
        return hello.sayThankYou(name).toUpperCase();
    }
}
