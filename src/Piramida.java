
public class Piramida {

	int n;

	public int getN() {
		return n;
	}

	public Piramida(int n) {
		this.n = n;
	}

	public void Print() {

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= i * 2; j++) {
				System.out.print((n + 1) - i);
			}
			for (int j = i; j <= n; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Piramida p1 = new Piramida(5);
		p1.Print();
	}

}
