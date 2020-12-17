package properties;

import java.io.IOException;

public class FileReader {
	public static ConfiqReader inst=null;
	private FileReader() {
		
	}
	
	public static ConfiqReader getInst() throws IOException {
		inst=new ConfiqReader();
		return inst;
	}
	

}
