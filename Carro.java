public class Carro {
    
  String modelo = "hb20" ;
  String ano = "2018";
  int vel = 60;
  

  void acelerar(int aceleracao){
    vel+=aceleracao;

  }

  void freiar(int reduzir){
    vel-=reduzir;

  }


}
