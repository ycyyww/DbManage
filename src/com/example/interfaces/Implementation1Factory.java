/**
 * File: interfaces
 * User: YcY
 * Date: 14-7-29
 * Time: обнГ9:37
 * Describetion:
 */
package com.example.interfaces;

public class Implementation1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1();
    }
}
