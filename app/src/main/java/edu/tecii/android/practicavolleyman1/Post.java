package edu.tecii.android.practicavolleyman1;


public class Post {
    //**se declaran las variables titulo, descripcion e imagen//
    private String titulo;
    private String descripcion;
    private String imagen;
    public Post(){

    }
    public Post(String titulo, String descripcion, String imagen){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public  String getImagen(){
        return imagen;
    }
    public  void setImagen(String imagen){
        this.imagen = imagen;
    }
}


