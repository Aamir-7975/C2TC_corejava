package com.tns.Assignment2;

public class Volume {
	
	int volume(int r) {
		int vol = r * r * r;
		return vol;
	}
	
	double volume(double h, double r) {
		double vol = (22 / 7.0) * r * r * h;
		return vol;
	}
	
	double volume(double l, double b, double h) {
		double vol = l * b * h;
		return vol;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume obj = new Volume();
		System.out.println("Sphere Volume: " + obj.volume(9));
		System.out.println("Cylinder Volume: " + obj.volume(8, 3.5));
		System.out.println("Cuboid Volume: " + obj.volume(8.5, 4.5, 3));
		
	}

}
