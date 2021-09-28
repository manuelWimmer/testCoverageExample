import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void testTestDecOrInc() {
		ToBeTested x = new ToBeTested();
		x.getPrice(200, true, false);
		//x.getPrice(200, true, true);
		//x.getPrice(200, false, false);
	}

}
