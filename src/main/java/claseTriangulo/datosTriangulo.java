package claseTriangulo;

import java.io.Serializable;

public final class datosTriangulo implements Serializable{
   private int base;
   private int altura;
   private int area;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int  getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public datosTriangulo(){
        
    }
}
