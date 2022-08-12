package controlador;

import vista.*;


public class Controlador{

    public Controlador(){

    }

    public void iniciar(){
        vistaProceso vistaProceso = new vistaProceso();
        vistaIngreso vistaIngreso = new vistaIngreso(vistaProceso);

    }
}
