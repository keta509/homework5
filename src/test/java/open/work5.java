package open;


import Chrome.chromerun;
import Chrome.chromerunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class work5 extends chromerunner {
    @Test
    public void mytest1(){

        $(byClassName("glyphicon")).click();
        sleep(10000);
    }

}
