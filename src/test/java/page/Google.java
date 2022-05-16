package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {

    @FindBy(className = "gLFyf")
    WebElement inputBuscarg;

    @FindBy(className = "gNO89b")
    WebElement btnBuscarg;

    @FindBy(className = "gLFyf")
    WebElement inputBuscarp;
     @FindBy(className = "gNO89b")
      WebElement btnBuscarp;

 public Google(WebDriver webDriver){
     PageFactory.initElements(webDriver,  this);

 }

    public void ingresarBusquedagatos(String busquedagatos) {
        inputBuscarg.sendKeys(busquedagatos);

    }
    public void clickBtnBuscargatos() {

     btnBuscarg.click();

    }

   public void ingresarBusquedaperros(String busquedaperros) {
     inputBuscarp.sendKeys (busquedaperros);

    }
    public void clickBtnBuscarperros() {
      btnBuscarp.click();
    }
}

