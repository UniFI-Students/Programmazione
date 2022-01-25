package javamm;

@SuppressWarnings("all")
public class Isomorfismo {
  /**
   * Sia D = {0,1,2,3,4,5,6,7,8,9} l'insieme delle cifre
   * decimali. Due array s e t di uguale lunghezza n,
   * contenenti solo elementi in D, si dicono isomorfi
   * se esiste una corrispondenza biunivoca f da D a D
   * tale che, per ogni i compreso tra 0 e n-1, t[i] è
   * uguale a f(s[i]). Ad esempio, l'array s={2,0,1,2,2}
   * e' isomorfo all'array t={1,3,0,1,1} in quanto possiamo
   * definire f nel modo seguente: f(2)=1, f(0)=3 e f(1)=0
   * (il valore di f per le altre cifre decimali non e'
   * importante in quanto queste non appaiono in s).
   * Analogamente, l'array s={3,0,4,3,2} e' isomorfo
   * all'array t={4,1,2,4,3} in quanto possiamo definire
   * f nel modo seguente: f(3)=4, f(0)=1, f(4)=2 e f(2)=3.
   * Al contrario, l'array s={2,3,0,2,0} non e' isomorfo
   * all'array t={4,1,3,0,3} in quanto f dovrebbe associare
   * sia 4 che 0 a 2. Analogamente, l'array s={2,3,0,1,4}
   * non e' isomorfo all'array t={4,1,3,0,4} in quanto
   * f dovrebbe associare 4 sia a 2 che a 4.
   * Definire un metodo, chiamato isomorfi, che dati in
   * input due array s e t di uguale lunghezza, contenenti
   * solo cifre decimali, restituisca il valore true se e
   * solo se s e t sono isomorfi.
   */
  public static boolean isomorfi(int[] s, int[] t) {
    return false;
  }
  
  public static void main(String[] args) {
  }
}
