import java.io.Serializable;

public class Demo implements Serializable{ // 데모가 직력 가능한 객체이다 라는뜻
	/**
	 * 
	 */
	private static final long serialVersionUID = 3972910450366366136L;

	String greeting;
	
	public Demo(String greeting) {
		this.greeting = greeting;
		
	}

}
