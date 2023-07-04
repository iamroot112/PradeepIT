package in.pradeep.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean,DisposableBean {
	public Motor() {
		// TODO Auto-generated constructor stub
		System.out.println("motor - constructor");
	}
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("after propertiesset() method called");
}
@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	
	System.out.println("destroy() method called");
}

}
