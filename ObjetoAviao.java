package Aula3;

public class ObjetoAviao {
	
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		Aviao aviao4 = new Aviao();
		
		aviao1.setCompanhia("Azul");
		aviao1.setModelo("Embraer E195-E2");
		aviao1.setCor("Azul com detalhes verde e amarelo");
		aviao1.setPotencia("23 mil lbf por motor");
		
		aviao2.setCompanhia("GOL");
		aviao2.setModelo("Boeing 737-800 Next Generation");
		aviao2.setCor("Laranja e branco");
		aviao2.setPotencia("27 mil lbf por motor");
		
		aviao3.setCompanhia("LATAM");
		aviao3.setModelo("Airbus A320neo");
		aviao3.setCor("Branco com detalhes azul e vermelho");
		aviao3.setPotencia("27 mil lbf por motor");
		
		aviao4.setCompanhia("Emirates");
		aviao4.setModelo("Boeing 777-300ER");
		aviao4.setCor("Branco com logotipo vermelho e dourado");
		aviao4.setPotencia("115 mil lbf por motor");
		
		System.out.println(aviao1.getCompanhia());
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getPotencia());
		
		System.out.println();
		
		System.out.println(aviao2.getCompanhia());
		System.out.println(aviao2.getModelo());
		System.out.println(aviao2.getCor());
		System.out.println(aviao2.getPotencia());
		
		System.out.println();
		
		System.out.println(aviao3.getCompanhia());
		System.out.println(aviao3.getModelo());
		System.out.println(aviao3.getCor());
		System.out.println(aviao3.getPotencia());
		
		System.out.println();
		
		System.out.println(aviao4.getCompanhia());
		System.out.println(aviao4.getModelo());
		System.out.println(aviao4.getCor());
		System.out.println(aviao4.getPotencia());
		
		
	}

}
