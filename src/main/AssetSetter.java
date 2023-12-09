package main;

import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        // klíč 1
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 37 * gp.tileSize;
        gp.obj[0].worldY = 6 * gp.tileSize;
        // klíč 2
        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 19 * gp.tileSize;
        gp.obj[1].worldY = 21 * gp.tileSize;
        // klíč 3
        gp.obj[2] = new OBJ_Key();
        gp.obj[2].worldX = 34 * gp.tileSize;
        gp.obj[2].worldY = 39 * gp.tileSize;
        // dveře 1
        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 19 * gp.tileSize;
        gp.obj[4].worldY = 18 * gp.tileSize;
        // dveře 2
        gp.obj[6] = new OBJ_Door();
        gp.obj[6].worldX = 16 * gp.tileSize;
        gp.obj[6].worldY = 22 * gp.tileSize;
        // dveře 3
        gp.obj[7] = new OBJ_Door();
        gp.obj[7].worldX = 8 * gp.tileSize;
        gp.obj[7].worldY = 18 * gp.tileSize;
        // truhla
        gp.obj[8] = new OBJ_Chest();
        gp.obj[8].worldX = 11 * gp.tileSize;
        gp.obj[8].worldY = 16 * gp.tileSize;
        // boty
        gp.obj[9] = new OBJ_Boots();
        gp.obj[9].worldX = 26 * gp.tileSize;
        gp.obj[9].worldY = 37 * gp.tileSize;
    }
}
