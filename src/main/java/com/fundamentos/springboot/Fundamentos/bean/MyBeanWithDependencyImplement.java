package com.fundamentos.springboot.Fundamentos.bean;

public class MyBeanWithDependencyImplement implements IMyBeanWithDependency {

    private IMyOperation myOperation;

    public MyBeanWithDependencyImplement(IMyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        System.out.print(myOperation.sum(1));
        System.out.print("Hola desd ela implementacion de un bean con dependencia");
    }
}
