package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao somecdidao;

	public SomeCdiDao getSomecdidao() {
		return somecdidao;
	}

	public void setSomecdidao(SomeCdiDao somecdidao) {
		this.somecdidao = somecdidao;
	}
	
}
