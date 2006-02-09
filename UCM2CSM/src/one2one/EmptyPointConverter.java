package one2one;

import java.io.PrintStream;

import ucm.map.EmptyPoint;

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
            String Object_attributes = "<Sequence id=\"" + "h" + ep.getId() + "\""+ " " +
                                       "name=\"" + ep.getName() + "\""+ " " +
                                       "source=\"" + ep.getName() + "\""+ " " +
                                       "target=\"" + ep.getName() + "\"/>";

            // output to file
            ps.println("            " + Object_attributes);
            ps.flush();
        }

}




