package br.com.pcsist.teste.mvc;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author guilherme.pacheco
 */
public class Usuario {

  private String nome;
  private String sobrenome;

  public Usuario() {
    super();
  }

  public Usuario(String nome, String sobrenome) {
    this.sobrenome = sobrenome;
    this.nome = nome;
  }

  @JsonProperty
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @JsonProperty
  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  @Override
  public String toString() {
    return "Usuario [nome=" + nome + ", sobrenome=" + sobrenome + "]";
  }

}
