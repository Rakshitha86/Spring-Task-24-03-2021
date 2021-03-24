package com.xworkz.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		String springxml = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(springxml);
		Camera camera = container.getBean(Camera.class);
		camera.takePhoto();
		camera.recordVideo();
		camera.storeData();
		camera.watchVideo();
	}

}
