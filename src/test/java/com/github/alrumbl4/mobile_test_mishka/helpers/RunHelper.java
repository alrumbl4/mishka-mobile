package com.github.alrumbl4.mobile_test_mishka.helpers;

import com.github.alrumbl4.mobile_test_mishka.driver.EmulatorMobileDriver;
import com.github.alrumbl4.mobile_test_mishka.driver.RealMobileDriver;

public class RunHelper {
    public static String deviceHost = System.getenv("deviceHost");

    private RunHelper() {
    }

    public static RunHelper runHelper() {
        return new RunHelper();
    }

    public Class<?> getDriverClass() {
        if (deviceHost == null) {
            throw new RuntimeException("Необходимо ввести обязательный параметр deviceHost");
        }

        switch (deviceHost) {
            case "emulator":
                return EmulatorMobileDriver.class;
            case "real":
                return RealMobileDriver.class;
            default:
                throw new RuntimeException("Параметр deviceHost может принимать только одно из следующих значений: " +
                        "browserstack/selenoid/emulation/real");
        }
    }
}
