/**
 * File: interfaces
 * User: YcY
 * Date: 14-7-29
 * Time: обнГ11:59
 * Describetion:
 */
package com.example.interfaces;

public class Factories {
    public static void serviceConsume(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsume(new Implementation1Factory());
        serviceConsume(new Implementation2Factory());
    }
}
