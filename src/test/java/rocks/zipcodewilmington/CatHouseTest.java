package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`//
    // TODO - Create tests for `void remove(Integer id)`//
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`//
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testAddCat(){
        //Given
        Integer actualCatNum = 2;
        //When
        CatHouse.add(new Cat("", new Date(), actualCatNum));
        //When
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(actual, actualCatNum);
    }
    @Test
    public void testRemoveID(){
        //Given
        Integer givenID = 2;
        //When
        Cat cat = new Cat("", new Date(), givenID);
        //When
        CatHouse.add(cat);
        //When
        CatHouse.remove(givenID);
        //Then
        Assert.assertNull(CatHouse.getCatById(givenID));
    }
    @Test
    public void testCatID(){
        //Given
        Integer givenID = 3;
        //When
        Cat cat = new Cat("", new Date(), givenID);
        //When
        CatHouse.add(cat);
        //When
        Cat actual = CatHouse.getCatById(givenID);
        //Then
        Assert.assertEquals(cat, actual);
    }
    @Test
    public void testRemoveCat() {
        //Given
        Integer givenID = 4;
        //When
        Cat cat = new Cat("", new Date(), givenID);
        //When
        CatHouse.add(cat);
        //When
        CatHouse.remove(cat);
        //Then
        Assert.assertNull(CatHouse.getCatById(givenID));
    }
    @Test
    public void testNumCat() {
        //Given
        Integer NumCat = 1;
        //When
        CatHouse.clear();;
        //When
        CatHouse.add((new Cat("", new Date(), NumCat)));
        //When
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(NumCat, actual);
    }
}
