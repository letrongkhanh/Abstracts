package advance.dev;

public class MainApp {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];
		input(shapes);
		print(shapes);
		findLargestArea(shapes);
		findLargestAreaForEachShape(shapes);
	}

	static void input(Shape[] shapes) {
		// Nhập thông tin cho mảng các hình
		// Ví dụ:
		shapes[0] = new Circle(5); // Hình tròn bán kính 5
		shapes[1] = new Rectangle(4, 6); // Hình chữ nhật có chiều dài 4 và chiều rộng 6
		// Thêm các hình khác tương tự
	}

	static void print(Shape[] shapes) {
		// In thông tin các hình trong mảng
		for (Shape shape : shapes) {
			if (shape != null) {
				System.out.println("Chu vi: " + shape.chuVi());
				System.out.println("Diện tích: " + shape.dienTich());
				System.out.println();
			}
		}
	}

	static void findLargestArea(Shape[] shapes) {
		// Tìm diện tích lớn nhất trong mảng các hình
		double maxArea = Double.MIN_VALUE;
		Shape largestShape = null;

		for (Shape shape : shapes) {
			if (shape != null && shape.dienTich() > maxArea) {
				maxArea = shape.dienTich();
				largestShape = shape;
			}
		}

		System.out.println("Diện tích lớn nhất: " + maxArea);
	}

	static void findLargestAreaForEachShape(Shape[] shapes) {
		// Tìm diện tích lớn nhất của mỗi loại hình
		double maxCircleArea = Double.MIN_VALUE;
		double maxRectangleArea = Double.MIN_VALUE;
		double maxTriangleArea = Double.MIN_VALUE;

		for (Shape shape : shapes) {
			if (shape instanceof Circle && shape.dienTich() > maxCircleArea) {
				maxCircleArea = shape.dienTich();
			} else if (shape instanceof Rectangle && shape.dienTich() > maxRectangleArea) {
				maxRectangleArea = shape.dienTich();
			} else if (shape instanceof Triangle && shape.dienTich() > maxTriangleArea) {
				maxTriangleArea = shape.dienTich();
			}
		}

		System.out.println("Diện tích lớn nhất của hình tròn: " + maxCircleArea);
		System.out.println("Diện tích lớn nhất của hình chữ nhật: " + maxRectangleArea);
		System.out.println("Diện tích lớn nhất của tam giác: " + maxTriangleArea);
	}
}
