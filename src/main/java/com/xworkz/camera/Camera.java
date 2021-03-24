package com.xworkz.camera;

public class Camera {

	public Camera() {
		System.out.println(this.getClass().getSimpleName() + "Object Created");
	}

	public void takePhoto() {
		System.out.println("invoked takePhoto()");
		System.out.println("Taking Photo");
	}

	public void recordVideo() {
		System.out.println("invoked recordVideo()");
		System.out.println("Recording Video");
	}

	public void storeData() {
		System.out.println("invoked storeData()");
		System.out.println("Storing Data");
	}

	public void watchVideo() {
		System.out.println("invoked watchVideo()");
		System.out.println("Watching Video");
	}
}
