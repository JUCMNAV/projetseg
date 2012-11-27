
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * A class to capture all the information from the input csv file that is stored in a list of arrays of strings
 * and generating the grl(xml) and saving it.
 * 
 * @author Rouzbahan
 *
 */
public class XMLFileSimple
{
    private ArrayList <String> LegislationID;  
    private ArrayList <String> LegislationSection;
    private ArrayList <String> RefinedLegislationSection; // a list of legislation with all the elements being labeled with relevant name 
    private ArrayList <String> IntentionalElement; // ENGLISH-DESCRIPTION values
    private ArrayList <String> RedundantIntentionalElement;
    private ArrayList <String> AltName; // FRENCH_DESCRIPTION values
    private ArrayList <String> hyperlink; //URL values
    private ArrayList <String> AltDescription; // related to grl file
    private ArrayList <String> Importance;
    private ArrayList <ArrayList<String>> ImportanceRow;
    private ArrayList <String> ImportanceRange;
    private ArrayList <String> Decomposition;
    private ArrayList <String> Kpi;
    private ArrayList <ArrayList <String>> MultipleKpi;
    private ArrayList <String> NoRedundantMultipleKpi;
    private ArrayList <String> RedundantMultipleKpi;
    private ArrayList <String> AltKpi;
    private ArrayList <ArrayList <String>> MultipleAltKpi;
    private ArrayList <String> NoRedundantMultipleAltKpi;
    private ArrayList <String> RedundantMultipleAltKpi;
    private ArrayList <String> Stereotype;
    private ArrayList <ArrayList<String>> GoalStereoType;
    private ArrayList <ArrayList<String>> MultipleStereoType;
    private ArrayList <String> RefinedDecomposition; // to consider all the elements AND, except for OR
    private ArrayList <ElementDefinition> ElementDefinitionList; // for grl file
    private ArrayList <ElementDefinition> KpiElementDefinitionList; // for KPIs in grl file
    private ArrayList <ContributionAttribute> KpiContributionLinkDefinitionList; // for KPIs in grl file
    private ArrayList <DecompoitionAttribute> DecompositionLinkDefinitionList; // for grl file
    private ArrayList <ContributionAttribute> ContributionLinkDefinitionList; // for grl file
    private ArrayList <RelationNode> RelationList; // to keep relations betweeen goals
    private ArrayList <String> IDList; // list of ids of element definitions of grl file elements
    private ArrayList <String> LinkIDList; // list of ids of link definition of grl file elements
    private ArrayList <Integer> ContributionValueList; 
  
    private boolean noKpi = true, noAltKpi = true, kpiStereotypeExists = false, goalStereotypeExists = false;
    private int numberofIntentionalElement, endOfGoalsIndex;
    private final static int metadataArraySize = 5;
    private static int columnSize;
    private static int currentColumn = 0;
  
    public void setLegislationID( List <String[]> list ) {
        String [] row;
        columnSize = list.get(0).length;
        currentColumn = 0;
        System.out.println("The number of column is : " + columnSize);
        for (int i = 0; i < list.size(); i++) // finding the last row of goals on csv file
            if (list.get(i) [0].equals("KpiStereoTypes")) {
                endOfGoalsIndex = i;
                break;
            }
        
        System.out.println("The number of rows of goals is : " + endOfGoalsIndex);
        LegislationID = new ArrayList<String>();    
        if (currentColumn < columnSize)
            for (int i = 0; i < endOfGoalsIndex; i++) {
                row = list.get(i);
                LegislationID.add(row[currentColumn]);
            }
      
        currentColumn++;
        LegislationID.remove(0);
        System.out.println("Here!!!");
        System.out.println("\nSimple LegislationID size is : " + LegislationID.size());
    }
  
    public ArrayList <String> getLegislationID() {
        return LegislationID;
    }
  
    public void setLegislationSection( List <String[]> list ) {
        String [] row;
        LegislationSection = new ArrayList<String>();
        if (currentColumn < columnSize)
            for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                row = list.get( i );
                LegislationSection.add( row[ currentColumn ] );
            }
      
