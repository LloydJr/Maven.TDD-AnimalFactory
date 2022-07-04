package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`//
    // TODO - Create tests for `speak`//
    // TODO - Create tests for `setBirthDate(Date birthDate)`//
    // TODO - Create tests for `void eat(Food food)`//
    // TODO - Create tests for `Integer getId()`//
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`//
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`//
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testDog() {
        // Given
        String givenName = "Yuki";
        Date givenBirthDate = new Date();
        Integer givenId = 6;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void testSpeak() {
        //Given
        String whatToSpeak = "bark!";
        //When
        Dog dog = new Dog("", new Date(), 20);
        //Then
        Assert.assertEquals(whatToSpeak, dog.speak());
    }
    @Test
    public void testBirthday(){
        //Given
        Date givenBirthdate = new Date();
        //When
        Dog dog = new Dog("", new Date(),15);
        //When
       dog.setBirthDate(givenBirthdate);
        //Then
        Assert.assertEquals(givenBirthdate, dog.getBirthDate());
    }
    @Test
    public void testFood(){
        //Given
        Integer givenID = 1;
        //When
        Dog dog = new Dog("", new Date(), givenID);
        //When
        dog.eat(new Food());
        //Then
        Assert.assertEquals(givenID, dog.getNumberOfMealsEaten());
    }
    @Test
    public void testID() {
        // Given
        Integer givenId = 6;

        // When
        Dog dog = new Dog("", new Date(), givenId);

        // When
        Integer retrievedId = dog.getId();

        // Then
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void testAnimalInheritance(){
        //When
        Dog dog = new Dog("", new Date(), 1);
        //Then
        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void testMammalInheritance(){
        //When
        Dog dog = new Dog("", new Date(), 1);
        //Then
        Assert.assertTrue(dog instanceof Mammal);
    }
}
