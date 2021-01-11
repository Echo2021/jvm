/**
 * VM args: -Xms 20m -Xmx 20m -XX:+HeapDumpOnOutOfMemoryError
 * @author Echo
 *
 * */
public class HeapOOM{
	static class OOMObject{
	}

	public static void main(String[] args){
		List<OOMObject> list = new ArrayList<OOMObject>();

		while(true){
			list.add(new OOMObject());
		}
	}
}
