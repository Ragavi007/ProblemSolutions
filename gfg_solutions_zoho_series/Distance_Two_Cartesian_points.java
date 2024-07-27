package gfg_Solutions;
/*  Given coordinates of 2 points on a cartesian plane,
  find the distance between them rounded up to nearest integer.
  */

public class Distance_Two_Cartesian_points {
/*	public int distance(int x1, int y1, int x2, int y2){
		return (int) Math.round(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
		
    }
    */
	public double distance(double x1, double y1, double x2, double y2){
		return  Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
    }

	public static void main(String[] args) {
		Distance_Two_Cartesian_points o = new Distance_Two_Cartesian_points();
		System.out.println(o.distance(3, 4, 4, 3));
	}

}
