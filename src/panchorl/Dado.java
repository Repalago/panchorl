package panchorl;

public class Dado {
    
    Integer pifia;
    Integer abierta;
    Integer numCaras;

    public Dado(Integer pifia, Integer abierta, Integer numCaras) {
        this.pifia = pifia;
        this.abierta = abierta;
        this.numCaras = numCaras;
    }
    
    public Integer lanzarDado(Boolean hasopen, Boolean haspifia){
        
        Integer resultadoDado = (int)(Math.random()*numCaras + 1);
        if(hasopen){
            if(resultadoDado >= abierta){
                System.out.println("¡Abierta! " + resultadoDado);
                resultadoDado += lanzarDado(true, false);
            }
        }
        if(haspifia){
            if(resultadoDado <= pifia){
                System.out.println("¡Pifia! " + resultadoDado);
                resultadoDado -= lanzarDado(false, false);
            }
        }
        return resultadoDado;
    }
    
    public Integer lanzarDado(int rangoabierta, Boolean hasopen, Boolean haspifia){
        
        Integer resultadoDado = (int)(Math.random()*numCaras + 1);
        resultadoDado = 95;
        //System.out.println("rangoabierta: " + rangoabierta);
        //System.out.println(resultadoDado);
        if(hasopen){
            if(resultadoDado >= rangoabierta){
                System.out.println("¡Abierta! " + resultadoDado);
                resultadoDado += lanzarDado(rangoabierta + 1, true, false);
            }
        }
        
        if(haspifia){
            if(resultadoDado <= pifia){
                System.out.println("¡Pifia! " + resultadoDado);
                resultadoDado -= lanzarDado(rangoabierta,false, false);
            }
        }
        return resultadoDado;
    }

    public Integer getPifia() {
        return pifia;
    }

    public void setPifia(Integer pifia) {
        this.pifia = pifia;
    }

    public Integer getAbierta() {
        return abierta;
    }

    public void setAbierta(Integer abierta) {
        this.abierta = abierta;
    }

    public Integer getNumCaras() {
        return numCaras;
    }

    public void setNumCaras(Integer numCaras) {
        this.numCaras = numCaras;
    }
    
    
    
}