        LegislationSection.remove( 0 );      
        currentColumn++;
        System.out.println( "\nSimple LegislationSection size is : " + LegislationSection.size() );
    }
    
    private void setRefinedLegislationSection() {
        RefinedLegislationSection = new ArrayList <String>(LegislationSection); //to make new copy of list of LegislationSection into RefinedLegislationSection
        for (int i = 0; i < LegislationSection.size(); i++) // Creating RefinedLegislationList
            if (LegislationSection.get(i).equals(""))
                RefinedLegislationSection.set(i, IntentionalElement.get(i));
        
        System.out.println( "\nSimple RefinedLegislationSection size is : " + RefinedLegislationSection.size() );
    }
  
    public ArrayList <String> getLegislationSection() {
        return LegislationSection;
    }
    
    public ArrayList <String> getRefinedLegislationSection() {
        return RefinedLegislationSection;
    }
  
    public void setIntentionalElement( List <String[]> list ) {
        String [] row;
        IntentionalElement = new ArrayList<String>(); 
        if (currentColumn < columnSize)
            for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                row = list.get( i );
                IntentionalElement.add( row[ currentColumn ] );
            }
      
        currentColumn++;
        IntentionalElement.remove( 0 );
        setRefinedLegislationSection();
        findRedundantIntentionalelement(); // Taking care of redundant regulation I 
        refineIntenionalElement(); // Taking care of redundant regulation II
        numberofIntentionalElement = IntentionalElement.size();
        System.out.println( "\nSimple IntentionalElement size is : " + IntentionalElement.size() );
        System.out.println( "\nSimple RedundantIntentionalElement size is : " + RedundantIntentionalElement.size() );
    }
  
    public ArrayList <String> getIntentionalElement() {
        return IntentionalElement;
    }
  
    public void setAltName( List <String[]> list ) {
        String [] row;
        AltName = new ArrayList<String>();
        if (currentColumn < columnSize)
            for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                row = list.get( i );
                AltName.add( row[ currentColumn ] );
            }
      
        currentColumn++;
        AltName.remove( 0 );
        refineAltName();
        System.out.println( "\nSimple AltName size is : " + AltName.size() );
    }
  
    public ArrayList <String> getAltName() {
        return AltName;
    }
  
    public void setHyperlink( List <String[]> list ) {
        String [] row;
        hyperlink = new ArrayList<String>();    
        if (currentColumn < columnSize)
            for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                row = list.get( i );
                hyperlink.add( row[ currentColumn ] );
            }
      
        currentColumn++;
        hyperlink.remove( 0 );    
        System.out.println( "\nSimple hyperlink size is : " + hyperlink.size() );
    }
  
    public ArrayList <String> getHyperlink() {
        return hyperlink;
    }
  
    public void setAltDescription( List <String[]> list ) {
        AltDescription = new ArrayList<String>();    
        if (currentColumn < columnSize)
          for ( int i = 0; i < endOfGoalsIndex; i++ )
              AltDescription.add( "" );
             
        //currentColumn++;
        AltDescription.remove( 0 );    
        System.out.println( "\nSimple AltDescription size is : " + AltDescription.size() );
    }
  
    public ArrayList <String> getAltDescription() {
        return AltDescription;
    }
  
    public void setImportance( List <String[]> list ) {
        String [] row;
        Importance = new ArrayList<String>();    
        if (currentColumn < columnSize)
            for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                row = list.get( i );
                Importance.add( row[ currentColumn ] );            
            }
      
        currentColumn++;
        Importance.remove( 0 );
        makeImportanceRange();
        System.out.println( "\nSimple Importance size is : " + Importance.size() );
        System.out.println( "\nSimple ImportanceRange size is : " + ImportanceRange.size() );
    } 
  
    public ArrayList <String> getImportance() {
        return Importance;
    }
  
    public void setDecomposition( List <String[]> list ) {
        String [] row;
        Decomposition = new ArrayList<String>();    
        if (currentColumn < columnSize)
            for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                row = list.get( i );
                Decomposition.add( row[ currentColumn ] );            
            }
      
        Decomposition.remove( 0 );        
        RefinedDecomposition = new ArrayList <String>( Decomposition );        
        for ( int i = 0; i < RefinedDecomposition.size(); i++ )
            if ( RefinedDecomposition.get( i ).equals("") )
                RefinedDecomposition.set( i, "And" );
        
        currentColumn++;
        System.out.println( "\nSimple Decomposition size is : " + Decomposition.size() );
        System.out.println( "\nSimple RefinedDecomposition size is : " + RefinedDecomposition.size() );
    }
  
    public ArrayList <String> getDecomposition() {
        return Decomposition;
    }
    
    public ArrayList <String> getRefinedDecomposition() {
        return RefinedDecomposition;
    }
    
    public void setGoalStereoType( List <String[]> list ) {
        String [] row;
        Stereotype = new ArrayList<String>();
        if (currentColumn < columnSize) {
            if (list.get(0)[currentColumn].equals("STEREOTYPE")) // if STEREOTYPE column exists in the csv file
                goalStereotypeExists = true;
            
            if (goalStereotypeExists) {
                if (currentColumn < columnSize)
                    for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                        row = list.get( i );
                        Stereotype.add( row[ currentColumn ] );            
                    }
              
                Stereotype.remove( 0 );
                makeGoalStereoType();
                currentColumn++;
                System.out.println( "\nSimple Stereotype size for Goals is : " + Stereotype.size() );
                System.out.println( "\nSimple GoalStereoType size is : " + GoalStereoType.size() );
            }
        }
    }
    
    public ArrayList<ArrayList<String>> getGoalStereoType() {
        return GoalStereoType;
    }
    
    public void setKpi( List <String[]> list ) {
        String [] row;
        Kpi = new ArrayList<String>();        
        if (currentColumn < columnSize) {
        //if (list.get(0).length > 7) {    
            noKpi = false;            
            for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                row = list.get( i );
                Kpi.add( row[ currentColumn ] );            
            }
          
            Kpi.remove( 0 );
        } else {
            for ( int i = 0; i < endOfGoalsIndex; i++ )
                Kpi.add("");
        }
    
        currentColumn++;
        System.out.println( "\nSimple Kpi size is : " + Kpi.size() );
        makeMultipleKpi(); // taking care of KPIs by creating list of list of string. 
        refineNoRedundantMultipleKpi(); // removing redundancy by refining the name of redundant element.
        makeNoRedundantMultipleKpi(); // separating the redundancy into new list.
    } 
  
    public ArrayList <String> getKpi() {
        return Kpi;
    }
    
    public void setAltKpi( List <String[]> list ) {
        String [] row;
        AltKpi = new ArrayList<String>();
        if (!noKpi) {
            if (currentColumn < columnSize) {
            //if (list.get(0).length > 8) {
                noAltKpi = false;                
                for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                    row = list.get( i );
                    AltKpi.add( row[ currentColumn ] );            
                }
                  
                AltKpi.remove( 0 );
            } else {
                for ( int i = 0; i < endOfGoalsIndex; i++ )
                    AltKpi.add("");
            }
        } else {
            for ( int i = 0; i < endOfGoalsIndex; i++ )
                AltKpi.add("");
        }    
    
        currentColumn++;
        System.out.println( "\nSimple AltKpi size is : " + AltKpi.size() );        
        makeMultipleAltKpi();
        refineNoRedundantMultipleAltKpi();
        makeNoRedundantMultipleAltKpi();
    } 
  
    public ArrayList <String> getAltKpi() {
        return AltKpi;
    }
    
    public void setKpiStereotype( List <String[]> list ) {
        String [] row;
        Stereotype = new ArrayList<String>();                
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            row = list.get(i);
            if (row[0].equals("KpiStereoTypes")) {
                index = i + 1;
                kpiStereotypeExists = true;
                break;
            }
        }
        
        int counter = 0;
        if (kpiStereotypeExists) {
            MultipleStereoType = new ArrayList<ArrayList<String>>();
            for (int i = index; i < list.size(); i++)
                MultipleStereoType.add(new ArrayList<String>());
                
            for (int i = index; i < list.size(); i++) {
                row = list.get( i );
                for (int j = 0; j < row.length; j++)
                    if (!row[j].equals(""))
                        MultipleStereoType.get(counter).add(row[j]);                    
               
                counter++;
            }
        }
        //makeMultipleStereoType(); // taking care of KPIs' stereotypes 
        //makeKpiStereotype(); // taking care of KPIs' stereotypes
    } 

    public ArrayList <String> getStereotype() {
        return Stereotype;
    }
  
    public ArrayList <ElementDefinition> getElementDefinitionList() {
        return ElementDefinitionList;
    }
    
    public ArrayList <DecompoitionAttribute> getDecompositionLinkDefinitionList() {
        return DecompositionLinkDefinitionList;
    }
    
    public ArrayList <ContributionAttribute> getContributionLinkDefinitionList() {
        return ContributionLinkDefinitionList;
    }
    
    public ArrayList <ContributionAttribute> getKpiContributionLinkDefinitionList() {
        return KpiContributionLinkDefinitionList;
    }
  
    public ArrayList <RelationNode> getRelationList() {
        return RelationList;
    }
    
    public ArrayList <Integer> getContributionValueList() {
        return ContributionValueList;
    }
    
    public ArrayList <ElementDefinition> getKpiElementDefinitionList() {
        return KpiElementDefinitionList;
    }
    
    public ArrayList <String> getIDList() {
        return IDList;
    }
    
    // This function starts making the relation list by considering the LegislationSection, Importance and Decomposition list
    void makeRelationList() {
        String tempFather = "";
        RelationNode rNode;
                                          
        RelationList = new ArrayList <RelationNode>();
        for (int i = 0; i < LegislationSection.size(); i++) { // Creating an empty RelationList with the size of number of rows in csv file minus 1
            rNode = new RelationNode();
            rNode.setName(IntentionalElement.get(i));
            rNode.setFather("");
            RelationList.add(rNode);
        }
        
        RelationList.get(0).setName(LegislationSection.get( 0 )); // Setting first node's father in RelationList
        RelationList.get(0).setFather("");
        for (int i = 1; i < RefinedLegislationSection.size(); i++) { // Continuing with making relation list
            tempFather = RefinedLegislationSection.get(i);            
            for (int j = i + 1; j < RefinedLegislationSection.size(); j++)
                if (RefinedLegislationSection.get(j).contains(tempFather)) {
                    RelationList.get(j).setName(RefinedLegislationSection.get(j));
                    RelationList.get(j).setFather(tempFather);
                }
        }
        
        for (int i = 1; i < RelationList.size(); i++) // setting the name of father of the immediate nodes after the top-level node (that do not have any name yet) to the name of the top-level node
            if (RelationList.get(i).getFather().equals("")) {
                RelationList.get(i).setFather(RelationList.get(0).getName());
                RelationList.get(i).setName(RefinedLegislationSection.get(i));
            }
    }
    
    // To find out the common string from the beginning of list of strings
    /*public String findCommonSubString( ArrayList <String> list )
    {
        boolean notFound = false;
        String commonString = "";
        String firstString;
      
        //to create a new list of LegislationSection strings
        ArrayList <String> tempList = new ArrayList<String>( list );
      
        //first element of list has different structure, so the second element is considered
        //as the start element
        firstString = tempList.get( 1 );
      
        //for debugging propose
        //System.out.println(firstString + " & size : " + firstString.length());
      
        for ( int i = 0; i < firstString.length(); i++ )
        {
            for ( int j = 2; j < tempList.size(); j++ )
            {
                if ( firstString.charAt( i ) != tempList.get( j ).charAt( i ) )
                {
                    notFound = true;
                    break;
                }
            }
          
            if ( notFound == true )
            {
                break;
            }
            else
            {
                commonString += firstString.charAt( i );
            }
        }
      
        return commonString;
    }*/

    public void createXMLFile(String uri)
    {
        try
        {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
          
            Document doc = docBuilder.newDocument();
            
            Element rootElement = doc.createElement( "grl-catalog" );
            Element elementdefElement = doc.createElement( "element-def" );
            Element linkdefElement = doc.createElement( "link-def" );
            Element actordefElement = doc.createElement( "actor-def" );
            Element actorIElinkElement = doc.createElement( "actor-IE-link-def" );
          
            doc.appendChild( rootElement );
            Attr attr1 = doc.createAttribute( "author" );
            attr1.setValue( "Rouzbahan" );
            rootElement.setAttributeNode( attr1 );
            Attr attr2 = doc.createAttribute( "description" );
            attr2.setValue( "" );
            rootElement.setAttributeNode( attr2 );
            Attr attr3 = doc.createAttribute( "catalog-name" );
            attr3.setValue( "URNspec" );
            rootElement.setAttributeNode( attr3 );
            
            rootElement.appendChild( elementdefElement );
            rootElement.appendChild( linkdefElement );
            rootElement.appendChild( actordefElement );
            rootElement.appendChild( actorIElinkElement );
            
            Element intentionalelementElement;
            Attr idAttr, nameAttr, descriptionAttr, typeAttr, decompositiontypeAttr;
            Element metadataelement; //metadataelement2, metadataelement3, metadataelement4, metadataelement5, metadataelement6;
            Attr mdelemAttr, mdnameAttr, mdvalueAttr;
            //Attr mdelemAttr2, mdnameAttr2, mdvalueAttr2;
            //Attr mdelemAttr3, mdnameAttr3, mdvalueAttr3;
            //Attr mdelemAttr4, mdnameAttr4, mdvalueAttr4;
            //Attr mdelemAttr5, mdnameAttr5, mdvalueAttr5;
            //Attr mdelemAttr6, mdnameAttr6, mdvalueAttr6;
            //Attr mdelemAttr7, mdnameAttr7, mdvalueAttr7;
            MetadataAttribute [] mdAttributeArray;
                        
            for ( int i = 0; i < ElementDefinitionList.size(); i++ )
            {
                intentionalelementElement = doc.createElement( "intentional-element" );
                elementdefElement.appendChild( intentionalelementElement );
              
                idAttr = doc.createAttribute( "id" );
                idAttr.setValue( ElementDefinitionList.get( i ).getIntentionalElementAttribute().getID() );
                intentionalelementElement.setAttributeNode( idAttr );
                
                nameAttr = doc.createAttribute( "name" );
                nameAttr.setValue( ElementDefinitionList.get( i ).getIntentionalElementAttribute().getName() );
                intentionalelementElement.setAttributeNode( nameAttr );
                
                descriptionAttr = doc.createAttribute( "description" );
                descriptionAttr.setValue( ElementDefinitionList.get( i ).getIntentionalElementAttribute().getDescription() );
                intentionalelementElement.setAttributeNode( descriptionAttr );
                
                typeAttr = doc.createAttribute( "type" );
                typeAttr.setValue( ElementDefinitionList.get( i ).getIntentionalElementAttribute().getType() );
                intentionalelementElement.setAttributeNode( typeAttr );
                
                decompositiontypeAttr = doc.createAttribute( "decompositiontype" );
                decompositiontypeAttr.setValue( ElementDefinitionList.get( i ).getIntentionalElementAttribute().getDecompositiontype() );
                intentionalelementElement.setAttributeNode( decompositiontypeAttr );             
                
                mdAttributeArray = ElementDefinitionList.get( i ).getMetadataAttrs();
                
                for (int j = 0; j < mdAttributeArray.length; j++) {
                    metadataelement = doc.createElement( "metadata" );
                    elementdefElement.appendChild( metadataelement );
                    
                    mdelemAttr = doc.createAttribute( "elem" );
                    mdelemAttr.setValue( mdAttributeArray[ j ].getElem() );
                    metadataelement.setAttributeNode( mdelemAttr );
                    
                    mdnameAttr = doc.createAttribute( "name" );
                    mdnameAttr.setValue( mdAttributeArray[ j ].getName() );
                    metadataelement.setAttributeNode( mdnameAttr );
                    
                    mdvalueAttr = doc.createAttribute( "value" );
                    mdvalueAttr.setValue( mdAttributeArray[ j ].getvalue() );
                    metadataelement.setAttributeNode( mdvalueAttr );
                }
                
                /*// First metadata element
                metadataelement1 = doc.createElement( "metadata" );
                elementdefElement.appendChild( metadataelement1 );
                                
                mdelemAttr1 = doc.createAttribute( "elem" );
                mdelemAttr1.setValue( mdAttributeArray[ 0 ].getElem() );
                metadataelement1.setAttributeNode( mdelemAttr1 );
                
                mdnameAttr1 = doc.createAttribute( "name" );
                mdnameAttr1.setValue( mdAttributeArray[ 0 ].getName() );
                metadataelement1.setAttributeNode( mdnameAttr1 );
                
                mdvalueAttr1 = doc.createAttribute( "value" );
                mdvalueAttr1.setValue( mdAttributeArray[ 0 ].getvalue() );
                metadataelement1.setAttributeNode( mdvalueAttr1 ); 
                
                // Second metadata element
                metadataelement2 = doc.createElement( "metadata" );
                elementdefElement.appendChild( metadataelement2 );
                
                mdelemAttr2 = doc.createAttribute( "elem" );
                mdelemAttr2.setValue( mdAttributeArray[ 1 ].getElem() );
                metadataelement2.setAttributeNode( mdelemAttr2 );
                
                mdnameAttr2 = doc.createAttribute( "name" );
                mdnameAttr2.setValue( mdAttributeArray[ 1 ].getName() );
                metadataelement2.setAttributeNode( mdnameAttr2 );
                
                mdvalueAttr2 = doc.createAttribute( "value" );
                mdvalueAttr2.setValue( mdAttributeArray[ 1 ].getvalue() );
                metadataelement2.setAttributeNode( mdvalueAttr2 );
                
                // Third metadata element
                metadataelement3 = doc.createElement( "metadata" );
                elementdefElement.appendChild( metadataelement3 );
                
                mdelemAttr3 = doc.createAttribute( "elem" );
                mdelemAttr3.setValue( mdAttributeArray[ 2 ].getElem() );
                metadataelement3.setAttributeNode( mdelemAttr3 );
                
                mdnameAttr3 = doc.createAttribute( "name" );
                mdnameAttr3.setValue( mdAttributeArray[ 2 ].getName() );
                metadataelement3.setAttributeNode( mdnameAttr3 );
                
                mdvalueAttr3 = doc.createAttribute( "value" );
                mdvalueAttr3.setValue( mdAttributeArray[ 2 ].getvalue() );
                metadataelement3.setAttributeNode( mdvalueAttr3 );
                
                // Fourth metadata element
                metadataelement4 = doc.createElement( "metadata" );
                elementdefElement.appendChild( metadataelement4 );
                
                mdelemAttr4 = doc.createAttribute( "elem" );
                mdelemAttr4.setValue( mdAttributeArray[ 3 ].getElem() );
                metadataelement4.setAttributeNode( mdelemAttr4 );
                
                mdnameAttr4 = doc.createAttribute( "name" );
                mdnameAttr4.setValue( mdAttributeArray[ 3 ].getName() );
                metadataelement4.setAttributeNode( mdnameAttr4 );
                
                mdvalueAttr4 = doc.createAttribute( "value" );
                mdvalueAttr4.setValue( mdAttributeArray[ 3 ].getvalue() );
                metadataelement4.setAttributeNode( mdvalueAttr4 );
                
                // Fifth metadata element
                metadataelement5 = doc.createElement( "metadata" );
                elementdefElement.appendChild( metadataelement5 );
                
                mdelemAttr5 = doc.createAttribute( "elem" );
                mdelemAttr5.setValue( mdAttributeArray[ 4 ].getElem() );
                metadataelement5.setAttributeNode( mdelemAttr5 );
                
                mdnameAttr5 = doc.createAttribute( "name" );
                mdnameAttr5.setValue( mdAttributeArray[ 4 ].getName() );
                metadataelement5.setAttributeNode( mdnameAttr5 );
                
                mdvalueAttr5 = doc.createAttribute( "value" );
                mdvalueAttr5.setValue( mdAttributeArray[ 4 ].getvalue() );
                metadataelement5.setAttributeNode( mdvalueAttr5 );
                
                // Sixth metadata element
                metadataelement6 = doc.createElement( "metadata" );
                elementdefElement.appendChild( metadataelement6 );
                
                mdelemAttr6 = doc.createAttribute( "elem" );
                mdelemAttr6.setValue( mdAttributeArray[ 5 ].getElem() );
                metadataelement6.setAttributeNode( mdelemAttr6 );
                
                mdnameAttr6 = doc.createAttribute( "name" );
                mdnameAttr6.setValue( mdAttributeArray[ 5 ].getName() );
                metadataelement6.setAttributeNode( mdnameAttr6 );
                
                mdvalueAttr6 = doc.createAttribute( "value" );
                mdvalueAttr6.setValue( mdAttributeArray[ 5 ].getvalue() );
                metadataelement6.setAttributeNode( mdvalueAttr6 );*/
            }
            
            if (!noKpi)
            {
                for (int i = 0; i < KpiElementDefinitionList.size(); i++)
                {
                    intentionalelementElement = doc.createElement( "intentional-element" );
                    elementdefElement.appendChild( intentionalelementElement );
                    
                    idAttr = doc.createAttribute( "id" );
                    idAttr.setValue( KpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getID() );
                    intentionalelementElement.setAttributeNode( idAttr );
                    
                    nameAttr = doc.createAttribute( "name" );
                    nameAttr.setValue( KpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getName() );
                    intentionalelementElement.setAttributeNode( nameAttr );
                    
                    descriptionAttr = doc.createAttribute( "description" );
                    descriptionAttr.setValue( KpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getDescription() );
                    intentionalelementElement.setAttributeNode( descriptionAttr );
                    
                    typeAttr = doc.createAttribute( "type" );
                    typeAttr.setValue( KpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getType() );
                    intentionalelementElement.setAttributeNode( typeAttr );
                    
                    decompositiontypeAttr = doc.createAttribute( "decompositiontype" );
                    decompositiontypeAttr.setValue( KpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getDecompositiontype() );
                    intentionalelementElement.setAttributeNode( decompositiontypeAttr );             
                    
                    mdAttributeArray = KpiElementDefinitionList.get( i ).getMetadataAttrs();
                    System.out.println(mdAttributeArray.length);
                                        
                    for (int j = 0; j < mdAttributeArray.length; j++) {
                        metadataelement = doc.createElement( "metadata" );
                        elementdefElement.appendChild( metadataelement );
                        
                        mdelemAttr = doc.createAttribute( "elem" );
                        mdelemAttr.setValue( mdAttributeArray[ j ].getElem() );
                        metadataelement.setAttributeNode( mdelemAttr );
                        
                        mdnameAttr = doc.createAttribute( "name" );
                        mdnameAttr.setValue( mdAttributeArray[ j ].getName() );
                        metadataelement.setAttributeNode( mdnameAttr );
                        
                        mdvalueAttr = doc.createAttribute( "value" );
                        mdvalueAttr.setValue( mdAttributeArray[ j ].getvalue() );
                        metadataelement.setAttributeNode( mdvalueAttr );
                    }
                    System.out.println("Good to this point, number 2!!!");
                }
            }
            
            Element decompositionElement;
            Attr namedecompAttr, descriptiondecompAttr, srciddecompAttr, destiddecompAttr;
            
            for ( int i = 0; i < DecompositionLinkDefinitionList.size(); i++ )
            {
                decompositionElement = doc.createElement( "decomposition" );
                linkdefElement.appendChild( decompositionElement );
                
                namedecompAttr = doc.createAttribute( "name" );
                namedecompAttr.setValue( DecompositionLinkDefinitionList.get( i ).getName() );
                decompositionElement.setAttributeNode( namedecompAttr );
                
                descriptiondecompAttr = doc.createAttribute( "description" );
                descriptiondecompAttr.setValue( DecompositionLinkDefinitionList.get( i ).getDescription() );
                decompositionElement.setAttributeNode( descriptiondecompAttr );
                
                srciddecompAttr = doc.createAttribute( "srcid" );
                srciddecompAttr.setValue( DecompositionLinkDefinitionList.get( i ).getSrcid() );
                decompositionElement.setAttributeNode( srciddecompAttr );
                
                destiddecompAttr = doc.createAttribute( "destid" );
                destiddecompAttr.setValue( DecompositionLinkDefinitionList.get( i ).getDestid() );
                decompositionElement.setAttributeNode( destiddecompAttr );
            }
            
            Element contributionElement;
            Attr namecontrAttr, descriptioncontrAttr, srcidcontrAttr, destidcontrAttr, contributiontypeAttr, 
            quantitativeContributionAttr, correlationAttr;
            
            for ( int i = 0; i < ContributionLinkDefinitionList.size(); i++ )
            {
                contributionElement = doc.createElement( "contribution" );
                linkdefElement.appendChild( contributionElement );
                
                namecontrAttr = doc.createAttribute( "name" );
                namecontrAttr.setValue( ContributionLinkDefinitionList.get( i ).getName() );
                contributionElement.setAttributeNode( namecontrAttr );
                
                descriptioncontrAttr = doc.createAttribute( "description" );
                descriptioncontrAttr.setValue( ContributionLinkDefinitionList.get( i ).getDescription() );
                contributionElement.setAttributeNode( descriptioncontrAttr );
                
                srcidcontrAttr = doc.createAttribute( "srcid" );
                srcidcontrAttr.setValue( ContributionLinkDefinitionList.get( i ).getSrcid() );
                contributionElement.setAttributeNode( srcidcontrAttr );
                
                destidcontrAttr = doc.createAttribute( "destid" );
                destidcontrAttr.setValue( ContributionLinkDefinitionList.get( i ).getDestid() );
                contributionElement.setAttributeNode( destidcontrAttr );
                
                contributiontypeAttr = doc.createAttribute( "contributiontype" );
                contributiontypeAttr.setValue( ContributionLinkDefinitionList.get( i ).getContributionType() );
                contributionElement.setAttributeNode( contributiontypeAttr );
                
                quantitativeContributionAttr = doc.createAttribute( "quantitativeContribution" );
                quantitativeContributionAttr.setValue( ContributionLinkDefinitionList.get( i ).getQuantitativeContribution() );
                contributionElement.setAttributeNode( quantitativeContributionAttr );
                
                correlationAttr = doc.createAttribute( "correlation" );
                correlationAttr.setValue( ContributionLinkDefinitionList.get( i ).getCorrelation() );
                contributionElement.setAttributeNode( correlationAttr );
            }
            
            if (!noKpi)
            {
                for (int i = 0; i < KpiContributionLinkDefinitionList.size(); i++)
                {
                    contributionElement = doc.createElement( "contribution" );
                    linkdefElement.appendChild( contributionElement );
                    
                    namecontrAttr = doc.createAttribute( "name" );
                    namecontrAttr.setValue( KpiContributionLinkDefinitionList.get( i ).getName() );
                    contributionElement.setAttributeNode( namecontrAttr );
                    
                    descriptioncontrAttr = doc.createAttribute( "description" );
                    descriptioncontrAttr.setValue( KpiContributionLinkDefinitionList.get( i ).getDescription() );
                    contributionElement.setAttributeNode( descriptioncontrAttr );
                    
                    srcidcontrAttr = doc.createAttribute( "srcid" );
                    srcidcontrAttr.setValue( KpiContributionLinkDefinitionList.get( i ).getSrcid() );
                    contributionElement.setAttributeNode( srcidcontrAttr );
                    
                    destidcontrAttr = doc.createAttribute( "destid" );
                    destidcontrAttr.setValue( KpiContributionLinkDefinitionList.get( i ).getDestid() );
                    contributionElement.setAttributeNode( destidcontrAttr );
                    
                    contributiontypeAttr = doc.createAttribute( "contributiontype" );
                    contributiontypeAttr.setValue( KpiContributionLinkDefinitionList.get( i ).getContributionType() );
                    contributionElement.setAttributeNode( contributiontypeAttr );
                    
                    quantitativeContributionAttr = doc.createAttribute( "quantitativeContribution" );
                    quantitativeContributionAttr.setValue( KpiContributionLinkDefinitionList.get( i ).getQuantitativeContribution() );
                    contributionElement.setAttributeNode( quantitativeContributionAttr );
                    
                    correlationAttr = doc.createAttribute( "correlation" );
                    correlationAttr.setValue( KpiContributionLinkDefinitionList.get( i ).getCorrelation() );
                    contributionElement.setAttributeNode( correlationAttr );
                }
            }
            
            // Write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            
            // Name of the output file will be file.grl
            StreamResult grlResult = new StreamResult(new File(uri+"file.grl"));
            StreamResult xmlResult = new StreamResult(new File(uri+"file.xml"));
     
            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);
            // System.out.println( "\nDecomposition quantity is : " + decompositionCounter );
            // System.out.println( "\nContribution quantity is : " + contributionCounter );
     
            transformer.transform(source, grlResult);
            transformer.transform(source, xmlResult);
            
            System.out.println("File saved!");
        }      
        catch ( ParserConfigurationException e )
        {
            e.printStackTrace();
        }
        catch (TransformerException e) 
        {
            e.printStackTrace();
        }
    }
  
    public void makeElementDefinitionList() {
        ElementDefinition ed;
        IntentionalElementAttribute ieAttr;
        MetadataAttribute maAttr1, maAttr2, maAttr3, maAttr4, maAttr5, maAttr;
        MetadataAttribute [] mdarray, tempGoalMDArray = null; 
        //MetadataAttribute [] tempMDArray; 
        Random rdNumber = new Random();
        int ID, fatherIndex = -1; 
        String stringID, father;
        boolean hasStereotype = false;
        ArrayList <MetadataAttribute> tempStereotype = null;
        
        ElementDefinitionList = new ArrayList<ElementDefinition>();
        IDList = new ArrayList <String>();      
        for ( int i = 0; i < IntentionalElement.size(); i++ ) {
            ed = new ElementDefinition();
            ieAttr = new IntentionalElementAttribute();
            maAttr1 = new MetadataAttribute();
            maAttr2 = new MetadataAttribute();
            maAttr3 = new MetadataAttribute();
            maAttr4 = new MetadataAttribute();
            maAttr5 = new MetadataAttribute();
            mdarray = new MetadataAttribute[ metadataArraySize ];
               
            while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                ID = 1 + rdNumber.nextInt(1000);                   
                stringID = Integer.toString( ID );
                if ( !IDList.contains( stringID ) )
                    break;
            }
                
            IDList.add(stringID);
              
            ieAttr.setID(stringID);
            ieAttr.setName(IntentionalElement.get(i));
            ieAttr.setDescription("");
            ieAttr.setType("Goal");
            ieAttr.setDecompositionType(RefinedDecomposition.get(i));           
                         
            maAttr1.setElem(stringID);
            maAttr1.setName("AltName");
            maAttr1.setValue(AltName.get(i));
            mdarray[ 0 ] = maAttr1;
              
            maAttr2.setElem(stringID);
            maAttr2.setName("LegislationID");
            maAttr2.setValue(LegislationID.get(i));
            mdarray[ 1 ] = maAttr2;
              
            maAttr3.setElem(stringID);
            maAttr3.setName("LegislationSection");
            maAttr3.setValue(LegislationSection.get(i));
            mdarray[ 2 ] = maAttr3;
              
            maAttr4.setElem(stringID);
            maAttr4.setName("hyperlink");
            maAttr4.setValue(hyperlink.get(i));
            mdarray[ 3 ] = maAttr4;
              
            maAttr5.setElem(stringID);
            maAttr5.setName("AltDescription");
            maAttr5.setValue(AltDescription.get(i));
            mdarray[ 4 ] = maAttr5;
            
            if (goalStereotypeExists) { // if there is any stereotype defined in the csv file
                if (GoalStereoType.get(i).size() != 0) { // if there is any stereotypes defined for a goal
                    hasStereotype = true;
                    tempStereotype = new ArrayList<MetadataAttribute>(); // creating a list to keep stereotype(s) of a goal in it
                    for (int j = 1; j < GoalStereoType.get(i).size(); j++) { // adding stereotype into the list
                        maAttr = new MetadataAttribute();
                        maAttr.setElem(stringID);
                        maAttr.setName("ST_CLASSTYPE");
                        maAttr.setValue(GoalStereoType.get(i).get(j));
                        tempStereotype.add(maAttr);
                    }
                }
            }
            
            if (hasStereotype) { // if we have stereotypes in csv file and the goal has stereotype(s) defined
                for (int j = 0; j < metadataArraySize; j++) // adding other metadata attributes into temporary list of metadata attributes
                    tempStereotype.add(mdarray[ j ]);
                
                tempGoalMDArray = new MetadataAttribute[ tempStereotype.size() ]; // creating an array of size of the temporary metadata attribute list
                for (int j = 0; j < tempGoalMDArray.length; j++) // adding all the items of temporary list into newly created array
                    tempGoalMDArray[ j ] = tempStereotype.get(j);                
            }
            
            if (hasStereotype)
                ed.setMetadataAttrs(tempGoalMDArray);
            else
                ed.setMetadataAttrs(mdarray);
            
            hasStereotype = false;
            ed.setIntentionalElementAttribute(ieAttr);
            ElementDefinitionList.add(ed);           
        }
        System.out.println("The size of the ElementDefinitionList is : " + ElementDefinitionList.size());
        
        // To take care of the decompositiontype field value in the grl file and putting proper value considering Decomposition column
        for (int i = 0; i < Decomposition.size(); i++)
            if (!Decomposition.get(i).equals("")) {
                father = RelationList.get(i).getFather();                
                for (int j = 0; j < RefinedLegislationSection.size(); j++)
                    if (RefinedLegislationSection.get(j).equals(father)) {
                        fatherIndex = j;
                        break;
                    }
                    
                    ElementDefinitionList.get(fatherIndex).getIntentionalElementAttribute().setDecompositionType(Decomposition.get(i));
            }
                
        if (!noKpi) { // To make a list of KPIs for element definition tag in grl file
            KpiElementDefinitionList = new ArrayList<ElementDefinition>();
            for (int i = 0; i < NoRedundantMultipleKpi.size(); i++) {
                ed = new ElementDefinition();
                ieAttr = new IntentionalElementAttribute();
                maAttr1 = new MetadataAttribute();
                mdarray = new MetadataAttribute[ 1 ];
                
                if (!NoRedundantMultipleKpi.get(i).equals("")) {
                    while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                        ID = 1 + rdNumber.nextInt(1000);                   
                        stringID = Integer.toString( ID );
                        if ( !IDList.contains( stringID ) )
                            break;
                    }
                    
                    IDList.add(stringID);
                    
                    ieAttr.setID(stringID);
                    ieAttr.setName(NoRedundantMultipleKpi.get( i ));
                    ieAttr.setDescription("");
                    ieAttr.setType("Indicator");
                    ieAttr.setDecompositionType("And");
                    
                    if (!noAltKpi) {
                        maAttr1.setElem(stringID);
                        maAttr1.setName("AltName");
                        maAttr1.setValue(NoRedundantMultipleAltKpi.get(i));
                        mdarray[ 0 ] = maAttr1;                        
                    } else if (noAltKpi) { // if there is no French kpi, regular kpi will be replaced instead!
                        maAttr1.setElem(stringID);
                        maAttr1.setName("AltName");
                        maAttr1.setValue(NoRedundantMultipleKpi.get(i));
                        mdarray[ 0 ] = maAttr1;                        
                    }                   
                    
                    if (kpiStereotypeExists == false)
                        ed.setMetadataAttrs(mdarray);
                    else { // if we have steretotypes definition
                        int index = -1; // finding the index of the KPI in KpiSterepType if it exists
                        for (int j = 0; j < MultipleStereoType.size(); j++) {
                            //System.out.println("The searched KPI is : "+NoRedundantMultipleKpi.get(i));
                            if (MultipleStereoType.get(j).get(0).equals(NoRedundantMultipleKpi.get(i))) {
                                index = j;
                                break;
                            }
                        }
                        
                        if (index == -1) { // if we have stereotype definition, but the KPI is not defined in the list of stereotype definition
                            ed.setMetadataAttrs(mdarray);
                        }   // if we have stereotype definition, and the KPI is defined in the list of stereotype definition
                        else if (index != -1) { // if we have stereotypes and KPI stereotyope is defined in the list of stereotypes
                            // adding stereotypes into metadata of the KPI into an arraylist
                            ArrayList<MetadataAttribute> tempMDList = new ArrayList<MetadataAttribute>();
                            for (int j = 1; j < MultipleStereoType.get(index).size(); j++) {
                                MetadataAttribute MDtemp = new MetadataAttribute();
                                MDtemp.setElem(stringID);
                                MDtemp.setName("ST_CLASSTYPE");
                                MDtemp.setValue(MultipleStereoType.get(index).get(j));
                                tempMDList.add(MDtemp);
                            }                            
                            // transforming arraylist to array
                            MetadataAttribute [] tempMDArray = new MetadataAttribute[tempMDList.size() + 1];
                            tempMDArray[ 0 ] = maAttr1;
                            for (int j = 0; j < tempMDList.size(); j++)
                                tempMDArray[ j + 1 ] = tempMDList.get(j);
                            
                            ed.setMetadataAttrs(tempMDArray);
                        }
                    }
                    
                    ed.setIntentionalElementAttribute( ieAttr );                    
                    KpiElementDefinitionList.add( ed );
                }
            }
            
            System.out.println("The size of the KpiElementDefinitionList is : " + KpiElementDefinitionList.size());
        }
    }
 
    public void makeLinkDefinitionList() {
        LinkIDList = new ArrayList<String>();        
        createDecompositionList();
        createContributionList();
    }
  
    private void createDecompositionList() {
        Random rdNumber = new Random();
        int ID, fatherIndex = 0;
        String stringID, fatherName;        
        DecompoitionAttribute dcompAttr;
        
        DecompositionLinkDefinitionList = new ArrayList<DecompoitionAttribute>();
        for (int i = 0; i < Decomposition.size(); i++)
            if (!Decomposition.get(i).equals("")) { 
                while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                    ID = 1 + rdNumber.nextInt(1000);                   
                    stringID = Integer.toString(ID);                    
                    if (!LinkIDList.contains(stringID))
                      break;
                }
                
                LinkIDList.add(stringID);
                
                dcompAttr = new DecompoitionAttribute();
                dcompAttr.setName("Decomposition" + stringID);
                dcompAttr.setDescription("");               
                dcompAttr.setSrcid(ElementDefinitionList.get(i).getIntentionalElementAttribute().getID());         
                
                //Finding father's id to set as the destid
                fatherName = RelationList.get(i).getFather();                
                for (int j = 0; j < RelationList.size(); j++)
                    if (RelationList.get(j).getName().equals(fatherName)) {
                        fatherIndex = j;
                        break;
                    }                    
                
                dcompAttr.setDestid(ElementDefinitionList.get(fatherIndex).getIntentionalElementAttribute().getID());                
                DecompositionLinkDefinitionList.add(dcompAttr);
            }
    }
  
    private void createContributionList() {
        Random rdNumber = new Random();
        int ID, fatherIndex = 0, foundCounter = 0;
        String stringID, fatherName;
        ContributionAttribute contrbAttr;
        
        ContributionLinkDefinitionList = new ArrayList<ContributionAttribute>();        
        for (int i = 0; i < Importance.size(); i++) {
            if (!Importance.get(i).equals("")) {
                while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                    ID = 1 + rdNumber.nextInt(1000);                   
                    stringID = Integer.toString(ID);                   
                    if (!LinkIDList.contains(stringID))
                        break;
                }
              
                LinkIDList.add(stringID);
              
                contrbAttr = new ContributionAttribute();
                contrbAttr.setName( "Contribution" + stringID );
                contrbAttr.setDescription( "" );               
                contrbAttr.setSrcid( ElementDefinitionList.get( i ).getIntentionalElementAttribute().getID() );
              
                //Finding father's id to set as the destid
                fatherName = RelationList.get( i ).getFather();               
                for (int j = 0; j < RelationList.size(); j++)
                    if ( RelationList.get( j ).getName().equals( fatherName ) ) {
                        fatherIndex = j;
                        foundCounter++;
                        break;
                    }                  
                
                contrbAttr.setDestid( ElementDefinitionList.get( fatherIndex ).getIntentionalElementAttribute().getID() );
                
                contrbAttr.setQuantitativeContribution( ContributionValueList.get( i ).toString() );
                
                if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) < 50)
                    contrbAttr.setContributionType("Help");
                else if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) >= 50 && 
                    Integer.parseInt(contrbAttr.getQuantitativeContribution()) < 100)
                    contrbAttr.setContributionType("SomePositive");
                else if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) == 100)
                    contrbAttr.setContributionType("Make");
                               
                contrbAttr.setCorrelation("false");
              
                ContributionLinkDefinitionList.add(contrbAttr);
            }
        }
        
        System.out.println("\nfoundCounter for contribution is : " + foundCounter + "\n");
        int recentContributionValue, sumContributionValue;
        ArrayList<Integer> fathersIndexArray;
        if (!noKpi) {
            KpiContributionLinkDefinitionList = new ArrayList<ContributionAttribute>();
            for (int i = 0; i < NoRedundantMultipleKpi.size(); i++) {   
                // looking into the  list of KPIs in each row of the csv file to find the index of father(s) or the destination(s) of each KPI    
                fathersIndexArray = new ArrayList<Integer>();
                for (int j = 0; j < MultipleKpi.size(); j++)
                    if (!MultipleKpi.get(j).isEmpty())
                        if (MultipleKpi.get( j ).contains(KpiElementDefinitionList.get(i).getIntentionalElementAttribute().getName())) {
                            fathersIndexArray.add(j);                            
                        }
                
                sumContributionValue = 0;
                recentContributionValue = 0;
                // having all the father(s) indices, we create the same amount of contributions (since the number of fathers indices are the number of destinations from each KPI)
                for (int j = 0; j < fathersIndexArray.size(); j++) {  
                    recentContributionValue = 100 / fathersIndexArray.size();
                    sumContributionValue += recentContributionValue;
                    //To create a random number for the new abstract intentional element that is unique in whole xml file
                    while (true) {
                        ID = 1 + rdNumber.nextInt(1000);                   
                        stringID = Integer.toString(ID);                        
                        if (!LinkIDList.contains(stringID))
                            break;
                    }
                      
                    LinkIDList.add(stringID);
                      
                    contrbAttr = new ContributionAttribute();
                    contrbAttr.setName("Contribution" + stringID);
                    contrbAttr.setDescription("");
                    contrbAttr.setSrcid(KpiElementDefinitionList.get(i).getIntentionalElementAttribute().getID());
                  
                    // father of the element is in the same row
                    contrbAttr.setDestid(ElementDefinitionList.get(fathersIndexArray.get(j)).getIntentionalElementAttribute().getID());
                      
                    if (j < (fathersIndexArray.size() - 1))
                        contrbAttr.setQuantitativeContribution(Integer.toString(recentContributionValue));
                    else if (j == (fathersIndexArray.size() - 1)) // for the last destination of contribution of a Kpi
                        contrbAttr.setQuantitativeContribution(Integer.toString(recentContributionValue + (100 - sumContributionValue)));
                    
                    if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) < 50)
                        contrbAttr.setContributionType("Help");
                    else if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) >= 50 && 
                        Integer.parseInt(contrbAttr.getQuantitativeContribution()) < 100)
                        contrbAttr.setContributionType("SomePositive");
                    else if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) == 100)
                        contrbAttr.setContributionType("Make");                    
                                                       
                    contrbAttr.setCorrelation("false");
                      
                    KpiContributionLinkDefinitionList.add(contrbAttr);
                }   
            }            
        }// end of noKpi's if
    }
    
    public void calculateContributionValueList() {
        String father;
        ArrayList <Integer> siblingsList;
        int weightSum = 0, contributionSum = 0, contributionValue = 0;
        //boolean zeroFound = false;
        
        ContributionValueList = new ArrayList<Integer>();
        //Initializing ContributionValueList to 0 for all the elements
        for ( int i = 0; i < Importance.size(); i++ )
            ContributionValueList.add( 0 );
        System.out.println("size of ContributionValueList is : "+ContributionValueList.size());
        
        // now, we are calculating!!!
        for (int i = 1; i < Importance.size(); i++) {
            if (!Importance.get(i).equals("") && ContributionValueList.get(i) == 0) {
                contributionSum = 0; 
                contributionValue = 0;
                weightSum = 0;
                father = RelationList.get(i).getFather();
                siblingsList = new ArrayList<Integer>();
                siblingsList.add(i);
                weightSum = Integer.parseInt(Importance.get( i ));
                for (int j = i + 1; j < Importance.size(); j++) // Finding other siblings if there is any
                    if (RelationList.get(j).getFather().equals(father)) // Checking to find rows with same father
                        if (!Importance.get(j).equals("")) { // Check for being a contribution
                            siblingsList.add(j); // keeping its index
                            weightSum = weightSum + Integer.parseInt( Importance.get( j ) ); // adding its weight
                        }
                                
                for (int k = 0; k < siblingsList.size(); k++) {
                    contributionValue = ( Integer.parseInt( Importance.get(siblingsList.get(k)) ) * 100 ) / weightSum;
                    contributionSum = contributionSum + contributionValue;                    
                    if (k < (siblingsList.size() - 1))
                        ContributionValueList.set(siblingsList.get(k), contributionValue); 
                                            
                    if (k == (siblingsList.size() - 1)) {
                        if (contributionSum != 100)
                            ContributionValueList.set(siblingsList.get(k), contributionValue + (100 - contributionSum));
                        else
                            ContributionValueList.set(siblingsList.get(k), contributionValue);
                    }                    
                }
            }
        }                
    }
    
    private void makeMultipleKpi() {
        int beginIndex;
        String row;
        MultipleKpi = new ArrayList<ArrayList<String>>();           
        for (int i = 0; i < Kpi.size(); i++ ) {
            beginIndex = 0;
            row = Kpi.get( i );
            MultipleKpi.add(new ArrayList<String>());             
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) != ';')
                    continue;
                else {
                    MultipleKpi.get(i).add(row.substring(beginIndex, j));
                    beginIndex = ++j;
                }
            }
        }
        System.out.println( "\nSimple MultipleKpi size is : " + MultipleKpi.size() );        
    }
    
    private void refineNoRedundantMultipleKpi() {
        ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < MultipleKpi.size(); i++) {
            temp.add(new ArrayList<String>());
            for (int j = 0; j < MultipleKpi.get(i).size(); j++) {
                if (IntentionalElement.contains(MultipleKpi.get(i).get(j))) // if a Kpi has the same name of one of IntentionalElement list, 
                    temp.get(i).add(MultipleKpi.get(i).get(j) + " - " + RefinedLegislationSection.get(i));
                else
                    temp.get(i).add(MultipleKpi.get(i).get(j));
            }
        }
        
        MultipleKpi =  new ArrayList<ArrayList<String>>(temp);
    }
    
    private void makeNoRedundantMultipleKpi() {
        NoRedundantMultipleKpi = new ArrayList<String>();
        RedundantMultipleKpi = new ArrayList<String>();         
        for (int i = 0; i < MultipleKpi.size(); i++)
            for (int j = 0; j < MultipleKpi.get(i).size(); j++) {
                if (!NoRedundantMultipleKpi.contains(MultipleKpi.get(i).get(j)))
                    NoRedundantMultipleKpi.add(MultipleKpi.get(i).get(j));                    
                else
                    RedundantMultipleKpi.add(MultipleKpi.get(i).get(j));                    
            }
        
        System.out.println( "\nSimple NoRedundantMultipleKpi size is : " + NoRedundantMultipleKpi.size() );
        System.out.println( "\nSimple RedundantMultipleKpi size is : " + RedundantMultipleKpi.size() );                
    }   
    
    private void makeMultipleAltKpi() {
        int beginIndex;
        String row;
        MultipleAltKpi = new ArrayList<ArrayList<String>>();         
        for (int i = 0; i < Kpi.size(); i++ ) {
            beginIndex = 0;
            row = AltKpi.get( i );
            MultipleAltKpi.add(new ArrayList<String>());             
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) != ';')
                    continue;
                else {
                    MultipleAltKpi.get(i).add(row.substring(beginIndex, j));
                    beginIndex = ++j;
                }
            }
        }
               
        System.out.println( "\nSimple MultipleAltKpi size is : " + MultipleAltKpi.size() );       
    }
    
    private void refineNoRedundantMultipleAltKpi() {
        ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < MultipleAltKpi.size(); i++) {
            temp.add(new ArrayList<String>());
            for (int j = 0; j < MultipleAltKpi.get(i).size(); j++) {
                if (IntentionalElement.contains(MultipleAltKpi.get(i).get(j))) // if a Kpi has the same name of one of IntentionalElement list, 
                    temp.get(i).add(MultipleAltKpi.get(i).get(j) + " - " + RefinedLegislationSection.get(i));
                else
                    temp.get(i).add(MultipleAltKpi.get(i).get(j));
            }
        }
        
        MultipleAltKpi =  new ArrayList<ArrayList<String>>(temp);
    }
    
    private void makeNoRedundantMultipleAltKpi() {
        NoRedundantMultipleAltKpi = new ArrayList<String>();
        RedundantMultipleAltKpi = new ArrayList<String>();         
        for (int i = 0; i < MultipleAltKpi.size(); i++) 
            for (int j = 0; j < MultipleAltKpi.get(i).size(); j++) {
                if (!NoRedundantMultipleAltKpi.contains(MultipleAltKpi.get(i).get(j)))
                    NoRedundantMultipleAltKpi.add(MultipleAltKpi.get(i).get(j));                    
                else
                    RedundantMultipleAltKpi.add(MultipleAltKpi.get(i).get(j));                    
            }
        
        System.out.println( "\nSimple NoRedundantMultipleAltKpi size is : " + NoRedundantMultipleAltKpi.size() );
        System.out.println( "\nSimple RedundantMultipleAltKpi size is : " + RedundantMultipleAltKpi.size() );
    }
    
    private void findRedundantIntentionalelement() { // finding goals that are redundant and keeping them in a list
        RedundantIntentionalElement = new ArrayList<String>();
        for (int i = 0; i < IntentionalElement.size(); i++)
            for (int j = i + 1; j < IntentionalElement.size(); j++ )
                if (IntentionalElement.get(i).equals(IntentionalElement.get(j))) {
                    RedundantIntentionalElement.add(IntentionalElement.get(i));
                    break;
                }
    }
    
    private void refineIntenionalElement() { // adding legislationSection to the goals that are redundant to avoid confusion for tool
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < IntentionalElement.size(); i++) {
            if (RedundantIntentionalElement.contains(IntentionalElement.get(i)))
                temp.add(IntentionalElement.get(i) + " - " + RefinedLegislationSection.get(i));
            else
                temp.add(IntentionalElement.get(i));
        }
        
        IntentionalElement = new ArrayList<String>(temp);
                //IntentionalElement.set(i, IntentionalElement.get(i) + " - " + RefinedLegislationSection.get(i));
    }
    
    private void refineAltName() { // adding legislationSection to the alternative name of goals that are redundant to avoid confusion for tool
        ArrayList<String> redundantAltName = new ArrayList<String>(); // finding redundant AltName
        for (int i = 0; i < AltName.size(); i++)
          for (int j = i + 1; j < AltName.size(); j++ )
              if (AltName.get(i).equals(AltName.get(j))) {
                  redundantAltName.add(AltName.get(i));
                  break;
              }
        
        ArrayList<String> temp = new ArrayList<String>(); // refining AltName considering the redundancy list
        for (int i = 0; i < AltName.size(); i++) {
            if (redundantAltName.contains(AltName.get(i)))
                temp.add(AltName.get(i) + " - " + RefinedLegislationSection.get(i));
            else
                temp.add(AltName.get(i));
        }
        
        AltName = new ArrayList<String>(temp);
    }
    
    private void makeImportanceRange() {
        int beginIndex;
        String row;
        
        ImportanceRow = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < Importance.size(); i++ ) {
            if (!Importance.get( i ).equals("")) {
                beginIndex = 0;
                row = Importance.get( i );
                ImportanceRow.add(new ArrayList<String>());             
                for (int j = 0; j < row.length(); j++) {
                    if (row.charAt(j) != ';')
                        continue;
                    else {
                        ImportanceRow.get(i).add(row.substring(beginIndex, j));
                        beginIndex = ++j;
                    }
                }
            }
            else if (Importance.get( i ).equals("")) {
                ImportanceRow.add(new ArrayList<String>());
                ImportanceRow.get(i).add("");
            }                
        }
        
        Importance.clear();
        for (int i = 0; i < ImportanceRow.size(); i++)
            Importance.add(ImportanceRow.get(i).get(0));
        
        ImportanceRange = new ArrayList<String>();
        for (int i = 0; i < ImportanceRow.size(); i++)
            if (ImportanceRow.get(i).size() > 1)
                ImportanceRange.add(ImportanceRow.get(i).get(1));
            else    
                ImportanceRange.add("");
    }
    
    private void makeGoalStereoType() {
        GoalStereoType = new ArrayList<ArrayList<String>>();
        int beginIndex;
        String row;
        MultipleStereoType = new ArrayList<ArrayList<String>>();           
        for (int i = 0; i < Stereotype.size(); i++ ) { // separating stereotypes of a goal, if a goal has multiple stereotypes
            beginIndex = 0;
            row = Stereotype.get( i );
            GoalStereoType.add(new ArrayList<String>());
            if (row.length() != 0) // adding name of the goal to the beginning of each row of GoalStereoType list, if there exists any stereotype
                GoalStereoType.get(i).add(IntentionalElement.get(i));
                           
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) != ';')
                    continue;
                else {
                    GoalStereoType.get(i).add(row.substring(beginIndex, j));
                    beginIndex = ++j;
                }
            }
        }
        
    }
    
    /*private void makeMultipleStereoType() { // reading all the stereotypes into MultipleStereotype, which is list of sublists
        MultipleStereoType = new ArrayList<ArrayList<String>>();
        int beginIndex;
        String row;
        MultipleStereoType = new ArrayList<ArrayList<String>>();           
        for (int i = 0; i < Stereotype.size(); i++ ) {
            beginIndex = 0;
            row = Stereotype.get( i );
            MultipleStereoType.add(new ArrayList<String>());             
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) != ';')
                    continue;
                else {
                    MultipleStereoType.get(i).add(row.substring(beginIndex, j));
                    beginIndex = ++j;
                }
            }
        }
    }*/
    
    /*private void makeKpiStereotype() { // making a list of sublist that each has name of KPI as the first element and all its stereotypes as the other elements of sublist  
        KpiStereoType = new ArrayList<ArrayList<String>>(); // Initializing KpiStereotype
        for (int i = 0; i < NoRedundantMultipleKpi.size(); i++) { // Adding Name of KPIs to KpiStereoType as the first node of the list 
            KpiStereoType.add(new ArrayList<String>()); // The stereotypes, if they exist, will be added in a list of string that is started with relevant KPI name
            KpiStereoType.get(i).add(NoRedundantMultipleKpi.get(i));
        }
        
        // finding and saving all the stereotypes belonged to a KPI into a list along with its KPI as the first element of each sublist
        for (int i = 0; i < MultipleKpi.size(); i++) {
            for (int j = 0; j < MultipleKpi.get(i).size(); j++) // if there is any kpi in MultipleKpi in each row of sheet, we will enter the loop
                for (int k = 0; k < KpiStereoType.size(); k++) // finding the index of each kpi, in MultipleKpi list, in the KpiStereoType list
                    if (KpiStereoType.get(k).get(0).equals(MultipleKpi.get(i).get(j))){
                        if (!MultipleStereoType.get(i).get(j).equals(" ")) // if it is not a blank space, it can be added
                            KpiStereoType.get(k).add(MultipleStereoType.get(i).get(j)); // saving a stereotype that belongs to a KPI, which is located as a first element of the list
                        
                        break;
                    }
        }
    }*/
      
    @Override
    public String toString() {
        String str = null;      
        for ( int i = 0; i < numberofIntentionalElement; i++ ) {
            str = str + "LegislationID : " + LegislationID.get( i ) + "\n";
            str = str + "LegislationSection : " + LegislationSection.get( i ) + "\n";
            str = str + "Name : " + IntentionalElement.get( i ) + "\n";
            str =  str + "AltName : " + AltName.get( i ) + "\n";
            str =  str + "hyperlink : " + hyperlink.get( i ) + "\n";
            str =  str + "AltDescription : " + AltDescription.get( i ) + "\n";
            str =  str + "Importance : " + Importance.get( i ) + "\n";
            str =  str + "Decomposition : " + Decomposition.get( i ) + "\n";
            str =  str + "ElementDefinitionList : " + ElementDefinitionList.get( i ) + "\n";
            str =  str + "RelationList : " + RelationList.get( i ) + "\n";
            str =  str + "DecompositionLinkDefinitionList : " + DecompositionLinkDefinitionList.get( i ) + "\n";
            str =  str + "ContributionLinkDefinitionList : " + ContributionLinkDefinitionList.get( i ) + "\n";
            str += "---------------------------------------------------------------" +
                 "---------------------------------------------------------------\n";
        } 
      
        return str; 
    }
}
