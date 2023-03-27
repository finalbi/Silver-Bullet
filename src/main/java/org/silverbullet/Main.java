package org.silverbullet;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(() -> {
            String[] parksS = {
                    "",
                    "Alice Lake",
                    "All Parks",
                    "Allison Lake",
                    "Bamberton",
                    "Bear Creek",
                    "Beatton",
                    "Beaumont",
                    "Big Bar Lake",
                    "Birkenhead Lake",
                    "Blanket Creek",
                    "Bowron Lake",
                    "Bromley Rock",
                    "Carp Lake",
                    "Champion Lakes",
                    "Charlie Lake",
                    "Chilliwack Lake",
                    "Cowichan River",
                    "Crooked River",
                    "Cultus Lake",
                    "Dry Gulch",
                    "E.C. Manning",
                    "Elk Falls",
                    "Ellison",
                    "Englishman River Falls",
                    "Fillongley",
                    "Fintry",
                    "French Beach",
                    "Gladstone",
                    "Golden Ears",
                    "Goldstream",
                    "Gordon Bay",
                    "Green Lake",
                    "Gwillim Lake",
                    "Herald",
                    "Horsefly Lake",
                    "Inland Lake",
                    "Jimsmith Lake",
                    "Juan de Fuca",
                    "Juniper Beach",
                    "Kekuli Bay",
                    "Kentucky-Alleyne",
                    "Kettle River",
                    "Kikomun Creek",
                    "Kleanza Creek",
                    "Kokanee Creek",
                    "Kootenay Lake",
                    "Lac La Hache",
                    "Lac Le Jeune",
                    "Lakelse Lake",
                    "Liard River Hot Springs",
                    "Little Qualicum Falls",
                    "Lockhart Beach",
                    "Loveland Bay",
                    "Mabel Lake",
                    "Martha Creek",
                    "McDonald Creek",
                    "Meziadin Lake",
                    "Miracle Beach",
                    "Moberly Lake",
                    "Monck",
                    "Montague Harbour Marine",
                    "Morton Lake",
                    "Mount Fernie",
                    "Mount Robson",
                    "Moyie Lake",
                    "Muncho Lake",
                    "Nairn Falls",
                    "Newcastle Island Marine",
                    "Norbury Lake",
                    "North Thompson River",
                    "Okanagan Lake North",
                    "Okanagan Lake South",
                    "Otter Lake",
                    "Paarens Beach",
                    "Paul Lake",
                    "Porpoise Bay",
                    "Porteau Cove",
                    "Premier Lake",
                    "Prudhomme Lake",
                    "Purden Lake",
                    "Rathtrevor Beach",
                    "Red Bluff",
                    "Rolley Lake",
                    "Rosebery",
                    "Ruckle",
                    "Saltery Bay",
                    "Sasquatch",
                    "Shuswap Lake",
                    "Silver Lake",
                    "Skagit Valley",
                    "Smelt Bay",
                    "Sowchea Bay",
                    "Sproat Lake",
                    "Stamp River",
                    "Stemwinder",
                    "Stone Mountain",
                    "Strathcona",
                    "Summit Lake",
                    "Swan Lake",
                    "Haynes Point",
                    "Okanagan Falls",
                    "Syringa",
                    "Boya Lake",
                    "Ten Mile Lake",
                    "Tweedsmuir South",
                    "Tyhee Lake",
                    "Wasa Lake",
                    "Wells Gray",
                    "Whiskers Point",
                    "Yahk"
            };
            JComboBox<String> parks = new JComboBox<>(parksS);
            JButton button = new JButton();
            button.setSize(100, 100);
            button.setText("GO");
            button.addActionListener(e -> {
                if (button.isEnabled()){
                    try {
                        submittingForm((String) parks.getSelectedItem(), "");
                        button.setText("GOING");
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
            final JFrame f = new JFrame("PopupMenu Example");

            JMenuBar menuBar = new JMenuBar();
            menuBar.add(parks);
            menuBar.setVisible(true);

            f.setJMenuBar(menuBar);
            f.add(button);
            f.setLayout(null);

            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.setSize(new Dimension(300, 300));
            f.setVisible(true);

        });
    }

    public static void submittingForm(String park, String Equipment) throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://camping.bcparks.ca/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.id("park-autocomplete"));
        element.click();
        element.sendKeys(park);
//            for (HtmlForm form : forms){
//                System.out.println(for);
//            }



//            final HtmlPage page1 = webClient.getPage("https://camping.bcparks.ca/");
//
//            // Get the form that we are dealing with and within that form,
//            // find the submit button and the field that we want to change.
//            final HtmlForm form = page1.getFormByName("full-width form-wrapper ng-touched ng-pristine ng-invalid");
//            final HtmlTextInput textField = form.getInputByName("park-field");
//
//            // Change the value of the text field
//            textField.type("root");

            // Now submit the form by clicking the button and get back the second page.

    }
}