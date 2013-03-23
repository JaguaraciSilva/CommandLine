import java.util.Vector;

/**
 * 
 */

/**
 * class LoadMQ
 * @author jaguar
 * @created 19/03/2012
 */
public class LoadMQ implements CommandLine.ICommand {

 
    @Override
    public boolean doIt(Vector v) {
	//Access Simulator
	Simulator simulator = Simulator.getInstance();
	
	System.out.println("Transfer contents of register MQ to the accumulator AC" + v);
	
	System.out.println("Register MQ value = " + Simulator.getRegisterMQ().getContent());
	
	Simulator.getAccumulator().setContent(Simulator.getRegisterMQ().getContent());
	
	System.out.println("Accumulator AC value = " + Simulator.getAccumulator().getContent());
	
	return true;
    }

}
