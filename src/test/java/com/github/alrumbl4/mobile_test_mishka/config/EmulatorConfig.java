package com.github.alrumbl4.mobile_test_mishka.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/AndroidEmulator.properties"
})
public interface EmulatorConfig extends Config{
    @Key("deviceName")
    String deviceName();

    @Key("platformName")
    String platformName();

    @Key("platformVersion")
    String platfromVersion();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("app")
    String app();

    @Key("remoteURL")
    String remoteURL();
}
