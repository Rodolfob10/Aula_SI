package br.edu.iff.Aula_SI.bean;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class LoginBean implements Serializable{
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void limpar(){
        this.login = "";
        this.senha = "";
    }
    
    public void logar(){
        if((login.equals("teste"))
                && (senha.equals("123")) ){
            System.out.println("Logado!");
        }else{
            System.out.println("Falha!");
        }
    }
}
