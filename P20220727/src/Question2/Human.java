package Question2;

/*
 * 		- �̸��� Ű, �����Ը� �ʵ�� ������ �����ڸ� �̿��Ͽ� ���� �ʱ�ȭ�Ѵ�.
		- �޼ҵ�� ������ ���� �����Ѵ�.
		(1) public void getInformation() : �̸�, Ű�� �����Ը� ����ϴ� ���
 */

public class Human {	
	private String name;
	private int height;
	private int weight;
	
	public Human () {}
	
	public Human (String name,int height,int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation() {
		System.out.printf(name,height,weight);
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

