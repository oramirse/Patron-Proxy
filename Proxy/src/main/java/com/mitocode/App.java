package com.mitocode;

import com.mitocode.inter.ICuenta;
import com.mitocode.inter.impl.CuentaBancoBImpl;
import com.mitocode.model.Cuenta;
import com.mitocode.proxy.CuentaProxy;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "mitocode", 1000);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 200);
		c = cuentaProxy.retirarDinero(c, 50);
		cuentaProxy.mostrarSaldo(c);
		
	}

}
