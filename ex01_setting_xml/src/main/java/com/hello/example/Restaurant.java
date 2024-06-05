package com.hello.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

/*
	Chef를 주입 받는 Restaurant 클래스(= Restaurant 객체는 Chef 타입의 객체를 필요로 함) 
 */
@Component // 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시
@Data      // Lombok의 setter 생성 기능 및 생성자, toString() 등을 자동 생성하도록 함
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired) // onMethod 속성으로 생성되는 setChef()에 @Autowired 추가하도록 함
	private Chef chef;

}
