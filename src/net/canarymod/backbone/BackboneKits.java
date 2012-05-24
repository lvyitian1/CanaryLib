package net.canarymod.backbone;

import java.util.ArrayList;

import net.canarymod.database.Database;
import net.canarymod.kit.Kit;

public class BackboneKits extends Backbone {
    
    Database db;
    
    public BackboneKits(Database database, Database.Type type) {
        super(Backbone.System.KITS, type);
        db = database;
    }
    /**
     * Add a new Kit to the list of Kits.
     * 
     * @param Kit
     */
    public void addKit(Kit kit) {
    }

    /**
     * emove a Kit from the data source
     * 
     * @param Kit
     */
    public void removeKit(Kit kit) {
    }

    /**
     * Get a Kit for this player name
     * 
     * @param name
     * @return Returns a Kit object if that Kit was found, null otherwise
     */
    public Kit getKit(String name) {
        return null;
    }

    /**
     * Update a Kit
     * 
     * @param Kit
     */
    public void updateKit(Kit kit) {
    }

    /**
     * Load and return all recorded bans
     * 
     * @return
     */
    public ArrayList<Kit> loadKits() {
        return null;
    }
}
