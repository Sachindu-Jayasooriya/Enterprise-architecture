/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mythread;

/**
 *
 * @author SACHINDU JAYASOORIYA
 */
public class Mythread extends Thread {
    @Override
    public void run(){
        System.out.println("thread is running");
    z

    public static void main(String[] args) {
      Mythread t = new Mythread();
      t.start();
    }
}
