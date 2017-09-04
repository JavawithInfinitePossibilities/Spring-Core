/**
 * 
 */
package com.spring.core.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Siddhant sahu
 *
 */
@Component
public class FirstBean {
	@Autowired
	private SecondBean bean;

	
	public SecondBean getBean() {
		return bean;
	}

	public void setBean(@Lazy SecondBean bean) {
		this.bean = bean;
	}

	@Override
	public String toString() {
		return "FirstBean [bean=" + bean + "]";
	}
}
