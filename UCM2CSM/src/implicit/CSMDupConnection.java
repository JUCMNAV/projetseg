package implicit;

import ucm.map.NodeConnection;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * A CSMDupConnection is a reference to a connection in the original UCMmap
 * <!-- end-user-doc -->
 * @see implicit 
 * @generated
 */
    
public class CSMDupConnection {
            
        private NodeConnection connection;
        private String target_id;
        private String source_id;
        private CSMDupNode source_node;
        private CSMDupNode target_node;
               
                
        // Constructors
        
        public CSMDupConnection(NodeConnection connection)
        {
            this.connection = connection;
            this.source_id = ((PathNode)((NodeConnection)connection).getSource()).getId();            
            this.target_id = ((PathNode)((NodeConnection)connection).getTarget()).getId();
            this.source_node = new CSMDupNode ((PathNode)((NodeConnection)connection).getSource());
            this.target_node = new CSMDupNode ((PathNode)((NodeConnection)connection).getTarget()); 
        }
        
        public CSMDupConnection(String source, String target)
        {
            this.connection = null;
            this.source_id = source;
            this.target_id = target;            
        }
        
        public CSMDupConnection(PathNode source, String target)
        {
            this.connection = null;
            this.source_id = source.getId();
            this.target_id = target;            
            this.source_node = new CSMDupNode (source);            
        }
        
        public CSMDupConnection(PathNode source, CSMDupNode target)
        {
            this.connection = null;
            this.source_id = source.getId();
            this.target_id = target.getId();
            this.source_node = new CSMDupNode (source);
            this.target_node = target;
        }
        
        public CSMDupConnection(CSMDupNode source, PathNode target)
        {
            this.connection = null;
            this.source_id = source.getId();
            this.target_id = target.getId();
            this.source_node = source;
            this.target_node = new CSMDupNode (target);
        }
        
        public CSMDupConnection(String source, PathNode target)
        {
            this.connection = null;
            this.source_id = source;
            this.target_id = target.getId();  
            // this.source_node = source;
            this.target_node = new CSMDupNode (target);
        }
        
        public CSMDupConnection(CSMDupNode source, CSMDupNode target)
        {
            this.connection = null;
            this.source_id = source.getId();
            this.target_id = target.getId();
            this.source_node = source;
            this.target_node = target;
        }
        
        public PathNode getTarget(){
            if (connection != null)
                return (PathNode) connection.getTarget();
            else 
                return null;
        }
        
        public CSMDupNode getCSMTarget(){
            return target_node;
        }
        
        public PathNode getSource(){
            if (connection != null)
                return (PathNode) connection.getSource();
            else 
                return null;
        }
        
        public CSMDupNode getCSMSource(){
            return source_node;
        }
        
        public String getTargetStr(){
            return target_id;
        }
        
        public String getSourceStr(){
            return source_id;
        }
        
        public boolean isNodeConnection(){
            if (connection == null){
                return false;
            }
            return true;                
        }
}
