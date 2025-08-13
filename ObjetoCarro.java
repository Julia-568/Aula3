package Aula3;

public class ObjetoCarro {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		
		carro1.setMarca("Honda");
		carro1.setModelo("HR-V");
		carro1.setCor("Cinza");
		carro1.setQuantidadeLugar(5);
		
		carro2.setMarca("Toyota");
		carro2.setModelo("Corolla");
		carro2.setCor("Preto");
		carro2.setQuantidadeLugar(5);
		
		carro3.setMarca("Jeep");
		carro3.setModelo("Commander");
		carro3.setCor("Chumbo");
		carro3.setQuantidadeLugar(7);
		
		carro4.setMarca("Hyundai");
		carro4.setModelo("Creta");
		carro4.setCor("Branco");
		carro4.setQuantidadeLugar(5);
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getQuantidadeLugar());
		
		System.out.println();
		
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getQuantidadeLugar());
		
		System.out.println();
		
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getCor());
		System.out.println(carro3.getQuantidadeLugar());
		
		System.out.println();
		
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getCor());
		System.out.println(carro4.getQuantidadeLugar());
		
		
	}

}
