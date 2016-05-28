package br.com.pcsist.teste.mvc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author guilherme.pacheco
 */
@Component
public class BeanQualquer {

  private static final Logger LOG = LoggerFactory.getLogger(BeanQualquer.class);

  public BeanQualquer() {
    LOG.info("Bean Qualquer!!!!!");
  }

  public String getHello() {
    return "Hello of Bean Qualquer!";
  }

  public Usuario usuario() {
    return new Usuario("nome", "sobrenome");
  }

  public List<Usuario> usuarios() {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("nome", "sobrenome"));
    usuarios.add(new Usuario("nome", "sobrenome"));
    usuarios.add(new Usuario("nome", "sobrenome"));
    usuarios.add(new Usuario("nome", "sobrenome"));
    usuarios.add(new Usuario("nome", "sobrenome"));
    return usuarios;
  }

}
