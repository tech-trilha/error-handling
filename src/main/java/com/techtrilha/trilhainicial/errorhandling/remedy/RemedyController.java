package com.techtrilha.trilhainicial.errorhandling.remedy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RestController
public class RemedyController {

  @GetMapping("/remedies/{id}")
  public String getRemedy(@PathVariable final String id) {
    if ("1".equals(id)) {
      return "Remedy with id 1 found";
    }
    throw RemedyNotFoundException.build(UUID.randomUUID().toString(), id);
  }

}
