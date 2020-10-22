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

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;




@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityUITest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    Rotator rotator;
    @Before
    public void before() {
        rotator = new Rotator();
    }
    @After
    public void after() {
    }

    @Test
    public void edTextTest1() {
        String userString = "Foxminded Cool 24/7";
        String ignoreString = "24/7";
        String answer = rotator.rotateWord(userString, ignoreString);
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
    @Test
    public void edTextTest2() {
        String userString = "";
        String ignoreString = "24/7";
        String answer = rotator.rotateWord(userString, ignoreString);
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
    @Test
    public void edTextTest3() {
        String userString = "Foxminded Cool 24/7";
        String ignoreString = "";
        String answer = rotator.rotateWord(userString, ignoreString);
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
    @Test
    public void edTextTest4() {
        String userString = "Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi";
        String ignoreString = "";
        String answer = rotator.rotateWord(userString, ignoreString);
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
    @Test
    public void edTextTest5() {
        String userString = "Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi";
        String ignoreString = "Dfsgyhsdrfhgdfhgbdfghseiudytgfiuseyhgvkjdxhvkusdyrfgiuesayhfoiuhsdkjvhdfkxjgbviserugoisedjglkdfhjbkjhdfcklughbdkfsujghoiklshdgoi";
        String answer = rotator.rotateWord(userString, ignoreString);
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
