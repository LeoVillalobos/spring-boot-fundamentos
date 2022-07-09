package com.fundamentos.springboot.Fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements IComponentDependency {

    @Override
    public void saludar() {
        System.out.print("hola desde mi componente");
    }
}
