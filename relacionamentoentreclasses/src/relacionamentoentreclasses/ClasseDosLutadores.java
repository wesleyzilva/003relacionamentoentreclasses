package relacionamentoentreclasses;

public class ClasseDosLutadores implements AcoesLutadores {

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
	}

	/**
	 * @return the categoria
	 */
	private String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	private void setCategoria(String categoria) {
		this.categoria = categoria;
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
	public ClasseDosLutadores(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias,
			int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	@Override
	public void apresentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void status() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ganharLuta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub

	}

}
