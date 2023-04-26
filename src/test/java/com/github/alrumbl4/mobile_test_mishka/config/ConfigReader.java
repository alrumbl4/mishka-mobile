package com.github.alrumbl4.mobile_test_mishka.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigReader {

    public static final EmulatorConfig EMULATOR_CONFIG = ConfigFactory.create(EmulatorConfig.class, System.getProperties());

    public static final RealConfig REAL_CONFIG = ConfigFactory.create(RealConfig.class, System.getProperties());
}
