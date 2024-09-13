import java.util.Random;

public class Personagem{
  //Informações dos personagens
  protected String nome; //Aqui colocaremos o nome do personagem
  protected String classe; //Aqui a classe dele
  protected int nivel; //Aqui o nivel dele
  protected int saude; //Aqui a saude do personagem
  private Random random; //Gerador de numero aleatorio
  private boolean defesa; //Estado de defesa do personagem

  //Metodo Construtor
  public Personagem(String nome, String classe, int nivel, int saude){
    this.nome = nome;
    this.classe = classe;
    this.nivel = nivel;
    this.saude = saude;
    this.defesa = false;
    this.random = new Random();
  }

  //Metodos
  public void atacar(Personagem alvo){
    if(alvo.isDefesa()){
      System.out.println(alvo.getNome() + " Defendeu o ataque de " + this.getNome());
      alvo.setDefesa(false);//Reseta a defesa do alvo
    } else {
    int dano = this.nivel * 2; //Dano baseado no nivel do personagem
    System.out.println(this.nome + " atacou " +  alvo.getNome() + " causando " + dano + " de dano.");
    alvo.receberDano(dano);
    }
  }

  public void defender(){
    this.defesa = true;
    System.out.println(this.nome + " está se defendendo.");
  }

  public void usarHabilidade(Personagem alvo){
    int chance = random.nextInt(10); //Gera um numero de 0 a 9
    if(chance == 0){ // 1 em 10 de acerto
      int dano = this.nivel * 5;
      System.out.println(this.nome + " Usou a expansão de dominio com sucesso em: " + alvo.getNome() + " Causando: " + dano + " de dano crítico.");
      alvo.receberDano(dano);
    } else {
      System.out.println(this.nome + " Tentou usar seu dominio mas falhou");
    }
  }

  public void receberDano(int dano){
    this.saude -= dano;
    System.out.println(this.nome + " recebe " + dano + " de dano. Saúde atual: " + this.saude);
  }

  public boolean estaVivo(){
    return this.saude > 0;
  }

  //Metodos Getters e Setters
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public String getClasse(){
    return classe;
  }
  public void setClasse(String classe){
    this.classe = classe;
  }

  public int getNivel(){
    return nivel;
  }
  public void setNivel(int nivel){
    this.nivel = nivel;
  }

  public int getSaude(){
    return saude;
  }
  public void setSaude(int saude){
    this.saude = saude;
  }

  public boolean isDefesa(){
    return defesa;
  }
  public void setDefesa(boolean defesa){
    this.defesa = defesa;
  }
}