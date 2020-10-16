package com.example.foxmidfirst;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

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
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityUITest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);
    public  String userString = "Foxminded cool 24/7";
    public  String ignoreString = "0123456789";
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void edTextTest() {

        onView(withId(R.id.edText1)).perform(typeText(userString), closeSoftKeyboard());
        onView(withId(R.id.edText2)).perform(typeText(ignoreString), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());
       // onView(withId(R.id.edText1)).perform(clearText());

    }



}
