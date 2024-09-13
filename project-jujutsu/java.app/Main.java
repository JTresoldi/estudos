public class Main {
    public static void main(String[] args) {
      //Criando as instancias dos Personagens
                                    //Nome, Classe, Nivel, Saude.
      Personagem p1 = new Personagem("Gojo", "Feiticeiro", 5, 50);
      Personagem p2 = new Personagem("Mahito", "Maldição", 4, 40);
  
      //Iniciando o duelo
      Luta.lutar(p1, p2);
    }
  }