package co.edu.api.example;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
				HashMap<Student, String> hashMap = new HashMap<Student, String>();
				//new Student("1")의 점수 95를 저장
				hashMap.put(new Student("1"), "95");
				
				//new Student("1")의 점수 95를 읽어옴
				String score = hashMap.get(new Student("1"));
				System.out.println("1번 학생의 총점 : " + score );		
			}
		}

