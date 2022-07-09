package com.fundamentos.springboot.Fundamentos.bean;

public class MyOperationImplement implements IMyOperation {
    @Override
    public int sum(int number) {
        return number+1;
    }
}
