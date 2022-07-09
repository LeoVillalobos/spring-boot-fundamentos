package com.fundamentos.springboot.Fundamentos.bean;

public class MyBean2Implement implements IMyBean {

    @Override
    public void print() {
        System.out.print("Hola desde mi implementacion del bean 2 -----");
    }
}
