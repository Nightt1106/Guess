package com.example.guess



import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.TypeTextAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MeterialActivityTest{

    @Rule
    @JvmField
    val activityTestRule = ActivityTestRule<MaterialActivity>(MaterialActivity::class.java)

    @Test
    fun guesswrong() {
        val secert = activityTestRule.activity.secretNumber.secret
        val resourses = activityTestRule.activity.resources
        
        for (n in 1..10) {
            if (n != secert) {
                onView(withId(R.id.number)).perform(clearText())
                onView(withId(R.id.number)).perform(TypeTextAction(n.toString()))
                onView(withId(R.id.button_ok)).perform(click())
                val message =
                    if (n < secert) resourses.getString(R.string.bigger)
                    else resourses.getString(R.string.smaller)
                onView(withText(message)).check(matches(isDisplayed()))
                onView(withText(R.string.ok)).perform(click())
            }
        }
    }
}