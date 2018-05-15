package br.edu.iff.Aula_SI.bean;

import br.edu.iff.Aula_SI.model.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ListaBean implements Serializable{
    private List<Cliente> clientes;
    private Cliente clienteSelecionado;
    private String nome;
    private String email;
    private String tel;
    
    @PostConstruct
    public void inicializar(){
        clientes = new ArrayList<>();
        Cliente c = new Cliente();
        c.setNome("João");
        c.setEmail("joao@gmail.com");
        c.setTel("(22)99999 5555");
        clientes.add(c);
    }
    
    public void limpar(){
        nome = "";
        email = "";
        tel = "";
    }
    
    public void salvar(){
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setEmail(email);
        c.setTel(tel);
        clientes.add(c);
        limpar();
        System.out.println("Nome:"+c.getNome());
        System.out.println("Email:"+c.getEmail());
        System.out.println("Tel:"+c.getTel());
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getClienteSelecionado() {
        return clienteSelecionado;
    }

    public void setClienteSelecionado(Cliente clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
}
