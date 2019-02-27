
public class Matrika {

	public static void main(String[] args) {
		double[][] a = {{1,2},{3,4},{5,6}};
		double[][] b = {{1,2,3,4},{5,6,7,8}};
		double[][] c = zmnozi(a,b);
		if (c == null) System.out.println("Matrik ni možno množiti.");
		else {
			for (int i = 0; i < c.length; ++i) {
				for (int j = 0;j < c[i].length; ++j) {
					System.out.print(c[i][j] + "\t");
				}
				System.out.println();
			}
		}

	}
	
	public static double[][] zmnozi(double[][] a, double[][] b) {
		int n = a.length;
		int m = a[0].length;
		int p = b.length;
		int r = b[0].length;
		if (m != p) return null;
		double[][] c = new double[n][r];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < r; ++j) {
				for (int k = 0; k < m; ++k) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
}
