/*
 * 2023 IESS-TICS MPTD
 * Unidad 2. Métodos de transporte y método de asignación
 * Método de transporte
 * By AM
 * Fecha: 13/octubre/2023
 */
package transport;

/**
 *
 * @author Jai Te Gang
 */
public class MTransport {
    private int originPoints;
    private int destinyPoints;
    private float origin[];
    private float destiny[];
    private float costs[][];
    private float tableu[][];
    
    public MTransport(int originPoints, int destinyPoints){
        this.originPoints = originPoints;
        this.destinyPoints = destinyPoints;
    }
    
    public void setOrigin(float origin[]){
        this.origin = origin;
    }
    public void setDestiny(float destiny[]){
        this.destiny = destiny;
    }

    public void setCosts(float[][] costs) {
        this.costs = costs;
    }
    
    public void solve(){
        //TODO
    }
    
    private void sfbNE(){
        //TODO
    }
    
    private void sfbCM(){
        //TODO
    }
    
    private void sfbVogel(){
        //TODO
    }
    
    private boolean optimality(){
        //TODO
        return false;
    }
    
    private void solveVB(){
        //TODO
    }
    
    private boolean solveVNB(){
        //TODO
        return false;
    }
    
    private void pivote(){
        //TODO
    }
    
    private void bucle(){
        //TODO
    }
    
    private void adjust(){
        //TODO
    }
    
    public void print(){
        //TODO
        for (int i = 0; i < originPoints; i++) {
            for (int j = 0; j < destinyPoints; j++) {
                System.out.println(tableu[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < originPoints; i++) {
            for (int j = 0; j < destinyPoints; j++) {
                System.out.println(costs[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < originPoints; i++) {
            System.out.println(origin[i] + " ");
        }
        
        for (int i = 0; i < destinyPoints; i++) {
            System.out.println(destiny[i] + " ");
        }
    }
    
}
