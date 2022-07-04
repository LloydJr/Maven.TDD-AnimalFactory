package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`//
    // TODO - Create tests for `speak`//
    // TODO - Create tests for `setBirthDate(Date birthDate)`//
    // TODO - Create tests for `void eat(Food food)`//
    // TODO - Create tests for `Integer getId()`//
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`//
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`//


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSpeak() {
        //Given
        String whatToSpeak = "meow!";
        //When
        Cat cat = new Cat("Jynx", new Date(), 20);
        //Then
        Assert.assertEquals(whatToSpeak, cat.speak());
    }

    @Test
    public void testSetName() {
        //Given
        String givenName = "Tofu";
        //When
        Cat cat = new Cat("Jynx", new Date(), 20);
        cat.setName(givenName);
        String actualName = cat.getName();
        //Then
        Assert.assertEquals(givenName, actualName);
    }

    @Test
    public void testBirthday() {
        // Given
        Date givenBirthDate = new Date();
        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), 15);
        // When (we retrieve data from the cat)
        cat.setBirthDate(givenBirthDate);
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenBirthDate, cat.getBirthDate());
        ;
    }

    @Test
    public void testID() {
        // Given (cat data)
        Integer givenId = 10;
        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), givenId);
        // When (we retrieve data from the cat)
        Integer retrievedId = cat.getId();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testAnimalInheritance() {
        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), 1);
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), 2);
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void testEat() {
        // Given (cat data)
        Integer givenId = 1;
        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), givenId);
        // When (we retrieve data from the cat)
        cat.eat(new Food());
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenId, cat.getNumberOfMealsEaten());
    }
}
