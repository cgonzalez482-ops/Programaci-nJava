/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miProyecto;

/**
 *
 * @author carlos jua
 */
public class Objeto {

  // Atributos
    
    public int id_objeto;
    public String titulo;
    public String descripcion;
    public String image_url;
    public String estado_fisico;
    public String disponibilidad;
    
    //Constructores
    
    //constructor - vacio

    public Objeto() {
    }
    
    //Constructor - completo

    public Objeto(int id_objeto, String titulo, String descripcion, String image_url, String estado_fisico, String disponibilidad) {
        this.id_objeto = id_objeto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.image_url = image_url;
        this.estado_fisico = estado_fisico;
        this.disponibilidad = disponibilidad;
    }
    
    //Constructor - parcial

    public Objeto(String titulo, String descripcion, String image_url, String estado_fisico, String disponibilidad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.image_url = image_url;
        this.estado_fisico = estado_fisico;
        this.disponibilidad = disponibilidad;
    }
    
    //Metodo

    public int getId_objeto() {
        return id_objeto;
    }

    public void setId_objeto(int id_objeto) {
        this.id_objeto = id_objeto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getEstado_fisico() {
        return estado_fisico;
    }

    public void setEstado_fisico(String estado_fisico) {
        this.estado_fisico = estado_fisico;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public void imprimir() {
        System.out.println("Nuevo objeto" + titulo + descripcion);
    }
   //Metodo principal
    public static void main (String[] args) {
        
        Objeto n1 = new Objeto(1, "celular",  "bueno, bonito y barato", "1", "nuevo", "agotado");
        n1.imprimir();
    }   
}
