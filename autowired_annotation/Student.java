package autowired_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	//@Autowired
	private final Mobile mobile;
	
//	public Student() {
//	}
	public Student( Mobile mobile) {
		this.mobile = mobile;
	}
	public Mobile getMobile() {
		return mobile;
	}
	
	//@Autowired
//	public void setMobile(Mobile mobile) {
//		this.mobile = mobile;
//	}
}
