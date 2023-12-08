/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mptd.lineas;

/**
 *
 * @author Andres MEndoza
 */
public class GraficaMary {
    private float [] time;
    private float [] fp;
    public static final int N=100;
    public static final float LAMBDA = 0.1f;
    public static final float T = 3;

    public GraficaMary() {
        time = new float [N];
        fp = new float [N];
        
    }
    
    public void compute (){
        float dt = T/N;
        for (int i = 0; i < N; i++) {
            time[i]=i*dt;
            fp[i]=(float)(LAMBDA*Math.exp(-LAMBDA*time[i]));
        }
    }

    public float[] getTime() {
        return time;
    }

    public float[] getFp() {
        return fp;
    }
    
}
