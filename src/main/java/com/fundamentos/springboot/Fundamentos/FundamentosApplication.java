package com.fundamentos.springboot.Fundamentos;

import com.fundamentos.springboot.Fundamentos.bean.IMyBean;
import com.fundamentos.springboot.Fundamentos.bean.IMyBeanWithDependency;
import com.fundamentos.springboot.Fundamentos.bean.ITypeDay;
import com.fundamentos.springboot.Fundamentos.component.IComponentDependency;
import com.fundamentos.springboot.Fundamentos.component.IComponentTickets;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private IComponentDependency componentDependency;
	private IMyBean myBean;
	private IMyBeanWithDependency myBeanWithDependency;

	private ITypeDay typeDay;

	private IComponentTickets iComponentTickets;
	public FundamentosApplication (@Qualifier("componentTwoImplement") IComponentDependency componentDependency,
								   IMyBean myBean, IMyBeanWithDependency myBeanWithDependency, ITypeDay typeDay,
								   @Qualifier("componentTicketMEX")IComponentTickets iComponentTickets) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.typeDay = typeDay;
		this.iComponentTickets = iComponentTickets;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		typeDay.ClimaDia();
		iComponentTickets.ticketCompra("Pantalones", 350.20);
	}
}
