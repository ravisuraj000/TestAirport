package com.airports.parellelprocessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReadWriteLock;

public class TimerApp {
    public static void main(String[] args) {
        TimerTask tasknew = new TimerScheduleFixedRateDelay();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(tasknew, 500, 5000);
    }
    private static class TimerScheduleFixedRateDelay extends TimerTask {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    Files.copy(Paths.get("C:\\airportsdata\\events.csv"),
                            Paths.get("C:\\events\\events_" + System.currentTimeMillis() + ".csv"), StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (IOException e) {
            }
        }
    }
}
