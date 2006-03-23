package one2one;

import java.io.PrintStream;

import ucm.map.EmptyPoint;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

/**
* <!-- begin-user-doc -->
* Creates the CSM representation(Sequence) of the EmptyPoint object
* <!-- end-user-doc -->
* @see one2one
* @generated
*/

public class EmptyPointConverter implements AbstractConverter{
        private EmptyPoint ep;
       
        // constructors
        public EmptyPointConverter(EmptyPoint ep){
           this.ep = ep;
        }

        // prints XML representation of object to output file
        public void Convert(PrintStream ps){

            // object attributes
            String Object_attributes = "<Sequence id=\"" + "h" + ep.getId() + "\""; 
                                     
            ps.print("			" + Object_attributes);
            String closing_attribute = "/>";
           
           //optional attributes     
            OptionalAssociations.printDescription(ps, ep);
            OptionalAssociations.printTarget(ps, ep);
            OptionalAssociations.printSource(ps, ep);
            
            // output to file
            ps.println(closing_attribute);
            ps.flush();
        }

}




