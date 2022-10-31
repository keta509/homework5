package Chrome;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;


    public class chromerunner {

        @BeforeTest
        public void workt5 (){
            open("https://www.apache.org/");

        }
    }


