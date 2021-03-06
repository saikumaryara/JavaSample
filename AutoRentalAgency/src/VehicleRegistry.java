import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class VehicleRegistry {

	private List<Vehicle> list =Collections.synchronizedList(new ArrayList<Vehicle>());
	private Map<String, Vehicle> map=Collections.synchronizedMap(new HashMap<String, Vehicle>());

	Vehicle v1 = new Vehicle("Volvo", "S80", 2008, 10, "VBG984");
	Vehicle v2 = new Vehicle("BMW", "M8", 2019, 12, "VBG985");
	Vehicle v3 = new Vehicle("Ferrari", "Roma", 2020, 15, "VBG986");

	
	public void addList() {
		list.add(v1);
		list.add(v2);
		list.add(v3);
		System.out.println("added objects count= "+list.size());
	}
	public void getObjects() {
		for(Object v:list) {
			System.out.println(v);
		}
	}
	public void getList() {
		System.out.println("get object "+list.get(1));
	}
	public void removeList() {
		System.out.println("removed object"+list.remove(2));
	}
	public void setMaps() {
		map.put("VBG984",v1);
		map.put("VBG985",v2);
		map.put("VBG986",v3);
	}
	public Object getMaps(String licence) {
		
		Object v1=map.get(licence);

		return v1;
	}
	
}

 