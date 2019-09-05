/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpkg;

import org.junit.Test;
import static org.junit.Assert.*;
import pkg.Translator;

/**
 *
 * @author buster
 */
public class TranslatorTest {

    Translator translator = new Translator();

    public TranslatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void getNameValue() {
        translator.setName("A");
        assertEquals(translator.getNameValue(), 5);
        translator.setName("G");
        assertEquals(translator.getNameValue(), 10);
        translator.setName("M");
        assertEquals(translator.getNameValue(), 15);
        translator.setName("S");
        assertEquals(translator.getNameValue(), 20);
        translator.setName("Y");
        assertEquals(translator.getNameValue(), 25);
    }

    @Test
    public void setName() {
        translator.setName(("Erik"));
        assertEquals(translator.getName(), "Erik");
    }

    @Test
    public void getName() {
        translator.setName(("Olof"));
        assertEquals(translator.getName(), "Olof");
    }

    @Test
    public void setBirthYear() {
        translator.setBirthYear("1990");
        assertEquals(translator.getBirthYear(), "1990");
    }

    @Test
    public void getBirthYear() {
        translator.setBirthYear("1980");
        assertEquals(translator.getBirthYear(), "1980");
    }

    @Test
    public void setShoeSize() {
        translator.setShoeSize("42");
        assertEquals(translator.getShoeSize(), "42");
    }

    @Test
    public void getShoeSize() {
        translator.setShoeSize("43");
        assertEquals(translator.getShoeSize(), "43");
    }
    
            @Test
    public void setFortune(){
        translator.setFortune("123");
        assertEquals(translator.getFortune(), "123");
    }
    
            @Test
    public void getFortune(){
        translator.setFortune("321");
        assertEquals(translator.getFortune(), "321");
    }
    
            @Test
    public void setRandomNum(){
        translator.setRandomNum(1);
        assertEquals(translator.getRandomNum(), 1);
    }
    
            @Test
    public void getRandomNum(){
        translator.setRandomNum(123);
        assertEquals(translator.getRandomNum(), 123);
    }
    
                @Test
    public void setFortuneValue(){
        translator.setFortuneValue(4);
        assertEquals(translator.getFortuneValue(), 4);
    }
    
                    @Test
    public void getFortuneValue(){
        translator.setFortuneValue(5);
        assertEquals(translator.getFortuneValue(), 5);
    }
    
                    @Test
    public void createRandomNum(){
        translator.setBirthYear("1990");
        translator.setName("A");
        translator.setShoeSize("43");
        translator.createRandomNum();
        assertTrue(translator.getRandomNum() >= 1 && translator.getRandomNum() <= 50);
    }
    
            @Test
    public void createFortune(){
        translator.setFortuneValue(15);
        translator.createFortune();
        assertEquals(translator.getFortune(), "Always put principles before profit and never be afraid to oppose those "
                    + "who cannot see, or do not care about, the bigger picture. Allow them to make "
                    + "their own mistakes, of course, but don’t let those mistakes affect other people in negative ways.");
        
        translator.setFortuneValue(36);
        translator.createFortune();
        assertEquals(translator.getFortune(), "Stand back from what you are doing and ask yourself if it is really what you "
                    + "want to be working on. If not, let friends and colleagues know that you intend "
                    + "going off on your own – after you have met your obligations to them, of course.");
        
        translator.setFortuneValue(55);
        translator.createFortune();
        assertEquals(translator.getFortune(), "You may want nothing to do with the world at large today but that’s too bad because "
                    + "the world is determined to interact with you. There is no point trying to block your ears "
                    + "or close your eyes – you will be forced to face up to reality.");
        
        translator.setFortuneValue(82);
        translator.createFortune();
        assertEquals(translator.getFortune(), "As Mars energizes your ruling planet Mercury today you will get every opportunity to "
                    + "show what you can do. Some of your critics seem to think that you talk a great deal but "
                    + "deliver little and now is your chance to prove them wrong.");
    }
}
