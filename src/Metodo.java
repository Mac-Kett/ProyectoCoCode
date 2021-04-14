public class Metodo implements Calificable{

    private String nombre;
    private int cantParametros;
    private int cantInstrucciones;
    private int ramificacionesDeFlujo;

    public Metodo(String n, int par, int ins, int rami){
        setNombre(n);
        setCantParametros(par);
        setCantInstrucciones(ins);
        setRamificacionesDeFlujo(rami);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantParametros() {
        return cantParametros;
    }

    private void setCantParametros(int cantParametros) {
        this.cantParametros = cantParametros;
    }

    public int getCantInstrucciones() {
        return cantInstrucciones;
    }

    private void setCantInstrucciones(int cantInstrucciones) {
        this.cantInstrucciones = cantInstrucciones;
    }

    public int getRamificacionesDeFlujo() {
        return ramificacionesDeFlujo;
    }

    private void setRamificacionesDeFlujo(int ramificacionesDeFlujo) {
        this.ramificacionesDeFlujo = ramificacionesDeFlujo;
    }

    @Override
    public double indiceDeCalidad(){
        return (5/ this.cantParametros + 1 ) + (20 / this.cantInstrucciones) + (3 / this.ramificacionesDeFlujo + 1);
    }
}
