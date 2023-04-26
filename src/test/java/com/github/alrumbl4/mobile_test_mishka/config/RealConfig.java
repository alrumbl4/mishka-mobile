package com.github.alrumbl4.mobile_test_mishka.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/AndroidReal.properties"
})
public interface RealConfig extends Config {

    @Key("deviceName")
    String deviceName();

    @Key("platformName")
    String platformName();

    @Key("platformVersion")
    String platformVersion();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("app")
    String app();

    @Key("remoteURL")
    String remoteURL();
}
