import java.util.HashMap;

public class LearningMaps {
	public static void main(String[] args) {
//		EXAMPLE: Employee names (String) to employee Id's (int)
		HashMap <String, Integer> empIds = new HashMap<>();
		System.out.println(empIds);
		
		empIds.put("Maria", 1);
		empIds.put("Nathan", 2);
		empIds.put("MariaJ", 3);
		empIds.put("Abby", 4);
		System.out.println(empIds);
		System.out.println(empIds.get("Maria"));
		System.out.println(empIds.replace("Maria",14));
		System.out.println(empIds.containsValue(5));
		System.out.println(empIds);
		
		
	}
}
