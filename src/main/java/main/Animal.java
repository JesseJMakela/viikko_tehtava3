package main;

public class Animal {
    private String laji;
    private String nimi;
    private int ika;

    public Animal(String laji, String nimi, int ika){
        this.laji=laji;
        this.nimi=nimi;
        this.ika=ika;
    }
    
    public void tulostaTiedot(){
        System.out.println(laji+": "+nimi+", "+ika+" vuotta");
    }
    public void run(){
        System.out.println(nimi+" juoksee kovaa vauhtia!");
    }
}
