package co.edu.compound;

public class ClassExam {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;

		String[] names = { "홍길동", "박민수", "김익수" };
		int[] scores = { 80, 85, 79 };
		int[] ages = { 19, 20, 19 };

		Student s1 = new Student(); // 초기화.
		s1.name = "홍길동";
		s1.age = 19;
		s1.score = 80;

		Student s2 = new Student();
		s2.name = "박민수";
		s2.age = 20;
		s2.score = 85;

		Student s3 = new Student();
		s3.name = "김익수";
		s3.age = 19;
		s3.score = 85;
		s3.height = 168.5;
		System.out.println(s3.name);

		Student[] students = { s1, s2, s3 };

		for (int i = 0; i < students.length; i++) {
			if (students[i].name.equals("김익수")) {
				System.out.println("점수: " + students[i].score);
			}
		}
		//
		Car c1 = new Car("소나타", 220); // 힙메모리에 인스턴스 생성
		c1.price = 20000000;
		c1.speed = 30;
		System.out.println("최고속도: " + c1.maxSpeed);
		c1.setSpeed(50);
		c1.start();
		c1.run();
		c1.showSpeed();
		c1.stop();
		
		Car c2 = new Car(); // 힙메모리에 인스턴스 생성
		c2.model = "K-5";
		c2.price = 22000000;
		c2.speed = 80;
		c2.start();
		c2.run();
		c2.showSpeed();
		c2.stop();
		//System.out.println(c1);
		
	}
}
