
package alien;


public class Alien {

    String color;
    int nOjos;
    int nVidas;

    public Alien(String color, int nOjos, int nVidas) {
        this.color = color;
        this.nOjos = nOjos;
        this.nVidas = nVidas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnOjos() {
        return nOjos;
    }

    public void setnOjos(int nOjos) {
        this.nOjos = nOjos;
    }

    public int getnVidas() {
        return nVidas;
    }

    public void setnVidas(int nVidas) {
        this.nVidas = nVidas;
    }
    
    @Override
    public String toString(){
   String cualquierCosa= ("El alien es de color:" + getColor() +"\n Ojos:" + getnOjos() + 
            "\n Vidas:" + getnVidas());
   return cualquierCosa;
    }
  
    
}
