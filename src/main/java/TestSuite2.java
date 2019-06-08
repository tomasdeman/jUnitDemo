import org.junit.*;

public class TestSuite2 {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("I'm beforeClass method in TestSuite2!");
    }

    @Before
    public void before() {
        System.out.println("I'm before method in TestSuite2!");
    }

    @Test
    public void test1() {
        System.out.println("I'm test 1 in TestSuite2!");
    }

    @Test
    public void test2() {
        System.out.println("I'm test 2 in TestSuite2!");
    }

    @After
    public void after() {
        System.out.println("I'm after method in TestSuite2!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("I'm afterClass method in TestSuite2!");
    }
}
