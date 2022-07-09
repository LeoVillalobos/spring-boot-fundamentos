package com.fundamentos.springboot.Fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements IComponentDependency{
    @Override
    public void saludar() {
        System.out.print("Componente dos");
    }
}
