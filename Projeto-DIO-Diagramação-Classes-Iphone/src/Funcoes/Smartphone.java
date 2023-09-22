package Funcoes;

public class Smartphone {

    private NavegadorInternet web;
    private Telefone tel;
    private Musica Music;

    public Smartphone() {

        this.web = new NavegadorInternet();
        this.tel = new Telefone();
        this.Music = new Musica();

    }

    public void exibirPagina(){
        this.web.exibirPagina();
    }

    public void adicionarNovaAba(){
        this.web.adicionarNovaAba();
    }

    public void atualizarPagina(){
        this.web.atualizarPagina();
    }

    public void ligar(){
        this.tel.ligar();
    }

    public void atender(){
        this.tel.atender();
    }

    public void iniciarVoiceMail(){
        this.tel.iniciarVoiceMail();
    }

    public void tocarMusica(){
        this.Music.tocarMusica();
    }

    public void pausar(){
        this.Music.pausar();
    }

    public void selecionarMusica(){
        this.Music.selecionarMusica();

    }
}
