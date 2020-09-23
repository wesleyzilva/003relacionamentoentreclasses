package relacionamentoentreclasses;

public class Lutador implements Acoes {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	/**
	 * @return the nome
	 */
	private String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nacionalidade
	 */
	private String getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * @param nacionalidade the nacionalidade to set
	 */
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	/**
	 * @return the idade
	 */
	private int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	private void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the altura
	 */
	private float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	private void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	private float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	private void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}

	/**
	 * @return the categoria
	 */
	private String getCategoria() {
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

	/**
	 * @return the vitorias
	 */
	private int getVitorias() {
		return vitorias;
	}

	/**
	 * @param vitorias the vitorias to set
	 */
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
		System.out.println("ganhou !!!");
	}

	/**
	 * @return the derrotas
	 */
	private int getDerrotas() {
		return derrotas;
	}

	/**
	 * @param derrotas the derrotas to set
	 */
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
		System.out.println("perdeu !!!");
	}

	/**
	 * @return the empates
	 */
	private int getEmpates() {
		return empates;
	}

	/**
	 * @param empates the empates to set
	 */
	private void setEmpates(int empates) {
		this.empates = empates;
		System.out.println("empatou !!!");
	}

	/**
	 * @param nome
	 * @param nacionalidade
	 * @param idade
	 * @param altura
	 * @param peso
	 * @param categoria
	 * @param vitorias
	 * @param derrotas
	 * @param empates
	 */
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
	public  void apresentar() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		System.out.println("------------STATUS");
		System.out.println("Lutador: " + getNome()+" CAT: "+getCategoria());
		System.out.println("V: " + getVitorias()+" D: "+getDerrotas()+" E: "+getEmpates());
		System.out.println("------------STATUS");
	}

	@Override
	public void ganharLuta() {
		// TODO Auto-generated method stub
		setVitorias(getVitorias() + 1);
	}

	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub
		setDerrotas(getDerrotas() + 1);
	}

	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub
		setEmpates(getEmpates() + 1);
	}

}
