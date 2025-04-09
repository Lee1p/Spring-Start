package com.test.begin.di9;

import org.springframework.stereotype.Component;

//<bean class="com.test.begin.di9.Hong" id="hong"></bean>
// 아래 어노테이션 Component가 지금 위에 bean 이랑 똑같은 방법임. 
@Component
public class Hong {

	public void work() {
		System.out.println("업무를 진행합니다.");
	}
	
}
