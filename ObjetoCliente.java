package Aula3;

public class ObjetoCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("Fabiana");
		cliente1.setId(1001);
		cliente1.setCpf("204.830.938-7");
		cliente1.setRg("65.627.145-9");
		cliente1.setTelefone("(15)99201-0681");
		
		cliente2.setNome("Renato");
		cliente2.setId(1002);
		cliente2.setCpf("463.459.726-5");
		cliente2.setRg("50.214.204-8");
		cliente2.setTelefone("(15)98144-4500");
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getTelefone());
		
		System.out.println();
		
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getTelefone());
		
	}

}
