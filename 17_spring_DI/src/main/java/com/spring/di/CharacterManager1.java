package com.spring.di;

public class CharacterManager1 {
	
	/*
	 *  - 클래스 내부에서 다른 객체를 생성
	 *  
	 *   > CharacterManager1클래스는 Warrior, Wizard, Hunter 클래스에 의존한다.
	 *   > 의존성이 강하다.
	 *   > 결합력이 강하다.
	 * 
	 * */
	
	Warrior warrior = new Warrior();
	Wizard wizard = new Wizard();
	Hunter hunter = new Hunter();
	
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
