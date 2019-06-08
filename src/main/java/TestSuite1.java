import org.junit.*;

public class TestSuite1 {

    @Rule
    public Retry retry = new Retry(3);

    @BeforeClass
    public static void beforeClass() {
        System.out.println("I'm beforeClass method in TestSuite 1!");
    }

    @Before
    public void before() {
        System.out.println("I'm before method in TestSuite 1!");
    }

    @Test
    public void test1() {
        System.out.println("I'm test 1 in TestSuite 1!");
        Assert.assertTrue(false);
    }

    @Test
    public void test2() {
        System.out.println("I'm test 2 in TestSuite 1!");
    }

    @After
    public void after() {
        System.out.println("I'm after method in TestSuite 1!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("I'm afterClass method in TestSuite 1!");
    }

}
