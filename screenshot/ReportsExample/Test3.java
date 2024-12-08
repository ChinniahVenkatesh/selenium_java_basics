package ReportsExample;

import java.io.IOException;

public class Test3 {

	public static void main(String [] args) throws InterruptedException, IOException
	{
		Test01 t = new Test01();
		Test02 t1 = new Test02();
		
		t.main(args);
		t1.main(args);
	}
}
