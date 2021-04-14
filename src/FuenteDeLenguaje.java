import java.util.ArrayList;

public class FuenteDeLenguaje extends Fuente{

    private ArrayList<Metodo> metodos;

    public FuenteDeLenguaje(){
        super();
     this.metodos = new ArrayList<Metodo>();
    }

    @Override
    public double indiceDeCalidad(){

        double resultado = 0;

        for(Metodo m: this.metodos){
            resultado = resultado + m.indiceDeCalidad();
        }

        return resultado;
    }

    public void mostrarDetalleDeMetodo(String nombreMetodo){

        int i = 0;
        Metodo encontrado = null;
        Metodo aux;

        while( i < this.metodos.size() -1 && encontrado == null){
            aux = this.metodos.get(i);
            if (aux.getNombre().equals(nombreMetodo)) {
                encontrado = aux;
            }
            i++;
            }
        System.out.println(encontrado.getNombre() + encontrado.indiceDeCalidad() + encontrado.getCantInstrucciones() + encontrado.getRamificacionesDeFlujo());

        }
        }

}
