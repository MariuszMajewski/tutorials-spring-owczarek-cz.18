package pl.mrmario.tutorials.spring.owczarek.cz18;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBean implements BeanNameAware,ApplicationContextAware{
	private String name;
	private ApplicationContext applicationContext;
	private void init() {
		Map<String, SomeBean> beansOfType = applicationContext.getBeansOfType(SomeBean.class);
		System.out.println("Nazywam siê "+name +". Jest nasz ju¿ "+ beansOfType.size());
	}

	@Override
	public void setBeanName(String name) {
		
		this.name = name;
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}
	
}
