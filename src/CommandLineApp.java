/**
 * 
 */

/**
 * class CommandLineTest
 * @author jaguar
 * @created 19/03/2012
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.Vector;

/**
 * class CommandLineApp
 * @author jaguar
 * @created 19/03/2012
 */
public class CommandLineApp {

    /**
     * Shows how to use the CommandLine class.
     * 
     * @param args
     *            The command-line parameters
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
	// This technique of reading from either
	// a script file or
	// from the console was 'borrowed' from BeanShell.
	Reader inputSrc = null;
	if (args.length > 0) {
	    inputSrc = new BufferedReader(new FileReader(args[0]));
	} else {
	    inputSrc = new InputStreamReader(System.in);
	}

	// initialize the command line object.
	CommandLine jr = new CommandLine();
	jr.setCommandLinePrompt("Command> ");
	jr.setCommandLineVersion("Command Line v.01");
	jr.assignClassToCommnd("loadMQ", "LoadMQ");
	jr.assignClassToCommnd("loadMQM$", "LoadMQMX");
	jr.init();
	if (args.length > 0) {
	    jr.setIsInteractive(false);
	}

	//Creates Simulator
	Simulator simulator = Simulator.getInstance();
	
	//Attributes registerMQ = "teste23"
	Simulator.getRegisterMQ().setContent("teste23");
	
	//Attributes memory x location = "testeMem"
	Simulator.getMemory().setAddress(1, new String("testeMem"));
	
	// parse and execute commands.
	jr.parseStream(new StreamTokenizer(inputSrc));
	
	System.out.println("\nDone.");
    }


}
