package  br.com.rafaeluz.validarapplication.Model;

import java.io.Serializable;

/**
 * @Class DAO - 
 */

public class UsuarioModel implements Serializable {
    private Long id;
    private String usuario;
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;kb
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
