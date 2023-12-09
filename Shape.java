import java.lang.Math;


abstract class Shape {
	public abstract void surfaceArea();
		
	public abstract void volume();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}}
	class Sphere extends Shape {
		double radius = 4;
		public void volume() {
			double volume = ((4/3)*Math.PI*(Math.pow(radius, 3)));
			System.out.println("The volume of the sphere is: " + volume);
		}
		public void surfaceArea()	{
			double surfaceArea = (4*Math.PI*(Math.pow(radius, 2)));
			System.out.println("The volume of the sphere is: " + surfaceArea);
		}}
		
	
	class Cylinder extends Shape {
		double radius;
		double height;
		public void volume() {
			double volume = ((4/3)*Math.PI*(Math.pow(radius, 3)));
			System.out.println("The volume of the sphere is: " + volume);
		}
		public void surfaceArea()	{
			double surfaceArea = (4*Math.PI*(Math.pow(radius, 2)));
			System.out.println("The volume of the sphere is: " + surfaceArea);
		}}
	
	class Cone extends Shape {
		double radius;
		double height;
		public void volume() {
			double volume = ((4/3)*Math.PI*(Math.pow(radius, 3)));
			System.out.println("The volume of the sphere is: " + volume);
		}
		public void surfaceArea()	{
			double surfaceArea = (4*Math.PI*(Math.pow(radius, 2)));
			System.out.println("The volume of the sphere is: " + surfaceArea);
		}}



