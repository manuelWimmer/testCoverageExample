import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void testTestDecOrInc() {
		ToBeTested x = new ToBeTested();
		x.decOrInc(2, true, false);
		x.decOrInc(2, true, true);
		x.decOrInc(2, false, false);
	}

}
