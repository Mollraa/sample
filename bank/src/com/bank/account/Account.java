package com.bank.account;

//import java.util.Date;  (년/월/일/시/분/초)
import java.sql.Date; //(년/월/일)

import lombok.Data;
import lombok.ToString;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//
//@Getter
//@Setter
//@NoArgsConstructor  //매개변수없는 기본생성자 만들어줌
//@AllArgsConstructor  // 모든 필드값을 가진 생성자

//@Data  // 위의 4개를 전부 생성함
//@ToString

@Data
@ToString
public class Account {

	private String accountId;
	private String memberId;
	private int balance;
	private Date credate;
	
	
	
	
	
}
