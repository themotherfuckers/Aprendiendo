

package mascota;


public class Animales {
    
    private String nombre;   
    private String raza   ;  
    private int edad;
    private  char sexo;
    private float peso;      
    private String tipo;      
    private  boolean chip; 
    
    
    
    
    public  Animales (){
        nombre="";
        raza = "";
        edad=0;
  
    }
     public Animales (String nombre, String raza, int edad, char sexo, float peso, String tipo, boolean chip ){     
         
         this.nombre="";
         this.raza="";
         this.edad=0;
         this.sexo=sexo;
         this.peso=0f;
         this.tipo="";
         this.chip=true;
         
         
         
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
        
    }
    
    
    public void printMascota(String nombre, String raza, int edad, char sexo, float peso, String tipo, boolean chip ){
       
    
        System.out.println("Nombre:"+getNombre());
        System.out.println("Raza:"+getRaza());
        System.out.println("Edad:"+getEdad());
        System.out.println("Sexo:"+getSexo());
        System.out.println("Peso:"+getPeso());
        System.out.println("Tipo:"+getTipo());
        System.out.println("Chip:"+isChip());
    
    
    
    }
    
    
    
    
    
}