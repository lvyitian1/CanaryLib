package net.canarymod.hook.player;

import net.canarymod.api.entity.Player;
import net.canarymod.hook.Hook;

/**
 * Connection hook. Contains information about a player connecting/disconnection.
 * @author Jason Jones
 *
 */
public class ConnectionHook extends Hook{

    private Player player;
    private String message, reason;
    private boolean hidden;
    
    public ConnectionHook(Player player, String message, String reason){
        this.player = player;
        this.message = message;
        this.reason = reason;
        this.type = reason != null ? Type.PLAYER_DISCONNECT : Type.PLAYER_CONNECT;
    }
    
    /**
     * gets the player
     * @return
     */
    public Player getPlayer(){
        return player;
    }
    
    /**
     * gets the message sent to all
     * @return
     */
    public String getMessage(){
        return message;
    }
    
    /**
     * sets the message set to all
     * @param message
     */
    public void setMessage(String message){
        this.message = message;
    }
    
    /**
     * get the reason for disconnect (if applicable)
     * @return reason if disconnecting, null otherwise
     */
    public String getReason(){
        return reason;
    }
    
    /**
     * gets whether this should be a hidden connect/disconnect
     * @return hidden
     */
    public boolean isHidden(){
        return hidden;
    }
    
    /**
     * sets whether this should be a hidden connect/disconnect
     * @param hidden
     */
    public void setHidden(boolean hidden){
        this.hidden = hidden;
    }
    
    /**
     * Return the set of Data in this order: PLAYER MESSAGE REASON HIDDEN
     */
    @Override
    public Object[] getDataSet() {
        return new Object[]{ player, message, reason, hidden };
    }
}
