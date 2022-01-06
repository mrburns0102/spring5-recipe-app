package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;

import java.util.Optional;

public class CategoryTest extends TestCase {

    Category category;

    @Before
    public void setUp() {
        this.category = new Category();
    }

    public void testGetId() {
        Long idValue = 4l;

        category.setId(idValue);

        Assert.assertEquals(idValue, category.getId());
    }

    public void testGetDescription() {
    }

    public void testGetRecipes() {
    }
}
