import java.util.Random;

public class Luta{
  public static void lutar(Personagem p1, Personagem p2){
    System.out.println("O duelo entre " + p1.getNome() + " e " + p2.getNome() + " começou!");

    while(p1.estaVivo() && p2.estaVivo()){ 
      executarAcao(p1, p2);
      if(!p2.estaVivo()){
        System.out.println(p2.getNome() + " foi derrotado!");
        break;
      }

      executarAcao(p2, p1);
      if(!p1.estaVivo()){
        System.out.println(p1.getNome() + " foi derrotado!"); 
        break;
      }
      
  }
}

private static void executarAcao(Personagem atacante, Personagem defensor){
  //Decidir aleatoriamente se o personagem vai atarcar, defender ou usar a habilidade especial.
  Random random = new Random();
  int acao = random.nextInt(3); // 0 para atacar, 1 para defender, 2 para usar habilidade especial.
  switch (acao){
    case 0: //Ataque
      atacante.atacar(defensor);
    break;
      
    case 1: //Defesa
      atacante.defender();
    break;

    case 2: //Habilidade especial
      atacante.usarHabilidade(defensor);
    break;
  }
}
}