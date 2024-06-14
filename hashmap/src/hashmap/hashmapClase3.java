package hashmap;

public class hashmapClase3 {

	public static void main(String[] args) {
		Map<String, Double> productos = new HashMap<>();
		
		productos.put("camisa",25.0);
		productos.put("pantalon",40.0);
		productos.put("zapatos",60.0);
		
		System.out.println("Registro de productos:");
		for (Map.entry<String,Double entry: productos.entrySet()) {
			System.out.println("producto:" + entry.getKey() + "precio: $"+ entry,getValue());
			
		}

	}

}
