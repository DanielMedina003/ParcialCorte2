
package com.mycompany.ejercicio2parcial;

public class Libro {
    
     
    //Atributos
    private int Codigo;
    public int NumeroPaginas;
    public String Titulo;
    public String Autor;

    //Constructor
    public Libro(int Codigo, int NumeroPaginas, String Titulo, String Autor){
        
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    
    }
    
    //Getter y Setter para cada atributo
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    
    //Metodo para mostrar informacion
    public void MostrarInformacion(){
         System.out.println("El libro " + Codigo + " Creado por el autor " + Autor + " tiene " + NumeroPaginas + " Paginas\n");
    }
}
