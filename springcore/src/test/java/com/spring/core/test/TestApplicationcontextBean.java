/**
 * 
 */
package com.spring.core.text;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.core.bean.FirstBean;
import com.spring.core.bean.SecondBean;
import com.spring.core.bean.SpringcoreBean;

/**
 * @author Siddhant sahu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Spring-Application-cfg.xml")
public class TestApplicationcontextBean {
	@Autowired
	private ApplicationContext context;

	@Ignore
	public void testFirstBean() {
		SpringcoreBean bean = context.getBean("springcoreBean", SpringcoreBean.class);
		System.out.println(bean);
	}

	@Test
	public void cyclicDependency() {
		FirstBean firstBean = context.getBean("firstBean", FirstBean.class);
		SecondBean secondBean = context.getBean("secondBean", SecondBean.class);
		System.out.println(firstBean + "<==============>" + secondBean);
	}
}
