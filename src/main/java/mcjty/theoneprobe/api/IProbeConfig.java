package mcjty.theoneprobe.api;

/**
 * This inerface represents the default config for The One Probe.
 */
public interface IProbeConfig {

    public static enum ConfigMode {
        NOT,            // Don't show
        NORMAL,         // Show
        EXTENDED        // Show only when sneaking
    }

    /**
     * Control how RF should be shown
     * @param mode 0 = not, 1 = show as bar, 2 = show as text
     */
    IProbeConfig setRFMode(int mode);
    int getRFMode();

    /**
     * Control how Liquid should be shown
     * @param mode 0 = not, 1 = show as bar, 2 = show as text
     */
    IProbeConfig setTankMode(int mode);
    int getTankMode();

    IProbeConfig showLeverSetting(ConfigMode mode);
    ConfigMode getShowLeverSetting();

    IProbeConfig showTankSetting(ConfigMode mode);
    ConfigMode getShowTankSetting();

    IProbeConfig showModName(ConfigMode mode);
    ConfigMode getShowModName();

    IProbeConfig showHarvestLevel(ConfigMode mode);
    ConfigMode getShowHarvestLevel();

    IProbeConfig showCanBeHarvested(ConfigMode mode);
    ConfigMode getShowCanBeHarvested();

    IProbeConfig showCropPercentage(ConfigMode mode);
    ConfigMode getShowCropPercentage();

    IProbeConfig showChestContents(ConfigMode mode);
    ConfigMode getShowChestContents();

    // This controls when detailed chest info is shown in case the amount of items is below showItemDetailThresshold
    IProbeConfig showChestContentsDetailed(ConfigMode mode);
    ConfigMode getShowChestContentsDetailed();

    IProbeConfig showRedstone(ConfigMode mode);
    ConfigMode getShowRedstone();

    IProbeConfig showMobHealth(ConfigMode mode);
    ConfigMode getShowMobHealth();

    IProbeConfig showMobPotionEffects(ConfigMode mode);
    ConfigMode getShowMobPotionEffects();
}