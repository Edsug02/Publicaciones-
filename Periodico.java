package publicacion;

public class Periodico extends Publicacion{
    private String SECCIONES;
    private String editor;
    

    public String getSECCIONES(){
     return SECCIONES;
    }

    public void setSECCIONES(String sec){
       SECCIONES = sec;
    }

    public String getEditor(){
     return editor;
    }

    public void setEditor(String ed){
        editor = ed;
    }

     
    
}