package com.spring.di;

import org.springframework.stereotype.Component;

@Component
public class CharacterManager2 {
	
	/*
	 *  - 클래스 외부에서 생성된 객체를 주입
	 *  
	 *  > 의존성이 약하다.
	 *  > 결합력이 역하다.
	 * 
	 * */
	
	Warrior warrior;
	Wizard wizard;
	Hunter hunter;
	
	public CharacterManager2() {} //기본 생성자
	
	
	//방법 1) 생성자를 통한 외부객체 주입
	public CharacterManager2(Warrior warrior) {
			this.warrior = warrior;
	}
	public CharacterManager2(Wizard wizard) {
		this.wizard = wizard;
	}
	public CharacterManager2(Hunter hunter) {
		this.hunter = hunter;
	}


	
	//방법 2) setter 메서드를 통한 외부객체 주입
	
	public Warrior getWarrior() {
		return warrior;
	}
	
	
	public void setWarrior(Warrior warrior) {
		this.warrior = warrior;
	}
	
	
	public Wizard getWizard() {
		return wizard;
	}
	
	
	public void setWizard(Wizard wizard) {
		this.wizard = wizard;
	}
	
	
	public Hunter getHunter() {
		return hunter;
	}
	
	
	public void setHunter(Hunter hunter) {
		this.hunter = hunter;
	}
	
	//테스트 및 확인용
	void printWarriorInfo() {
		System.out.println(warrior.getOccupation() + "/" + warrior.getLevel());
	}
	void printWizardInfo() {
		System.out.println(wizard.getOccupation() + "/" + wizard.getLevel());
	}
	void printHunterInfo() {
		System.out.println(hunter.getOccupation() + "/" + hunter.getLevel());
	}
}
