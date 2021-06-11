
public class MoreTriangles {

	public static void niner(int big, int small){
		int n = big-small;
		for (int i = 0; i <= n; i++){
			for(int k = 0; k < i; k++){
				System.out.print(" ");
			}
			for(int j = big-i; j >= small; j--){
				System.out.print(j);
			}
			for(int j = small+1; j <= big-i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

public static void isosceles(int n) {
	for (int i = 1; i <=n; i++) {
		for(int s = 1; s <= n-i; s++) {
			System.out.print(" ");
		}
		for(int k = 1; k <= i; k++) {
			System.out.print(k);
		}
		for(int k = i-1; k>0; k--) {
			System.out.print(k);
		}
		System.out.println();
	}
}

public static void alternate(int n) {
	for(int i = 1; i <=n; i++) {
		if(i%2==1) {
			for(int k = 1; k <= i; k++) {
				System.out.print(k);
			}
		}
		else {
			for(int k = i; k>=1; k--) {
				System.out.print(k);
			}
		}
		System.out.println();
	}
}
public static void alternate2(int n) {
	for(int i = 1; i<=n; i++) {
		for(int k = 1; k<=i; k++) {
			System.out.print(k);
		}
		i++;
		System.out.println();
		for(int k = i; k>=1; k--) {
			System.out.print(k);
		}
		System.out.println();
	}
}
	public static void eights(){
	
		for(int i = 8; i >=2; i = i - 2){
			for(int j = 0; j < (8-i)/2; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pat() {
		int q=8;
		int w=0;
		for(int x=1; x<=4; x++) {
			w++;
			for(int s=0; s<w; s++) {
				System.out.print(" ");
			}
			for(int y= 1; y<q; y++) {
				System.out.print(q);
			}
			q=q-2;
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		niner(9,5);
		niner(8,3);
		niner(7,1);
		eights();
		isosceles(8);
		alternate(8);
		alternate2(7);
	}

}
