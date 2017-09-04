/**
 * 
 */
package com.spring.core.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Siddhant sahu
 *
 */
@Component
public class SecondBean {
	@Autowired
	private FirstBean bean;
	private ApplicationContext context;

	public FirstBean getBean() {
		return bean;
	}

	public void setBean(FirstBean bean) {
		this.bean = bean;
	}

	@Override
	public String toString() {
		return "SecondBean [bean=" + bean + "]";
	}

}
