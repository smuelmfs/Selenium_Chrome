/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selenium_3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Selenium_3 {
public static void main(String[] args) {
abrirChrome();
}
private static void abrirChrome() {
File file = new File("C:\\Users\\smuel\\Desktop\\chromedriver_win32\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
WebDriver driver = new ChromeDriver();
driver.get("http://devmedia.com.br");
String i = driver.getCurrentUrl();
System.out.println(i);
driver.close();
}
}