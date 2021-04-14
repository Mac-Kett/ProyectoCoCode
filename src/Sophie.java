import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sophie {


    private ArrayList<Programa> programas;

    public Sophie(){
        this.programas = new ArrayList<Programa>();
    }

    public ArrayList<Programa> programasPorDebajoDe(int calidadMinima){

        ArrayList<Programa> auxiliar = new ArrayList<Programa>();

        for(Programa p: this.programas){
            if(p.indiceDeCalidad() >= calidadMinima){
                auxiliar.add(p);
            }
        }

        return auxiliar;
    }
}
