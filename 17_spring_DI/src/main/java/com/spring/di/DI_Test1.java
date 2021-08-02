package com.spring.di;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DI_Test1 {

	@RequestMapping(value="/test1" , method=RequestMethod.GET)
	public String test1() {
		
		System.out.println("1. 클래스 내부에서 외부 객체를 생성한 예시");
		
		CharacterManager1 cm1 = new CharacterManager1();
		
		cm1.printWarriorInfo();
		cm1.printWizardInfo();
		cm1.printHunterInfo();
		
		System.out.println("/n2. 생성자를 통하여 외부객체를 주입한 예시"); //유지보수가 유연함.
		
		CharacterManager2 cm2_1 = new CharacterManager2(new Warrior());
		cm2_1.printWarriorInfo();
		
		CharacterManager2 cm2_2 = new CharacterManager2(new Wizard());
		cm2_2.printWizardInfo();
		
		CharacterManager2 cm2_3 = new CharacterManager2(new Hunter());
		cm2_3.printHunterInfo();
		
		System.out.println("/n3. setter 메서드를 통하여 외부객체를 주입한 예시");
		
		CharacterManager2 cm3_1 = new CharacterManager2();
		cm3_1.setWarrior(new Warrior());
		cm3_1.printWarriorInfo();
		
		CharacterManager2 cm3_2 = new CharacterManager2();
		cm3_2.setWizard(new Wizard());
		cm3_2.printWizardInfo();
		
		CharacterManager2 cm3_3 = new CharacterManager2();
		cm3_3.setHunter(new Hunter());
		cm3_3.printHunterInfo();
		
		return "home";
	}
}
