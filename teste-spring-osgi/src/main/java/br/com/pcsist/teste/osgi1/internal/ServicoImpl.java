package br.com.pcsist.teste.osgi1.internal;

import java.util.Arrays;
import java.util.List;

import br.com.pcsist.teste.osgi1.Servico;

/**
 * @author guilherme.pacheco
 */
public class ServicoImpl implements Servico {

  public ServicoImpl() {
    System.out.println("Serviço criado!");
  }

  @Override
  public List<String> getNomes() {
    return Arrays.asList("A", "B", "C", "D", "E");
  }

}
