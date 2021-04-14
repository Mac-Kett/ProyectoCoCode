public class FuenteDeMarcado extends Fuente{
    private double KB;

    public FuenteDeMarcado(double kb){
        super();
        setKB(kb);
    }

    public double getKB() {
        return KB;
    }

    private void setKB(double KB) {
        this.KB = KB;
    }

    @Override
    public double indiceDeCalidad(){
        return 450 / this.KB;
    }
}
