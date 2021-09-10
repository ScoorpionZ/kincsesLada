
package kincseslada;

public class Lada {
    private String ladak,feliratok;
    public Lada(String ladak, String felirat){
        this.ladak=ladak;
        this.feliratok=felirat;
    }
    public String getLadak(){
        return ladak;
    }
     public String getFelirat(){
        return feliratok;
    }
     
    @Override
    public String toString(){
        return ladak+" "+feliratok;
    }
}
