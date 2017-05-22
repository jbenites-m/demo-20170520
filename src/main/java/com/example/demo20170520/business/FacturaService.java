package com.example.demo20170520.business;

import com.example.demo20170520.model.FacturaCommand;

import java.util.List;

/**
 * Created by domix on 5/20/17.
 */
public interface FacturaService {
  FacturaCommand guardarFactura(FacturaCommand factura);
  List<FacturaCommand> listFacturas();
}
