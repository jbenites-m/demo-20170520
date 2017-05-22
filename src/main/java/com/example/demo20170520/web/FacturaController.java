package com.example.demo20170520.web;

import com.example.demo20170520.business.FacturaService;
import com.example.demo20170520.model.FacturaCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by domix on 5/20/17.
 */
@RestController
@RequestMapping("/v1/facturas")
public class FacturaController {
  private final FacturaService facturaService;

  @Autowired
  public FacturaController(FacturaService facturaService) {
    this.facturaService = facturaService;
  }

  @PostMapping
  public FacturaCommand crearFactura(@RequestBody FacturaCommand factura) {
    return facturaService.guardarFactura(factura);
  }

  @GetMapping
  public List<FacturaCommand> obtenerFacturas(){
    return facturaService.listFacturas();
  }
}
