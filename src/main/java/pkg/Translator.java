/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.Serializable;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "translator")
@SessionScoped
public class Translator implements Serializable {

    private String fortune;
    private String name;
    private String birthYear;
    private String shoeSize;
    private int randomNum;
    private Random random;

    public void createFortune() {
        random = new Random();
        randomNum = Integer.valueOf(random.nextInt(50));

        int fortuneValue = getNameValue() + Integer.parseInt(shoeSize) / 100 + randomNum;

        System.out.println("random " + randomNum + "total " + fortuneValue);

        if (fortuneValue >= 0 && fortuneValue <= 25) {
            fortune = "Always put principles before profit and never be afraid to oppose those "
                    + "who cannot see, or do not care about, the bigger picture. Allow them to make "
                    + "their own mistakes, of course, but don’t let those mistakes affect other people in negative ways.";

        } else if (fortuneValue >= 26 && fortuneValue <= 50) {
            fortune = "Stand back from what you are doing and ask yourself if it is really what you "
                    + "want to be working on. If not, let friends and colleagues know that you intend "
                    + "going off on your own – after you have met your obligations to them, of course.";

        } else if (fortuneValue >= 51 && fortuneValue <= 75) {
            fortune = "You may want nothing to do with the world at large today but that’s too bad because "
                    + "the world is determined to interact with you. There is no point trying to block your ears "
                    + "or close your eyes – you will be forced to face up to reality.";

        } else if (fortuneValue > 75) {
            fortune = "As Mars energizes your ruling planet Mercury today you will get every opportunity to "
                    + "show what you can do. Some of your critics seem to think that you talk a great deal but "
                    + "deliver little and now is your chance to prove them wrong.";
        }

        // return "page2";
    }

    public String getFortune() {
        return fortune;
    }

    public void setFortune(String fortune) {
        this.fortune = fortune;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getNameValue() {
        int nameValue = 0;
        this.name = this.name.toUpperCase();
        char c = this.name.charAt(0);

        if (c >= 'A' && c <= 'F') {
            nameValue = 5;
        } else if (c >= 'G' && c <= 'L') {
            nameValue = 10;
        } else if (c >= 'M' && c <= 'R') {
            nameValue = 15;
        } else if (c >= 'S' && c <= 'X') {
            nameValue = 20;
        } else if (c >= 'Y' && c <= 'Ö') {
            nameValue = 25;
        }

        return nameValue;

    }

}
