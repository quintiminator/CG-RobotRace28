
package robotrace;

/**
 * Implementation of RaceTrack, creating a track from a parametric formula
 */
public class ParametricTrack extends RaceTrack {
    
    @Override
    protected Vector getPoint(double t) {
        Vector TrackPoint = new Vector(3f, 6f, 5f);
        TrackPoint.x = 10*Math.cos(2*Math.PI*t);
        TrackPoint.y = 14*Math.sin(2*Math.PI*t); 
        TrackPoint.z = 1;
        return TrackPoint;
    }

    @Override
    protected Vector getTangent(double t) {
        Vector TrackTangent = new Vector (3f, 6f, 5f);
        TrackTangent.x = -20*Math.PI*Math.sin(2*Math.PI*t);
        TrackTangent.y = 28*Math.PI*Math.cos(2*Math.PI*t);
        TrackTangent.z = 0;
        return TrackTangent;
    }
    
}
