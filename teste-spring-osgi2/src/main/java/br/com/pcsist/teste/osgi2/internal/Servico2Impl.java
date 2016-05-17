package br.com.pcsist.teste.osgi2.internal;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import br.com.pcsist.teste.osgi1.Servico;
import br.com.pcsist.teste.osgi2.Servico2;

/**
 * @author guilherme.pacheco
 */
public class Servico2Impl implements Servico2 {

  private Servico servico;

  public Servico2Impl() {
    System.out.println("Servico 2 Criado!");
  }

  @PostConstruct
  public void init() {
    System.out.println(getEscolhidos());
  }

  @Override
  public List<String> getEscolhidos() {
    List<String> nome = servico.getNomes();
    Predicate<String> escolhidos = a -> "A".equals(a) || "B".equals(a);
    return nome.stream().filter(escolhidos).collect(Collectors.toList());
  }

  public void setServico(Servico servico) {
    this.servico = servico;
  }

}
