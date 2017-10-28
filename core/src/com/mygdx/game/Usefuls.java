package com.mygdx.game;

import com.badlogic.gdx.utils.*;

//Public useful functions
public class Usefuls {

    public static long STARTTIME;

    public static int getTimeSeconds() {
        return (int)TimeUtils.timeSinceMillis(STARTTIME)/1000;
    }

    public static double getTimeMS() {
        return TimeUtils.timeSinceMillis(STARTTIME);
    }

    public static float getSlowSineWithOffset(float offset, float period) {
        return (float)Math.sin((getTimeMS()/1000%period+ offset));
    }









}
