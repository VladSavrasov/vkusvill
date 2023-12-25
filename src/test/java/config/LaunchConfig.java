package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${launch}.properties"
})
public interface LaunchConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("version")
    @DefaultValue("100.0")
    String version();

    @Key("remoteUrl")
    String remoteUrl();
}