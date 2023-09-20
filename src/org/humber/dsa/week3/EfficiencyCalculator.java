package org.humber.dsa.week3;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class EfficiencyCalculator {

    private static long startTimeNano;

    private EfficiencyCalculator() {
    }

    public synchronized static void startRecording() {
        startTimeNano = System.nanoTime();
    }

    public synchronized static void stopRecording() {
        long endTimeNano = System.nanoTime();
        System.out.println("------------------------------------------------------------");
        System.out.println("Started At: " + humanReadable(startTimeNano) + " | Finished At: " + humanReadable(endTimeNano));
        System.out.println("Time Taken: " + toMilliseconds(endTimeNano - startTimeNano) + " milliseconds");
        System.out.println("------------------------------------------------------------");
    }

    private static long toMilliseconds(long milliseconds) {
        return milliseconds / 1000_000 ;
    }

    private static String humanReadable(long nanoseconds) {
        return new SimpleDateFormat("hh:mm:ss.SSS a")
                .format(new Date(toMilliseconds(nanoseconds)));
    }
}
