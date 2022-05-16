package testClass;

import org.openqa.selenium.WebDriver;
import page.Google;

public class BusquedaAnimalesGoogle {

    private Google google;

    public void busquedaGato(WebDriver webDriver) {
        google = new Google(webDriver);
        google.ingresarBusquedagatos("Gato");
        google.clickBtnBuscargatos();

    }
    public void buscarPerros(WebDriver webDriver) {
       google = new Google(webDriver);
       google.ingresarBusquedaperros("Perro");
       google.clickBtnBuscarperros();

    }


}
