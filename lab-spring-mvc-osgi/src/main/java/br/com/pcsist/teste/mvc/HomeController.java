package br.com.pcsist.teste.mvc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author guilherme.pacheco
 */
@Controller
public class HomeController {

  private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

  @Autowired
  private BeanQualquer beanQualquer;

  public HomeController() {
    LOG.info("Controller criado!");
  }

  @ResponseBody
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String hello() {
    String message = beanQualquer.getHello();
    LOG.info(message);
    return message;
  }

  @ResponseBody
  @RequestMapping(value = "/usuario", method = RequestMethod.GET)
  public Usuario usuario() throws JsonProcessingException {
    LOG.info("Listando usuario");
    return beanQualquer.usuario();
  }

  @ResponseBody
  @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
  public List<Usuario> usuarios() throws JsonProcessingException {
    LOG.info("Listando usuarios");
    return beanQualquer.usuarios();
  }

}
