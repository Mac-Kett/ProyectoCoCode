import java.util.ArrayList;

public class Programa implements Calificable{

    private String ID;
    private String nombre;
    private String responsable;
    private boolean pasoPruebas;
    private ArrayList<Fuente> fuentes;

    public Programa(String id, String n, String r, boolean p){
        setID(id);
        setNombre(n);
        setResponsable(r);
        setPasoPruebas(p);
        this.fuentes = new ArrayList<Fuente>();
    }

    public String getID() {
        return ID;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    private void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public boolean isPasoPruebas() {
        return pasoPruebas;
    }

    private void setPasoPruebas(boolean pasoPruebas) {
        this.pasoPruebas = pasoPruebas;
    }

    @Override
    public double indiceDeCalidad(){
        double total = 0;

        if(this.pasoPruebas == true){
            total = calcularPromedioDelIndiceDeCalidadDeLAsFuentes();
        }

        return  total;
    }

    private double calcularPromedioDelIndiceDeCalidadDeLAsFuentes(){

        double aux = 0;
        double total = 0;

        for(Fuente f: this.fuentes){
            aux = aux + f.indiceDeCalidad();
        }
        total = aux / this.fuentes.size() - 1;

        return total;
    }

    public ArrayList<Fuente> listadoDeFuentesMayoresAlPromedio(int indicePromedio){

        ArrayList<Fuente> arrayAux = new ArrayList<Fuente>();

        for(Fuente f: this.fuentes){
            if(f.indiceDeCalidad() > indicePromedio){
                arrayAux.add(f);
            }
        }

        return arrayAux;
    }

    public void mostrarDetalleDeMetodo(String nombreMetodo){

        for(Fuente f: this.fuentes){
            if(f instanceof FuenteDeLenguaje){
                ((FuenteDeLenguaje) f).mostrarDetalleDeMetodo(nombreMetodo);
            }
        }
    }
}
