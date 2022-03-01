package model;

public class MediaEscolar {
    public String nome;
    public double nota1, nota2, frequencia;
    public int ra;

  public double calcularMedia(){
      return (nota1+nota2)/2;
  }




  public String testarMedia() {
        if (this.calcularMedia() >= 6 && this.frequencia >= 75) {
            return "Voce foi aprovado";
        } else if (calcularMedia() >= 6 && this.frequencia < 75){
            return "Você foi reprovado por falta";
        }else if (calcularMedia() < 6 && this.frequencia >= 75){
            return "Você foi reprovado por nota";
        }else{
            return "Aluno reprovado por falta e frequencia" ;
        }
  }

  @Override
  public String  toString(){
      return "\nNome: "+this.nome+
              "\nRA: "+this.ra+
              "\nFrequencia: "+this.frequencia+
              "\nSua nota final foi de: "+this.calcularMedia()+
              "\nResultado final: "+this.testarMedia();
  }

}
