import java.awt.color.ProfileDataException;
import java.util.Date;

public class Empleado {

    private long DocumentoIdentidad;
    private String Correo;
    private String Perfil;
    private String Funcion;
    private String Empresa;
    private String Transaccion;
    private Date Actualizar;
    private Date Crear;

    public Empleado(long documentoIdentidad, String correo, String perfil, String funcion, String empresa, String transaccion, Date actualizar, Date crear) {
        DocumentoIdentidad = documentoIdentidad;
        Correo = correo;
        Perfil = perfil;
        Funcion = funcion;
        Empresa = empresa;
        Transaccion = transaccion;
        Actualizar = actualizar;
        Crear = crear;
    }

    public long getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(long documentoIdentidad) {
        DocumentoIdentidad = documentoIdentidad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String perfil) {
        Perfil = perfil;
    }

    public String getFuncion() {
        return Funcion;
    }

    public void setFuncion(String funcion) {
        Funcion = funcion;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getTransaccion() {
        return Transaccion;
    }

    public void setTransaccion(String transaccion) {
        Transaccion = transaccion;
    }

    public Date getActualizar() {
        return Actualizar;
    }

    public void setActualizar(Date actualizar) {
        Actualizar = actualizar;
    }

    public Date getCrear() {
        return Crear;
    }

    public void setCrear(Date crear) {
        Crear = crear;
    }
}


