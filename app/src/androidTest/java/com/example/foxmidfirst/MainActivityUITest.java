package com.example.foxmidfirst;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertNotNull;


@RunWith(Parameterized.class)
@LargeTest
public class MainActivityUITest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    Rotator rotator;
    private String userString ="";
    private String ignoreString ="";
    public MainActivityUITest(String userString, String ignoreString) {
        super();
        this.userString = userString;
        this.ignoreString = ignoreString;
    }
    @Before
    public void before() {
        rotator = new Rotator();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] {
                {"Foxminded Cool 24/7","24/7"},
                {"","24/7"},
                {null,"24/7"},
                {"1241241412412",null},
                {"Foxminded Cool 24/7",""},
                {"Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi",""},
                {"Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi","Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi"},
                });
    }
    @After
    public void after() {
    }
    @Test
    public void edTextTest1() {
        String answer = rotator.rotateWord(userString, ignoreString);
        assertNotNull(rotator.rotateWord(userString,ignoreString));
        onView(withId(R.id.textView1)).check(matches(isDisplayed()));
        onView(withId(R.id.edText1)).check(matches(isDisplayed()));
        onView(withId(R.id.textView2)).check(matches(isDisplayed()));
        onView(withId(R.id.edText2)).check(matches(isDisplayed()));
        onView(withId(R.id.button1)).check(matches(isDisplayed()));
        onView(withId(R.id.textView3)).check(matches(isDisplayed()));
        onView(withId(R.id.textView4)).check(matches(isDisplayed()));
        onView(withId(R.id.edText1)).perform(typeText(userString), closeSoftKeyboard());
        onView(withId(R.id.edText2)).perform(typeText(ignoreString), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.textView4)).check(matches(withText(containsString(answer))));
    }
}
