package hudson.plugins.selenium;

import org.openqa.selenium.grid.commands.Hub;

/**
 * Used inside Hub JVM to hold the reference to the running {@link Hub}
 * 
 * @author Richard Lavoie
 */
public class HubHolder {

    private static Hub hub;

    private HubHolder() {}

    public static Hub getHub() {
        return hub;
    }

    public static void setHub(Hub hub) {
        HubHolder.hub = hub;
    }

    public static boolean hasHub() {
        return HubHolder.hub != null;
    }
}
