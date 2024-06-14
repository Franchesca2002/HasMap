package hashmap;

public class hashmapClase2 {

	public static void main(String[] args) {
		Map<String, String> coordenadas = new HashMap<>();
		
		coordenadas.put("(10, 20)","casa");
		coordenadas.put("(30, 40)","Trabajo");
		coordenadas.put("(50, 60)","parque");
		
		System.out.println("coordenadas de lugares");
		for (Map.Entry<String, String> entry: coordenadas.entrySet()) {
			System.out.println("coordenadas: + entry.getKey()+",lugar:" + entry.getValue()")
		}

	}

}
