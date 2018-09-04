package ta.v08;

public class Triangle {

	double ax;
	double ay;
	double bx;
	double by;
	double cx;
	double cy;
	
	public Triangle(double x1, double y1,
			 double x2, double y2,
			 double x3, double y3) {
		
		ax = x1;
		ay = y1;
		bx = x2;
		by = y2;
		cx = x3;
		cy = y3;
	}
	
	public String category() {
		double side_ab = TriangleAreaApp.point_distance(ax, ay, bx, by);
		double side_bc = TriangleAreaApp.point_distance(bx, by, cx, cy);
		double side_ca = TriangleAreaApp.point_distance(cx, cy, ax, ay);

		if ((side_ab == side_bc) && (side_bc == side_ca)) {
			return "equilateral";
		} else if ((side_ab == side_bc) || (side_ab == side_ca) || (side_bc == side_ca)) {
			return "isosceles";
		} else {
			return "scalene";
		}
	}

	public double area() {
		double side_ab = TriangleAreaApp.point_distance(ax, ay, bx, by);
		double side_bc = TriangleAreaApp.point_distance(bx, by, cx, cy);
		double side_ca = TriangleAreaApp.point_distance(cx, cy, ax, ay);

		double s = (side_ab+side_bc+side_ca)/2.0;
		return Math.sqrt(s*(s-side_ab)*(s-side_bc)*(s-side_ca));		
	}

	

}
