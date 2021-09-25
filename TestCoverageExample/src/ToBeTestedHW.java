public class ToBeTestedHW {
	
	public int complexMethod(int x, int y, boolean a, boolean b){
		if (a) {
			while(x > 0) {
				x--;
			}	
		}else {
			while(x < 100) {
				x++;
				if(b) {
					while(y > 5) {
						x++;
						y--;
						if(y == x) {
							continue;
						}
					}
				}
			}	
			
		}
		return x;
	}
}
