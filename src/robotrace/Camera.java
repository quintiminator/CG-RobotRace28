package robotrace;
import java.lang.*;

/**
 * Implementation of a camera with a position and orientation. 
 */
class Camera {

    /** The position of the camera. */
   
    public Vector eye = new Vector(3f, 6f, 5f);
    
    /** The point to which the camera is looking. */
    public Vector center = Vector.O;

    /** The up vector. */
    public Vector up = Vector.Z;

    /**
     * Updates the camera viewpoint and direction based on the
     * selected camera mode.
     */
    public void update(GlobalState gs, Robot focus) {

        switch (gs.camMode) {
            
            // First person mode    
            case 1:
                setFirstPersonMode(gs, focus);
                break;
                
            // Default mode    
            default:
                setDefaultMode(gs);
        }
    }

    /**
     * Computes eye, center, and up, based on the camera's default mode.
     */
    private void setDefaultMode(GlobalState gs) {
        center = gs.cnt;
        up = Vector.Z;
        eye.x = gs.vDist*Math.cos(gs.theta)*Math.cos(gs.phi);
        eye.y = gs.vDist*Math.sin(gs.theta)*Math.cos(gs.phi);
        eye.z = gs.vDist*Math.sin(gs.phi);
        //eye.add(center);
    }

    /**
     * Computes eye, center, and up, based on the first person mode.
     * The camera should view from the perspective of the robot.
     */
    
   
    private void setFirstPersonMode(GlobalState gs, Robot focus) {
        /*up = Vector.Z;
        eye.x = ;
        eye.y = ;
        eye.z = ;
        center.x = eye.x + ; //current position + tangent (direction of movement)
        center.y = eye.y + ;
        center.z = eye.z + gs.vDist*Math.cos(gs.phi);
        */
    }
}
