package net.canarymod.hook.player;

import net.canarymod.api.entity.EntityItem;
import net.canarymod.api.entity.Player;
import net.canarymod.hook.CancelableHook;

/**
 * Item Hook. Contains EntityItem and Player
 * @author 
 *
 */
public class ItemHook extends CancelableHook{

    private EntityItem item;
    private Player player;
    
    public ItemHook(Player player, EntityItem item, boolean isDropped){
        this.player = player;
        this.item = item;
        this.type = isDropped ? Type.ITEM_DROP : Type.ITEM_PICK_UP;
    }
    
    /**
     * Gets the {@link Player}
     * @return
     */
    public Player getPlayer(){
        return player;
    }
    
    /**
     * Gets the {@link EntityItem}
     * @return
     */
    public EntityItem getItem(){
        return item;
    }
    
    public Object[] getDataSet(){
        return new Object[]{ player, item, isCanceled };
    }
}