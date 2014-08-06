/**
 * File: interfaces
 * User: YcY
 * Date: 14-7-29
 * Time: обнГ11:58
 * Describetion:
 */
package com.example.interfaces;

public class Implementation2Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation2();
    }
}
