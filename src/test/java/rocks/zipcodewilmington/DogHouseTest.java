package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`//
    // TODO - Create tests for `void remove(Integer id)`//
    // TODO - Create tests for `void remove(Dog dog)`//
    // TODO - Create tests for `Dog getDogById(Integer id)`//
    // TODO - Create tests for `Integer getNumberOfDogs()`//

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void testAddDog(){
        //Given
        Integer actualDogNum = 3;
        //When
        DogHouse.add(new Dog("", new Date(), actualDogNum));
        //When
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(actual, actualDogNum);
    }
    @Test
    public void testRemoveID(){
        //Given
        Integer givenID = 2;
        //When
        Dog dog = new Dog("", new Date(), givenID);
        //When
        DogHouse.add(dog);
        //When
        DogHouse.remove(givenID);
        //Then
        Assert.assertNull(DogHouse.getDogById(givenID));
    }
    @Test
    public void testDogID(){
        //Given
        Integer givenID = 3;
        //When
        Dog dog = new Dog("", new Date(), givenID);
        //When
        DogHouse.add(dog);
        //When
        Dog actual = DogHouse.getDogById(givenID);
        //Then
        Assert.assertEquals(dog, actual);
    }
    @Test
    public void testRemoveDog() {
        //Given
        Integer givenID = 4;
        //When
        Dog dog = new Dog("", new Date(), givenID);
        //When
        DogHouse.add(dog);
        //When
        DogHouse.remove(dog);
        //Then
        Assert.assertNull(DogHouse.getDogById(givenID));
    }
    @Test
    public void testNumDog() {
        //Given
        Integer NumDog = 1;
        //When
        DogHouse.clear();;
        //When
        DogHouse.add((new Dog("", new Date(), NumDog)));
        //When
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(NumDog, actual);
    }
}
