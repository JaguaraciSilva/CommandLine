import java.util.Vector;

/**
 * 
 */

/**
 * class LoadMQMX
 * @author jaguar
 * @created 20/03/2012
 */
public class LoadMQMX implements CommandLine.ICommand {

    protected int MXPosition;
    
    public LoadMQMX(int mxPosition){
	this.MXPosition = mxPosition;
    }
    
    /**
     * @return the mXPosition
     */
    protected int getMXPosition() {
        return MXPosition;
    }



    /**
     * @param mXPosition the mXPosition to set
     */
    protected void setMXPosition(int mXPosition) {
        MXPosition = mXPosition;
    }


    @Override
    public boolean doIt(Vector v) {
	//Access Simulator
	Simulator simulator = Simulator.getInstance();
	
	System.out.println("Transfer contents of memory x location to MQ" + v);
	
	System.out.println("Memory x location value = " + Simulator.getRegisterMQ().getContent());
	
	Simulator.getRegisterMQ().setContent((String)Simulator.getMemory().getAddress(this.getMXPosition()));
	
	System.out.println("Register MQ value = " + Simulator.getRegisterMQ().getContent());
	
	return true;
    }

}
