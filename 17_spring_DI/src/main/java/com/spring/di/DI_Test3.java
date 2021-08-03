package com.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*

	# IoC(Inversion of Control)

	- IoC(제어권의 역전)이란, 객체의 생성, 생명주기의 관리까지 모든 객체에 대한 제어권(개발자 > 스프링 프레임워크)이 바뀌었다는 것을 의미한다.
	- 스프링 프레임워크에서 객체에 대한 생성 및 연결 및 생명주기를 관리할 수 있는 기능을 IoC 컨테이너를 이용하여 제공하고 있다.
	- POJO의 생성, 초기화, 서비스, 소멸에 대한 작업을 처리한다.


	# 의존성 주입(Dependency Injection)

 	- 각 클래스간의 의존관계를 IoC 컨테이너가 자동으로 연결해주는 것
	- 컨테이너가 흐름의 주체가 되어 애플리케이션 코드에 의존관계를 주입해 주는 것이다.
	- 개발자들은 단지 설정파일에서 의존관계가 필요하다는 정보를 추가하면 된다.

	[동작과정]
	1) 구현 클래스의 정보를 xml(설정파일)에 기술 하거나 클래스에 어노테이션을 명시한다. 
	2) Framework( IoC 컨테이너)에서 설정파일을 읽거나 어노테이션을 읽어들인다. 
	3) 구현객체를 생성하며 서로 의존관계가 있는지 확인하여 객체를 연결한다.

 	@Autowired	: 스프링 어노테이션		, 타입에 맞추어서 연결	
 	@Inject		: 자바 표준 어노테이션	, 타입에 맞추어서 연결	, Dependency추가 이후 사용 가능
 	@Resource	: 자바 표준 어노테이션	, 이름에 맞추어서 연결

*/

@Controller
public class DI_Test3 {
	
		@Autowired
		private CharacterManager2 cm2;
		
		@Autowired
		private Hunter hunter;
		
		@Autowired
		private Warrior warrior;
		
		@Autowired
		private Wizard wizard;
	
		@RequestMapping(value="/test3" , method=RequestMethod.GET)
		public String test3() {
			cm2.setHunter(hunter);
			cm2.setWarrior(warrior);
			cm2.setWizard(wizard);
			
			cm2.printHunterInfo();
			cm2.printWarriorInfo();
			cm2.printWizardInfo();
			
			return "home";
		}

}
