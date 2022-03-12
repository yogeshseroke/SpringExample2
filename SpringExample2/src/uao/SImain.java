package uao;

import java.util.Set;

import dao.SIexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bao.SILogic;

public class SImain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Resource res=new ClassPathResource("applicationContext.xml");
			BeanFactory bf=new XmlBeanFactory(res);
			SIexample s=(SIexample)bf.getBean("si");
			float output=new SILogic().calculateSI(s.getP(),s.getR(),s.getT());
			System.out.println(output);
	}

}
