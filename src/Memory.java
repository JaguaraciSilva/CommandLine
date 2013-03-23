import java.util.ArrayList;

/**
 * 
 */

/**
 * class Memory
 * @author jaguar
 * @created 20/03/2012
 */
public class Memory {
    
    ArrayList address = new ArrayList();
    
    public Memory(int size){
	for (int i=0;i<size;i++){
	    address.add(i, new String());
	}
    }

    /**
     * @return the address
     */
    public Object getAddress(int position) {
        return address.get(position);
    }

    /**
     * @param address the address to set
     */
    public void setAddress(int position, Object object) {
        this.address.set(position, object);
    }

    
}
