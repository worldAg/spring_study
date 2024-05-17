package com.hello.example;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/*
	Chef를 주입 받는 Hotel 클래스
*/
@Component
@ToString
@Getter
@AllArgsConstructor // 인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자 작성
public class Hotel {
	
	private Chef chef;
	
	// @Autowired 없이 생성자 선언 후 Chef 주입
//	public Hotel(Chef chef) {
//		this.chef = chef;
//	}
	
}
