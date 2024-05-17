package com.hello.example;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/*
	Chef를 주입 받는 Hotel 클래스
*/
@Component
@ToString
@Getter
//@AllArgsConstructor // 인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자 작성
public class Hotel {
	
	@NonNull // 여러 인스턴스 변수들 중 특정 변수에 대해서만 생성자 작성
	private Chef chef;
	
	// @Autowired 없이 생성자 선언 후 Chef 주입
//	public Hotel(Chef chef) {
//		this.chef = chef;
//	}
	
}
