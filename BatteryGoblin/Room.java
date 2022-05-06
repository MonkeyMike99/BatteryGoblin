
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    private boolean hasLeftDoor;
    private boolean hasRightDoor;
    private boolean hasTopDoor;
    private boolean hasBotDoor;
    private 
    
    public Room(boolean left,boolean right,boolean top,boolean bot){
        hasLeftDoor=left;
        hasRightDoor=right;
        hasTopDoor=top;
        hasBotDoor=bot;
    }
    public boolean[] getWalls(){
        boolean[] out = new boolean[5];
        out[Constants.LEFT]=hasLeftDoor;
        out[Constants.RIGHT]=hasRightDoor;
        out[Constnast.TOP] =hasTopDoor;
        out[Constanst.BOTTOM]=hasBotDoor;
        return out;
    }
    
}
