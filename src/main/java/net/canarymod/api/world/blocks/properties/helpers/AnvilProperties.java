package net.canarymod.api.world.blocks.properties.helpers;

import net.canarymod.api.world.blocks.Block;
import net.canarymod.api.world.blocks.BlockFace;
import net.canarymod.api.world.blocks.BlockType;
import net.canarymod.api.world.blocks.properties.BlockDirectionProperty;
import net.canarymod.api.world.blocks.properties.BlockIntegerProperty;

/**
 * Anvil properties helper
 *
 * @author Jason Jones (darkdiplomat)
 */
public final class AnvilProperties extends BlockProperties {
    private static final BlockIntegerProperty damage = getInstanceFor(BlockType.Anvil, "damage");
    private static final BlockDirectionProperty facing = getInstanceFor(BlockType.Anvil, "facing");

    /**
     * Applies a {@link net.canarymod.api.world.blocks.BlockFace} facing property to the {@code Anvil}
     *
     * @param block
     *         the {@link net.canarymod.api.world.blocks.Block} to be modified
     * @param value
     *         the {@link net.canarymod.api.world.blocks.BlockFace} value to apply
     *
     * @return the Block with adjusted state (NOTE: Original Block object is also modified, using the return is unnecessary)
     *
     * @throws java.lang.NullPointerException
     *         Should {@code block} or {@code value} be null
     * @throws java.lang.IllegalArgumentException
     *         Should an invalid property be applied
     */
    public static Block applyFacing(Block block, BlockFace value) {
        return apply(block, facing, value);
    }

    /**
     * Applies damage to the {@code Anvil}
     *
     * @param block
     *         the {@link net.canarymod.api.world.blocks.Block} to be modified
     * @param value
     *         the {@code int} value to apply (0 - 2)
     *
     * @return the Block with adjusted state (NOTE: Original Block object is also modified, using the return is unnecessary)
     *
     * @throws java.lang.NullPointerException
     *         Should {@code block} or {@code value} be null
     * @throws java.lang.IllegalArgumentException
     *         Should an invalid property be applied
     */
    public static Block applyDamage(Block block, int value) {
        return apply(block, damage, value);
    }
}