public class Fraction{
    public int topN;
    public int btmN;

    public String toFraction(){
        return Integer.toString(topN) +  "/" + Integer.toString(btmN);
    }

    public String toFloat(){
        return Double.toString((double)topN / (double)btmN);
    }

    public void addFraction(Fraction f){
        topN = (topN * f.btmN) + (btmN * f.topN);
        btmN *= f.btmN;
    }

    public boolean myEquals(Fraction x){
        return ((double)topN / (double)btmN) == ((double)x.topN / (double)x.btmN);
    }

    public void LowestTermFrac(){
        int g_c_d = gcd(topN, btmN);
        topN /= g_c_d;
        btmN /= g_c_d;
    }
    public int gcd(int first, int sec){
        if (sec == 0){
            return first;
        }
        int temp = first;
        first = sec;
        sec = temp % sec;
        return gcd(first, sec);
    }
}