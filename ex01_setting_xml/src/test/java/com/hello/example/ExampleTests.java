package com.hello.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.*;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // 테스트 시 필요한 클래스 지정
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // 지정한 문자열로 필요한 객체들을 스프링 내 객체로 등록
@Log4j
public class ExampleTests {
	
	@Setter(onMethod_ = { @Autowired }) // 해당 인스턴스 변수를 특정 객체 타입의 빈으로 스프링으로부터 자동 주입하도록 함
	private Restaurant restaurant; // new 생성자 없이 객체 생성 가능(스프링은 객체(Bean)을 어노테이션 등을 사용하여 객체를 생성하고 관리)
	
	@Test // 테스트 대상임을 표시
	public void testExist() {
		assertNotNull(restaurant); // restaurant null일 경우 테스트 실패
		
		log.info(restaurant); // Restaurant 객체의 Chef 인스턴스 변수에 Chef 타입의 객체가 주입된 것을 확인 가능
		log.info("-----------------------------");
		log.info(restaurant.getChef());
	}
}
