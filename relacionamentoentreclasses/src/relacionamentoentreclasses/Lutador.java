package relacionamentoentreclasses;

/*Classe encapsula dados e funcionalidades e 
pode relacionar uma classe com outra.
Ex:
Agragação : 
*/
public class Lutador implements AcaoLutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private float getAltura() {
		return altura;
	}

	private void setAltura(float altura) {
		this.altura = altura;
	}

	private float getPeso() {
		return peso;
	}

	private void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (getPeso() < 52.2) {
			categoria = "invalido";
//			System.out.println("Peso: "+getPeso()+" Categoria: "+categoria);
		} else if (peso <= 70.3) {
			categoria = "Leve";
//			System.out.println("Peso: "+getPeso()+" Categoria: "+categoria);
		} else if (peso <= 83.9) {
			categoria = "Medio";
//			System.out.println("Peso: "+getPeso()+" Categoria: "+categoria);
		} else if (peso <= 120.2) {
			categoria = "Pesado";
//			System.out.println("Peso: "+getPeso()+" Categoria: "+categoria);
		} else {
			categoria = "invalido";
//			System.out.println("Peso: "+getPeso()+" Categoria: "+categoria);
		}
	}


	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
		System.out.println("ganhou !!!");
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
		System.out.println("perdeu !!!");
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
		System.out.println("empatou !!!");
	}

	public Lutador(
			String nome, 
			String nacionalidade, 
			int idade, 
			float altura, 
			float peso, 
			int vitorias,
			int derrotas, 
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	@Override
	public void apresentar() {
		System.out.println("------------APRESENTAÇÃO");
		System.out.println("Lutador: " + getNome());
		System.out.println("País: " + getNacionalidade());
		System.out.println(getIdade() + " anos.");
		System.out.println("Pesando: " + getPeso() + " kg. Na CATEGORIA: "+getCategoria());
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
	}

	@Override
	public void status() {
		System.out.println("------------STATUS");
		System.out.println("Lutador: " + getNome()+" CAT: "+getCategoria());
		System.out.println("V: " + getVitorias()+" D: "+getDerrotas()+" E: "+getEmpates());
		System.out.println("------------STATUS");
	}

	@Override
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}

	@Override
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}

	@Override
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}

}
