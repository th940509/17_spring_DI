package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DI_test2 {
	@RequestMapping(value="/test2" , method=RequestMethod.GET)
	public String test2() {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:CharacterApplicationContext.xml");
	
		// 방법 1)
		//CharacterManager2 cm2 = context.getBean("characterManager2" , CharacterManager2.class);
		
		// 방법 2) 객체가 유일한 경우만 id를 생략하여 사용이 가능
		//CharacterManager2 cm2 = context.getBean("characterManager2" , CharacterManager2.class);
		
		// 방법 3) 
		CharacterManager2 cm2 = (CharacterManager2)context.getBean("characterManager2");
		
		System.out.println("XML파일을 통한 객체 주입");
		
		Warrior warrior1 = context.getBean("warrior" , Warrior.class);
		Wizard wizard1   = context.getBean("wizard"  , Wizard.class);
		Hunter hunter1_1 = context.getBean("hunter1" , Hunter.class);
		Hunter hunter1_2 = context.getBean("hunter2" , Hunter.class);
		
		cm2.setWarrior(warrior1);
		cm2.printWarriorInfo();
		
		cm2.setWizard(wizard1);
		cm2.printWizardInfo();
		
		cm2.setHunter(hunter1_1);
		cm2.printHunterInfo();
		
		cm2.setHunter(hunter1_2);
		cm2.printHunterInfo();
		
		return "home";
	}
}
