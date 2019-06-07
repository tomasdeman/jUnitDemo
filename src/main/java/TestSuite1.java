import org.junit.*;

public class TestSuite1 {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("I'm beforeClass method!");
    }


    @Before
    public void before() {
        System.out.println("I'm before method!");
    }

    @Test
    public void test1() {
        System.out.println("I'm test 1!");
    }

    @Test
    public void test2() {
        System.out.println("I'm test 2!");
    }

    @After
    public void after() {
        System.out.println("I am after method!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("I'm afterClass method!");
    }

}
