/**
 * 
 */

/**
 * class Simulator
 * 
 * @author jaguar
 * @created 20/03/2012
 */
public class Simulator {

    // creates registerMQ and accumulator
    static RegisterMQ registerMQ = new RegisterMQ();
    static Accumulator accumulator = new Accumulator();
    static Memory memory = new Memory(256);

    private static Simulator instance = new Simulator();;

    private Simulator() {

    }  

    public static Simulator getInstance() {
       return instance;
    }

    /**
     * @return the registerMQ
     */
    public static RegisterMQ getRegisterMQ() {
        return registerMQ;
    }

    /**
     * @param registerMQ the registerMQ to set
     */
    public void setRegisterMQ(RegisterMQ registerMQ) {
        this.registerMQ = registerMQ;
    }

    /**
     * @return the accumulator
     */
    public static Accumulator getAccumulator() {
        return accumulator;
    }

    /**
     * @param accumulator the accumulator to set
     */
    public void setAccumulator(Accumulator accumulator) {
        this.accumulator = accumulator;
    }

    /**
     * @return the memory
     */
    public static Memory getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public  void setMemory(Memory memory) {
        this.memory = memory;
    }
    
    

}
