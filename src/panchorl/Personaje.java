package panchorl;


public class Personaje extends Persona{
    
    private Integer turno;
    private Integer resultadoDado;
    private Integer turnoFinal;
    private Integer rangoabierta;
    
    public Personaje(String nombre, Integer turno, Integer rangoabierta) {
        super(nombre);
        this.turno = turno;
        this.rangoabierta = rangoabierta;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Personaje{" + " Nombre "+ getNombre() + " Turno - " + turno + " R. abierta " + rangoabierta + " Dado " + resultadoDado + " Turno Final " + turnoFinal + '}';
    }
  
    public void lanzarDado(){
        
        Dado d100 = new Dado(3, rangoabierta, 100);
        resultadoDado = d100.lanzarDado(rangoabierta,true, true);
        turnoFinal = turno + resultadoDado;
        
    }
    
}
