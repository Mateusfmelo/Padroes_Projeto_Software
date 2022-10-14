public class Fita {

    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;
    
    private String título;
    private int códigoDePreço;

    public Fita(String título, int códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
    }

    public static int getNormal() {
        return NORMAL;
    }

    public static int getLançamento() {
        return LANÇAMENTO;
    }

    public static int getInfantil() {
        return INFANTIL;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getCódigoDePreço() {
        return códigoDePreço;
    }

    public void setCódigoDePreço(int códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }

    @Override
    public String toString() {
        return "Fita [título=" + título + ", códigoDePreço=" + códigoDePreço + "]";
    }
}
