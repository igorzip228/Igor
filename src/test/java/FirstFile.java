import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstFile {



    public static boolean isPhone(String text) {
        String regex = "(?:\\+38)? ?(?:0\\d{2}|\\(0\\d{2}\\)) ?\\d{2}(?:\\d{3}|\\d[- ]\\d{2}[- ]|[ -]\\d{2}[ -]\\d)\\d{2}";
        return text.matches(regex);
    }

    @Test
    public static void test1_ne() {
        String testData = "0975156900";
        boolean result = isPhone(testData);
        Assert.assertTrue(result, "Test 1 failed");
    }

    @Test
    public static void test2_isPhone() {
        String testData = "gdfdgdgd";
        boolean result = isPhone(testData);
        Assert.assertFalse(result, "test 2 failed");
    }

    @Test
    public static void test3_isPhone() {
        String testData = "+380676968103";
        boolean result = isPhone(testData);
        Assert.assertTrue(result, "test 3 failed");
    }

    @Test
    public static void test4_isPhone() {
        String testData = "380676968103";
        boolean result = isPhone(testData);
        Assert.assertTrue(result, "test 4 failed");
    }

    @Test
    public static void test5_isPhone() {
        String testData = "++!@#$%^&";
        boolean result = isPhone(testData);
        Assert.assertFalse(result, "test 5 failed");
    }

    @Test
    public static void test6_isPhone() {
        String testData = "380676968103333";
        boolean result = isPhone(testData);
        Assert.assertFalse(result, "test 6 failed");
    }

    @Test
    public static void test7_isPhone() {
        String testData = "+38(067) 69 68 103";
        boolean result = isPhone(testData);
        Assert.assertTrue(result, "test 7 failed");
    }

    @Test
    public static void test8_isPhone() {
        String testData = "38/067/6 9/68 1-03";
        boolean result = isPhone(testData);
        Assert.assertFalse(result, "test 8 failed");
    }

    @Test
    public static void test9_isPhone() {
        String testData = "+38(067)-6968-103";
        boolean result = isPhone(testData);
        Assert.assertTrue(result, "test 9 failed");
    }
}

