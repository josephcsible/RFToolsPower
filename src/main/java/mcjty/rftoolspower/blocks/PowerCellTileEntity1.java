package mcjty.rftoolspower.blocks;

import mcjty.rftoolspower.config.Config;

public class PowerCellTileEntity1 extends PowerCellTileEntity {

    @Override
    Tier getTier() {
        return Tier.TIER1;
    }

    @Override
    int getLocalMaxEnergy() {
        return Config.TIER1_MAXRF;
    }

    @Override
    int getRfPerTickPerSide() {
        return Config.TIER1_RFPERTICK;
    }
}
