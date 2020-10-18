package com.example.foxmidfirst;

import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
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
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.core.StringContains.containsString;



@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityUITest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);
    public  String userString = "Foxminded cool 24/7";
    public  String ignoreString = "0123456789";
    public  String answerRotateString = "dexdnimoF oocl 7/42";

    @Test
    public void edTextTest() {
        onView(withText("Введи строку")).check(matches(isDisplayed()));
        onView(withText("Игнорируемые символы")).check(matches(isDisplayed()));
        onView(withText("Ответ:")).check(matches(isDisplayed()));
        onView(withId(R.id.edText1)).perform(typeText(userString), closeSoftKeyboard());
        onView(withId(R.id.edText2)).perform(typeText(ignoreString), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());



        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.edText1)).perform(clearText());
        onView(withId(R.id.edText2)).perform(clearText());
        onView(withId(R.id.edText1)).perform(typeText("1234567"), closeSoftKeyboard());
        onView(withId(R.id.edText2)).perform(typeText("234"), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.edText1)).perform(clearText());
        onView(withId(R.id.edText2)).perform(clearText());
        onView(withId(R.id.edText1)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.edText2)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.edText1)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.edText2)).perform(typeText("1232"), closeSoftKeyboard());
        onView(withId(R.id.edText2)).perform(clearText());
        onView(withId(R.id.button1)).perform(click());
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.edText1)).perform(typeText("67987008-9-0"), closeSoftKeyboard());
        onView(withId(R.id.edText2)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.edText1)).perform(clearText());


    }


}
