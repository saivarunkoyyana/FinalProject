package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Pair;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.support.test.InstrumentationRegistry.getContext;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class EmptyTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>( MainActivity.class );

    @Test
    public void emptyTest() {
        EndpointsAsyncTask AsyncTask=new EndpointsAsyncTask( new EndpointsAsyncTask.Interfaceclass() {
            @Override
            public void jokesmethod(String joke) {

            }
        } );
        AsyncTask.execute( new Pair<Context, String>( getContext(),"hello" ) );
        try {
            String result=AsyncTask.get();


            assertNull(result);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
    }


