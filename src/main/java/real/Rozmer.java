package real;


import java.util.Locale;


public class Rozmer {


    static final double DIMENZE_MAX = 100.0;
    static final double DIMENZE_MIN = 0.1;

    private static final double STO = 100.0;

    private double Delka, Sirka, Vyska;

    public Rozmer(final double delka, final double sirka, final double vyska) {
        if(kontrolaDimenze(delka) && kontrolaDimenze(sirka) && kontrolaDimenze(vyska)){
        this.Delka = Math.round(delka * STO);
        this.Sirka = Math.round(sirka * STO);
        this.Vyska = Math.round(vyska * STO);
        } else throw new MojeException("hodnota jednoho vstupního parametruje mimo povolený rozsah");  
    }

    public double getDelka() {
        return (Delka / STO);
    }

    
    public double getSirka() {
        return (Sirka / STO);
    }

    
    public double getVyska() {
        return (Vyska / STO);
    }

    @Override
    public String toString(){
        return String.format(Locale.ENGLISH, "Rozmer{delka=%5.2f,sirka=%5.2f,vyska=%5.2f}" , getDelka() ,getSirka() , getVyska());
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rozmer other = (Rozmer) obj;
        if (this.Delka != other.Delka) {
            return false;
        }
        if (this.Sirka != other.Sirka) {
            return false;
        }
        return this.Vyska == other.Vyska;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.Delka) ^ (Double.doubleToLongBits(this.Delka) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.Sirka) ^ (Double.doubleToLongBits(this.Sirka) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.Vyska) ^ (Double.doubleToLongBits(this.Vyska) >>> 32));
        return hash;
    }

    public static boolean kontrolaDimenze(double dimenze) {    
       return check(dimenze);
    }

    private static boolean check(double dimenze) {
       return (dimenze <= DIMENZE_MAX && dimenze >= DIMENZE_MIN);
    }

}
