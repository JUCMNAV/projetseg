
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
    private ArrayList <String> KpiWeight;
    private ArrayList <ArrayList<String>> MultipleKpiWeight;
    private ArrayList <ArrayList<String>> ConditionList;
    private ArrayList <ElementDefinition> ConditionElementDefinitionList;
    private ArrayList <DecompoitionAttribute> ConditionDependencyLinkDefinitionList;
    private ArrayList <String> AltKpi;
    private ArrayList <ArrayList <String>> MultipleAltKpi;
    private ArrayList <String> NoRedundantMultipleAltKpi;
    private ArrayList <String> RedundantMultipleAltKpi;
    private ArrayList <ArrayList<String>> GoalKpiWeight;
    private ArrayList <ArrayList<Integer>> KpiContributionValueList;
    private ArrayList <String> Stereotype;
    private ArrayList <ArrayList<String>> GoalStereoType;
    private ArrayList <ArrayList<String>> MultipleStereoType;
    private ArrayList <ArrayList<String>> KpiSubQuestion;
    private ArrayList <String> KpiSubQuestionList;
    private ArrayList <ArrayList<String>> KpiSubQuestionAlt;
    private ArrayList <String> KpiSubQuestionAltList;
    private ArrayList <ElementDefinition> KpiSubQuestionElementDefinitionList;
    private ArrayList <DecompoitionAttribute> KpiSubQuestionLinkDefinitionList;
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
    private ArrayList <Integer> IntentionalElementLevel;
    private ArrayList <ArrayList <String>> DeamonKpiList;
    private ArrayList <ElementDefinition> DeamonKpiElementDefinitionList;
    private ArrayList <ContributionAttribute> DeamonKpiContributionLinkDefinition;
    private ArrayList <ArrayList<String>> KpiConversionList;
  
    private boolean noKpi = true, noAltKpi = true, kpiStereotypeExists = false, goalStereotypeExists = false, 
        noImportanceRange = true;
    private int numberofIntentionalElement, endOfGoalsIndex, endOfKpiStereotypesIndex;
    private final static int metadataArraySize = 6;
    private static int columnSize;
    private static int currentColumn = 0;
  
    public void setLegislationID( List <String[]> list ) {
        String [] row;
        columnSize = list.get(0).length;
        currentColumn = 0;
        System.out.println("The number of column is : " + columnSize);
        for (int i = 0; i < list.size(); i++) // finding the last row of goals on csv file
            if (list.get(i) [0].equals("KPI_STEREOTYPES")) {
                endOfGoalsIndex = i;
                break;
            } else
                endOfGoalsIndex = list.size();
        
        for (int i = 0; i < list.size(); i++) // finding the last row of KPI_STEREOTYPES on csv file
          if (list.get(i) [0].equals("DEAMON_KPI")) {
              System.out.println("Can see DEAMON_KPI in beginning!!!");
              endOfKpiStereotypesIndex = i;
              break;
          } else
              endOfKpiStereotypesIndex = list.size();
                
        System.out.println("The number of rows of goals is : " + endOfGoalsIndex);
        System.out.println("The number of rows of goals + KPI_STEREOTYPES is : " + endOfKpiStereotypesIndex);
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
            
                        
        } else {
            for ( int i = 0; i < endOfGoalsIndex; i++ )
                Kpi.add("");          
            
        }
    
        currentColumn++;
        Kpi.remove( 0 );
        System.out.println( "\nSimple Kpi size is : " + Kpi.size() );
        makeMultipleKpi(); // taking care of KPIs by creating list of list of string. 
        refineNoRedundantMultipleKpi(); // removing redundancy by refining the name of redundant element.
        makeNoRedundantMultipleKpi(); // separating the redundancy into new list.
        if (noKpi == false) {
            setKpiWeight(list); // taking care of the KPIs weights
            makeDeamonKpiList(list); // taking care of Deamon Kpi and making a list of them
        }
        
    } 
  
    public ArrayList <String> getKpi() {
        return Kpi;
    }
    
    private void setKpiWeight( List <String[]> list ) {
        String [] row;
        KpiWeight = new ArrayList<String>();
        if (!noKpi) {
            if (currentColumn < columnSize) {
                for ( int i = 0; i < endOfGoalsIndex; i++ ) {
                    row = list.get( i );
                    KpiWeight.add( row[ currentColumn ] );
                }                
                
                
            } else {
                for ( int i = 0; i < endOfGoalsIndex; i++ )
                    KpiWeight.add("");                
                
            }
            
            currentColumn++;
            KpiWeight.remove( 0 );
            System.out.println( "\nSimple KpiWeight size is : " + KpiWeight.size() );
            if (noKpi == false) {
                makeConditionList();
                makeMultipleKpiWeight(); // finding regulations and their relative KPIs and putting them into a list of lists
                makeKpiContributionValueList(); // calculating integer values of the KPIs contributions
            }
            
        }
    }
    
    private void makeDeamonKpiList( List <String[]> list ) {
        DeamonKpiList = new ArrayList<ArrayList<String>>();
        int currentIndex = 0;
        System.out.println(endOfKpiStereotypesIndex + " " + list.size());
        for (int i = endOfKpiStereotypesIndex + 1; i < list.size(); i++, currentIndex++) {
            DeamonKpiList.add(new ArrayList<String>());
            for (int j = 0; j < list.get(i).length; j++) {
                if ( !(list.get(i) [j]).equals("") )
                    DeamonKpiList.get(currentIndex).add(list.get(i) [ j ]);
                else
                    break;
            }
        }
        
        System.out.println("The size of DeamonKpiList is : " + DeamonKpiList.size());
        //for (int i = 0; i < DeamonKpiList.size(); i++)
            //for (int j = 0; j < DeamonKpiList.get(i).size(); j++)
                //System.out.println("DeamonKpiList[ " + i + " , " + j + " ] is : " + DeamonKpiList.get(i).get(j));
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
                
                
            } else {
                for ( int i = 0; i < endOfGoalsIndex; i++ )
                    AltKpi.add("");                
                
            }
        } else {
            for ( int i = 0; i < endOfGoalsIndex; i++ )
                AltKpi.add("");            
            
        }    
    
        currentColumn++;
        AltKpi.remove( 0 );
        if (noKpi == false && noAltKpi == false) {
            makeMultipleAltKpi();
            refineNoRedundantMultipleAltKpi();
            makeNoRedundantMultipleAltKpi();
        }
        
        System.out.println( "\nSimple AltKpi size is : " + AltKpi.size() );        
        
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
            if (row[0].equals("KPI_STEREOTYPES")) {
                System.out.println("Can see KPI_STEREOTYPES!!!");
                String s = list.get(i + 1) [ 0 ];
                System.out.println("s is : " + s);
                if (!s.equals("DEAMON_KPI")) {
                    System.out.println("Can see DEAMON_KPI!!!");
                    index = i + 1;
                    kpiStereotypeExists = true;
                    break;
                }
            }
        }
        
        if (kpiStereotypeExists)
            System.out.println("Exists, GOOD!!!");
        
        int counter = 0;
        MultipleStereoType = new ArrayList<ArrayList<String>>(); // in case of kpiStereotypExists is false, we avoid receiving null pointer
        if (kpiStereotypeExists) {
            MultipleStereoType = new ArrayList<ArrayList<String>>();
            for (int i = index; i < endOfKpiStereotypesIndex; i++) // list.size() is replaced
                MultipleStereoType.add(new ArrayList<String>());
                
            for (int i = index; i < endOfKpiStereotypesIndex; i++) { // list.size() is replaced
                row = list.get( i );
                for (int j = 0; j < row.length; j++)
                    if (!row[j].equals(""))
                        MultipleStereoType.get(counter).add(row[j]);                    
               
                counter++;
            }
        }
        
        System.out.println("GOOD!!!");
        //makeMultipleStereoType(); // taking care of KPIs' stereotypes 
        //makeKpiStereotype(); // taking care of KPIs' stereotypes
        System.out.println("The size of KPIs Stereotype is : " + MultipleStereoType.size());
        System.out.println("KPIs stereotypes are taken care of!!!");
        System.out.println("GOOD!!!");
        makeKpiSubQuestion(); // separating Kpi's stereotypes from sub-questions into two different lists
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
    
    public ArrayList<ArrayList<String>> getKpiConversionList() {
        return KpiConversionList;
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
        
        for (int i = 0; i < RelationList.size(); i++) {
            System.out.println("The name of " + i + " is : " + RelationList.get(i).getName());
            System.out.println("The name of father of " + i + " is : " + RelationList.get(i).getFather());
        }
        
        makeIntentionalElmenetLevel(); // making levels of intentional elements        
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
            Element intentionalelementrefdefElement = doc.createElement( "intentional-element-ref-def" );
            Element intentionalelementreflinkdefElement = doc.createElement( "intentional-element-ref-link-def" );
          
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
            rootElement.appendChild(intentionalelementrefdefElement);
            rootElement.appendChild(intentionalelementreflinkdefElement);
            
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
                }
                
                // Deamon KPIs used to be here
                
                for (int i = 0; i < ConditionElementDefinitionList.size(); i++) {
                    intentionalelementElement = doc.createElement( "intentional-element" );
                    elementdefElement.appendChild( intentionalelementElement );
                    
                    idAttr = doc.createAttribute( "id" );
                    idAttr.setValue( ConditionElementDefinitionList.get( i ).getIntentionalElementAttribute().getID() );
                    intentionalelementElement.setAttributeNode( idAttr );
                    
                    nameAttr = doc.createAttribute( "name" );
                    nameAttr.setValue( ConditionElementDefinitionList.get( i ).getIntentionalElementAttribute().getName() );
                    intentionalelementElement.setAttributeNode( nameAttr );
                    
                    descriptionAttr = doc.createAttribute( "description" );
                    descriptionAttr.setValue( ConditionElementDefinitionList.get( i ).getIntentionalElementAttribute().getDescription() );
                    intentionalelementElement.setAttributeNode( descriptionAttr );
                    
                    typeAttr = doc.createAttribute( "type" );
                    typeAttr.setValue( ConditionElementDefinitionList.get( i ).getIntentionalElementAttribute().getType() );
                    intentionalelementElement.setAttributeNode( typeAttr );
                    
                    decompositiontypeAttr = doc.createAttribute( "decompositiontype" );
                    decompositiontypeAttr.setValue( ConditionElementDefinitionList.get( i ).getIntentionalElementAttribute().getDecompositiontype() );
                    intentionalelementElement.setAttributeNode( decompositiontypeAttr );
                    
                    mdAttributeArray = ConditionElementDefinitionList.get( i ).getMetadataAttrs();
                    
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
            
            Element contributionElement, mdelement;
            Attr namecontrAttr, descriptioncontrAttr, srcidcontrAttr, destidcontrAttr, contributiontypeAttr, 
            quantitativeContributionAttr, correlationAttr, mdAttr;
            
            for ( int i = 0; i < ContributionLinkDefinitionList.size(); i++ )
            {
                contributionElement = doc.createElement( "contribution" );
                linkdefElement.appendChild( contributionElement );
                
                //namecontrAttr = doc.createAttribute( "id" );
                //namecontrAttr.setValue( ContributionLinkDefinitionList.get( i ).getID() );
                //contributionElement.setAttributeNode( namecontrAttr );
                
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
                
                if (!noImportanceRange) {
                    mdelement = doc.createElement( "metadata" );
                    linkdefElement.appendChild( mdelement );
                    
                    mdAttr = doc.createAttribute( "elem" );
                    mdAttr.setValue( ContributionLinkDefinitionList.get(i).getMDAttr().getElem() );
                    mdelement.setAttributeNode( mdAttr );
                    
                    mdAttr = doc.createAttribute( "name" );
                    mdAttr.setValue( ContributionLinkDefinitionList.get(i).getMDAttr().getName() );
                    mdelement.setAttributeNode( mdAttr );
                    
                    mdAttr = doc.createAttribute( "value" );
                    mdAttr.setValue( ContributionLinkDefinitionList.get(i).getMDAttr().getvalue() );
                    mdelement.setAttributeNode( mdAttr );
                }
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
                
                for ( int i = 0; i < ConditionDependencyLinkDefinitionList.size(); i++ ) {
                    decompositionElement = doc.createElement( "dependency" );
                    linkdefElement.appendChild( decompositionElement );
                    
                    namedecompAttr = doc.createAttribute( "name" );
                    namedecompAttr.setValue( ConditionDependencyLinkDefinitionList.get( i ).getName() );
                    decompositionElement.setAttributeNode( namedecompAttr );
                    
                    descriptiondecompAttr = doc.createAttribute( "description" );
                    descriptiondecompAttr.setValue( ConditionDependencyLinkDefinitionList.get( i ).getDescription() );
                    decompositionElement.setAttributeNode( descriptiondecompAttr );
                    
                    srciddecompAttr = doc.createAttribute( "dependerid" );
                    srciddecompAttr.setValue( ConditionDependencyLinkDefinitionList.get( i ).getSrcid() );
                    decompositionElement.setAttributeNode( srciddecompAttr );
                    
                    destiddecompAttr = doc.createAttribute( "dependeeid" );
                    destiddecompAttr.setValue( ConditionDependencyLinkDefinitionList.get( i ).getDestid() );
                    decompositionElement.setAttributeNode( destiddecompAttr );
                }
                
                // Adding deamon KPIs at this point, since we need to first all the links and then add the deamons to remove proper links!!!
                /*Element intentionalelementrefElement;
                for (int i = 0; i < DeamonKpiElementDefinitionList.size(); i++) {
                    intentionalelementrefElement = doc.createElement( "intentional-element-ref" );
                    intentionalelementrefdefElement.appendChild( intentionalelementrefElement );
                    
                    idAttr = doc.createAttribute( "id" );
                    idAttr.setValue( DeamonKpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getID() );
                    intentionalelementrefElement.setAttributeNode( idAttr );
                    
                    nameAttr = doc.createAttribute( "name" );
                    nameAttr.setValue( DeamonKpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getName() );
                    intentionalelementrefElement.setAttributeNode( nameAttr );
                    
                    descriptionAttr = doc.createAttribute( "description" );
                    descriptionAttr.setValue( DeamonKpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getDescription() );
                    intentionalelementrefElement.setAttributeNode( descriptionAttr );
                    
                    typeAttr = doc.createAttribute( "type" );
                    typeAttr.setValue( DeamonKpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getType() );
                    intentionalelementrefElement.setAttributeNode( typeAttr );
                    
                    decompositiontypeAttr = doc.createAttribute( "decompositiontype" );
                    decompositiontypeAttr.setValue( DeamonKpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getDecompositiontype() );
                    intentionalelementrefElement.setAttributeNode( decompositiontypeAttr );
                    
                    definitionidAttr = doc.createAttribute( "definitionid" );
                    definitionidAttr.setValue( DeamonKpiElementDefinitionList.get( i ).getIntentionalElementAttribute().getDefinitionID() );
                    intentionalelementrefElement.setAttributeNode( definitionidAttr );
                                        
                    mdAttributeArray = DeamonKpiElementDefinitionList.get( i ).getMetadataAttrs();
                    
                    for (int j = 0; j < mdAttributeArray.length; j++) {
                        metadataelement = doc.createElement( "metadata" );
                        intentionalelementrefdefElement.appendChild( metadataelement );
                        
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
                }*/
                
                for (int i = 0; i < DeamonKpiContributionLinkDefinition.size(); i++)
                {
                    contributionElement = doc.createElement( "contribution" );
                    intentionalelementreflinkdefElement.appendChild( contributionElement );
                    
                    namecontrAttr = doc.createAttribute( "name" );
                    namecontrAttr.setValue( DeamonKpiContributionLinkDefinition.get( i ).getName() );
                    contributionElement.setAttributeNode( namecontrAttr );
                    
                    descriptioncontrAttr = doc.createAttribute( "description" );
                    descriptioncontrAttr.setValue( DeamonKpiContributionLinkDefinition.get( i ).getDescription() );
                    contributionElement.setAttributeNode( descriptioncontrAttr );
                    
                    srcidcontrAttr = doc.createAttribute( "srcid" );
                    srcidcontrAttr.setValue( DeamonKpiContributionLinkDefinition.get( i ).getSrcid() );
                    contributionElement.setAttributeNode( srcidcontrAttr );
                    
                    destidcontrAttr = doc.createAttribute( "destid" );
                    destidcontrAttr.setValue( DeamonKpiContributionLinkDefinition.get( i ).getDestid() );
                    contributionElement.setAttributeNode( destidcontrAttr );
                    
                    contributiontypeAttr = doc.createAttribute( "contributiontype" );
                    contributiontypeAttr.setValue( DeamonKpiContributionLinkDefinition.get( i ).getContributionType() );
                    contributionElement.setAttributeNode( contributiontypeAttr );
                    
                    quantitativeContributionAttr = doc.createAttribute( "quantitativeContribution" );
                    quantitativeContributionAttr.setValue( DeamonKpiContributionLinkDefinition.get( i ).getQuantitativeContribution() );
                    contributionElement.setAttributeNode( quantitativeContributionAttr );
                    
                    correlationAttr = doc.createAttribute( "correlation" );
                    correlationAttr.setValue( DeamonKpiContributionLinkDefinition.get( i ).getCorrelation() );
                    contributionElement.setAttributeNode( correlationAttr );
                    
                    metadataelement = doc.createElement( "metadata" );
                    intentionalelementreflinkdefElement.appendChild( metadataelement );
                        
                    mdelemAttr = doc.createAttribute( "elem" );
                    mdelemAttr.setValue( DeamonKpiContributionLinkDefinition.get(i).getMDAttr().getElem() );
                    metadataelement.setAttributeNode( mdelemAttr );
                       
                    mdnameAttr = doc.createAttribute( "name" );
                    mdnameAttr.setValue( DeamonKpiContributionLinkDefinition.get(i).getMDAttr().getName() );
                    metadataelement.setAttributeNode( mdnameAttr );
                        
                    mdvalueAttr = doc.createAttribute( "value" );
                    mdvalueAttr.setValue( DeamonKpiContributionLinkDefinition.get(i).getMDAttr().getvalue() );
                    metadataelement.setAttributeNode( mdvalueAttr );                   
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
        MetadataAttribute maAttr1, maAttr2, maAttr3, maAttr4, maAttr5, maAttr6, maAttr;
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
            maAttr6 = new MetadataAttribute();
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
            
            maAttr6.setElem(stringID);
            maAttr6.setName("Level");
            maAttr6.setValue(String.valueOf(IntentionalElementLevel.get(i)));
            mdarray[ 5 ] = maAttr6;
            
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
                maAttr2 = new MetadataAttribute();
                mdarray = new MetadataAttribute[ 2 ];
                    
                if (!NoRedundantMultipleKpi.get(i).equals("")) {
                    while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                        ID = 1 + rdNumber.nextInt(1000);                   
                        stringID = Integer.toString( ID );
                        if ( !IDList.contains( stringID ) )
                            break;
                    }
                        
                    IDList.add(stringID);
                    
                    ieAttr.setID(stringID);
                    //if (KpiDuplication == 0) // "Duplication-" will be added only to one set of copy of KPIs
                    ieAttr.setName(NoRedundantMultipleKpi.get( i ));
                    //else if (KpiDuplication == 1) // "Duplication-" will be added only to one set of copy of KPIs
                    //ieAttr.setName("Duplication-" + NoRedundantMultipleKpi.get( i ));
                    ieAttr.setDescription("");
                    ieAttr.setType("Indicator");
                    ieAttr.setDecompositionType("And");
                        
                    if (!noAltKpi) {
                        maAttr1.setElem(stringID);
                        maAttr1.setName("AltName");
                        //if (KpiDuplication == 0) // "Duplication-" will be added only to one set of copy of KPIs
                        maAttr1.setValue(NoRedundantMultipleAltKpi.get( i ));
                        //else if (KpiDuplication == 1) // "Duplication-" will be added only to one set of copy of KPIs
                        //ieAttr.setName("Duplication-" + NoRedundantMultipleKpi.get( i ));
                        mdarray[ 0 ] = maAttr1;                        
                    } else if (noAltKpi) { // if there is no French kpi, regular kpi will be replaced instead!
                        maAttr1.setElem(stringID);
                        maAttr1.setName("AltName");
                        //if (KpiDuplication == 0) // "Duplication-" will be added only to one set of copy of KPIs
                        maAttr1.setValue(NoRedundantMultipleKpi.get( i ));
                        //else if (KpiDuplication == 1) // "Duplication-" will be added only to one set of copy of KPIs
                        //ieAttr.setName("Duplication-" + NoRedundantMultipleKpi.get( i ));
                        mdarray[ 0 ] = maAttr1;                        
                    }
                        
                    //System.out.println("before adding levels!!!");
                    
                    int xIndex = 0; // finding index of relevant goal
                    for (int x = 0; x < MultipleKpi.size(); x++)
                        if (MultipleKpi.get(x).contains(NoRedundantMultipleKpi.get(i)))
                            xIndex = x;
                    //  adding level into metadata of KPIs
                    maAttr2.setElem(stringID);
                    maAttr2.setName("Level");
                    //System.out.println("The value of level is : " + xIndex);
                    maAttr2.setValue(String.valueOf(IntentionalElementLevel.get(xIndex) + 1));
                    //maAttr2.setValue("");
                    mdarray[ 1 ] = maAttr2;
                        
                    //System.out.println("KPIs are being created!!!");
                        
                    if (kpiStereotypeExists == false)
                        ed.setMetadataAttrs(mdarray);
                    else { // if we have steretotypes definition
                        int index = -1; // finding the index of the KPI in KpiSterepType if it exists
                        for (int j = 0; j < MultipleStereoType.size(); j++) {
                            if (MultipleStereoType.get(j).get(0).equals(NoRedundantMultipleKpi.get(i))) {
                                index = j;
                                break;
                            }
                        }
                        
                        System.out.println("KPI stereotypes exist!!!");
                        
                        if (index == -1) { // if we have stereotype definition, but the KPI is not defined in the list of stereotype definition
                            ed.setMetadataAttrs(mdarray);
                            System.out.println("KPI stereotypes exist, but not found!!!");
                        }   // if we have stereotype definition, and the KPI is defined in the list of stereotype definition
                        else if (index != -1) { // if we have stereotypes and KPI stereotyope is defined in the list of stereotypes
                            // adding stereotypes into metadata of the KPI into an arraylist
                            System.out.println("KPI stereotypes exist, and found!!!");
                            ArrayList<MetadataAttribute> tempMDList = new ArrayList<MetadataAttribute>();
                            for (int j = 1; j < MultipleStereoType.get(index).size(); j++) {
                                MetadataAttribute MDtemp = new MetadataAttribute();
                                MDtemp.setElem(stringID);
                                MDtemp.setName("ST_CLASSTYPE");
                                MDtemp.setValue(MultipleStereoType.get(index).get(j));
                                tempMDList.add(MDtemp);
                            }                            
                            // transforming arraylist to array
                            MetadataAttribute [] tempMDArray = new MetadataAttribute[tempMDList.size() + mdarray.length];
                            int j;
                            for (j = 0; j < mdarray.length; j++)
                                tempMDArray[ j ] = mdarray[ j ];
                            for (int k = 0; k < tempMDList.size(); k++, j++)
                                tempMDArray[ j ] = tempMDList.get(k);                               
                                
                            ed.setMetadataAttrs(tempMDArray);
                        }   
                    }  
                        
                    ed.setIntentionalElementAttribute( ieAttr );                    
                    KpiElementDefinitionList.add( ed );
                }                     
            } // end of adding KPIs from NoRedundantMultipleList
            
            // adding refs of redundant KPIs into KpiRedundantElementDefinitionList
            DeamonKpiElementDefinitionList  = new ArrayList<ElementDefinition>();
            for (int i = 0; i < DeamonKpiList.size(); i++) {
                ed = new ElementDefinition();
                ieAttr = new IntentionalElementAttribute();
                maAttr1 = new MetadataAttribute();
                //maAttr2 = new MetadataAttribute();
                mdarray = new MetadataAttribute[ 1 ];
                
                while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                    ID = 1 + rdNumber.nextInt(1000);                   
                    stringID = Integer.toString( ID );
                    if ( !IDList.contains( stringID ) )
                        break;
                }
                
                IDList.add(stringID);
                
                ieAttr.setID(stringID);
                ieAttr.setName(DeamonKpiList.get( i ).get(1));
                ieAttr.setDescription("");
                ieAttr.setType("Indicator");
                ieAttr.setDecompositionType("And");
                
                // finding id of the definition element
                for (int j = 0; j < KpiElementDefinitionList.size(); j++) {
                    if ((KpiElementDefinitionList.get(j).getIntentionalElementAttribute().getName()).equals(DeamonKpiList.get(i).get(1)))
                        ieAttr.SetDefinitionID(KpiElementDefinitionList.get(j).getIntentionalElementAttribute().getID());
                }
                /*
                if (!noAltKpi) {
                    maAttr1.setElem(stringID);
                    maAttr1.setName("AltName");
                    maAttr1.setValue(RedundantMultipleAltKpi.get( i ));
                    mdarray[ 0 ] = maAttr1;                        
                } else if (noAltKpi) { // if there is no French kpi, regular kpi will be replaced instead!
                    maAttr1.setElem(stringID);
                    maAttr1.setName("AltName");
                    maAttr1.setValue(RedundantMultipleKpi.get( i ));
                    mdarray[ 0 ] = maAttr1;                        
                }
                */
                maAttr1.setElem(stringID);
                maAttr1.setName("AltName");
                maAttr1.setValue(DeamonKpiList.get( i ).get(1));
                mdarray[ 0 ] = maAttr1;
                //maAttr2.setElem(stringID);
                //maAttr2.setName("ST_CLASSTYPE");
                //maAttr2.setValue("view");
                //mdarray[ 1 ] = maAttr2;
                
                ed.setIntentionalElementAttribute(ieAttr);
                ed.setMetadataAttrs(mdarray);
                
                DeamonKpiElementDefinitionList.add(ed);
            }
            
            // Adding Conditions to respective KPIs
            ConditionElementDefinitionList = new ArrayList<ElementDefinition>();
            ArrayList<String> listOfConditions = new ArrayList<String>();
            for (int i = 0; i < ConditionList.size(); i++) {
                if ( ConditionList.get(i).size() != 0 && !listOfConditions.contains(ConditionList.get(i).get(1)) ) { // we have a condition for the main (first) KPI of a goal
                    ed = new ElementDefinition();
                    ieAttr = new IntentionalElementAttribute();
                    maAttr1 = new MetadataAttribute();
                    mdarray = new MetadataAttribute[ 1 ];
                    
                    while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                        ID = 1 + rdNumber.nextInt(1000);                   
                        stringID = Integer.toString( ID );
                        if ( !IDList.contains( stringID ) )
                            break;
                    }
                  
                    IDList.add(stringID);
                  
                    ieAttr.setID(stringID);
                    ieAttr.setName(ConditionList.get(i).get(1));
                    ieAttr.setDescription("");
                    ieAttr.setType("Ressource");
                    ieAttr.setDecompositionType("And");
                    ed.setIntentionalElementAttribute(ieAttr);
                    maAttr1.setElem(stringID);
                    maAttr1.setName("ST_CLASSTYPE");
                    maAttr1.setValue("Condition");
                    mdarray[ 0 ] = maAttr1;
                    ed.setMetadataAttrs(mdarray);
                    
                    listOfConditions.add(ConditionList.get(i).get(1));
                    ConditionElementDefinitionList.add(ed);
                }
            }
            
            System.out.println("The size of the KpiElementDefinitionList is : " + KpiElementDefinitionList.size());
            System.out.println("The size of the ConditionElementDefinitionList is : " + ConditionElementDefinitionList.size());
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
              if (Importance.get(i).equals("")) {
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
                
                fatherName = RelationList.get(i).getFather(); //Finding father's id to set as the destid                
                for (int j = 0; j < RelationList.size(); j++)
                    if (RelationList.get(j).getName().equals(fatherName)) {
                        fatherIndex = j;
                        break;
                    }                    
                
                dcompAttr.setDestid(ElementDefinitionList.get(fatherIndex).getIntentionalElementAttribute().getID());                
                DecompositionLinkDefinitionList.add(dcompAttr);
            }
          }
    }
  
    private void createContributionList() {
        Random rdNumber = new Random();
        int ID, fatherIndex = 0;
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
                //contrbAttr.setID( "Contribution" + stringID );
                contrbAttr.setName( "Contribution" + stringID );
                contrbAttr.setDescription( "" );               
                contrbAttr.setSrcid( ElementDefinitionList.get( i ).getIntentionalElementAttribute().getID() );
              
                //Finding father's id to set as the destid
                fatherName = RelationList.get( i ).getFather();               
                for (int j = 0; j < RelationList.size(); j++)
                    if ( RelationList.get( j ).getName().equals( fatherName ) ) {
                        fatherIndex = j;
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
                
                if (!noImportanceRange) {
                    MetadataAttribute mdattr = new MetadataAttribute();
                    mdattr.setElem("Contribution" + stringID);
                    mdattr.setName("ImportanceRange");
                    mdattr.setValue(ImportanceRange.get(i));
                    contrbAttr.setMDAttr(mdattr);
                }
              
                ContributionLinkDefinitionList.add(contrbAttr);
            }
        }
        
        ArrayList<Integer> fathersIndexArray, columnIndexArray;
        if (!noKpi) {
            KpiContributionLinkDefinitionList = new ArrayList<ContributionAttribute>();
            for (int i = 0; i < NoRedundantMultipleKpi.size(); i++) {   
                fathersIndexArray = new ArrayList<Integer>();
                columnIndexArray = new ArrayList<Integer>();
                for (int j = 0; j < MultipleKpi.size(); j++)
                    if (!MultipleKpi.get(j).isEmpty())
                        if (MultipleKpi.get( j ).contains(KpiElementDefinitionList.get(i).getIntentionalElementAttribute().getName())) {
                            fathersIndexArray.add(j); // saving row of KPI     
                            columnIndexArray.add(MultipleKpi.get(j).indexOf(KpiElementDefinitionList.get(i).getIntentionalElementAttribute().getName())); // saving column of KPI
                        }
                
                for (int j = 0; j < fathersIndexArray.size(); j++) {  
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
                    contrbAttr.setDestid(ElementDefinitionList.get(fathersIndexArray.get(j)).getIntentionalElementAttribute().getID()); // father of the element is in the same row
                    contrbAttr.setQuantitativeContribution(String.valueOf(KpiContributionValueList.get(fathersIndexArray.get(j)).get(columnIndexArray.get(j)))); // setting quantitative contribution value for each contribution
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
            
            // adding dependency links between conditions and their respective KPIs
            ConditionDependencyLinkDefinitionList = new ArrayList<DecompoitionAttribute>();
            for (int i = 0; i < ConditionList.size(); i++) {
                if (ConditionList.get(i).size() != 0) {
                    while (true) {
                        ID = 1 + rdNumber.nextInt(1000);                   
                        stringID = Integer.toString(ID);                        
                        if (!LinkIDList.contains(stringID))
                            break;
                        }
                  
                    LinkIDList.add(stringID);
                    DecompoitionAttribute decompAttr = new DecompoitionAttribute();
                    decompAttr.setDescription("");
                    decompAttr.setName("Dependnecy" + stringID);
                    
                    for (int j = 0; j < ConditionElementDefinitionList.size(); j++) // finding destionationID
                        if (ConditionList.get(i).get(1).equals(ConditionElementDefinitionList.get(j).getIntentionalElementAttribute().getName()))
                            decompAttr.setDestid(ConditionElementDefinitionList.get(j).getIntentionalElementAttribute().getID());
                                        
                    for (int j = 0; j < ElementDefinitionList.size(); j++) // finding sourceID
                        if (ConditionList.get(i).get(0).equals(ElementDefinitionList.get(j).getIntentionalElementAttribute().getName()))
                            decompAttr.setSrcid(ElementDefinitionList.get(j).getIntentionalElementAttribute().getID());
                                        
                    ConditionDependencyLinkDefinitionList.add(decompAttr);
                }
            } // end of adding Dependency links
            
            DeamonKpiContributionLinkDefinition = new ArrayList<ContributionAttribute>();
            for (int i = 0; i < DeamonKpiList.size(); i++) {
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
                //contrbAttr.setSrcid(DeamonKpiElementDefinitionList.get(i).getIntentionalElementAttribute().getID());                  
                for (int j = 0; j < KpiElementDefinitionList.size(); j++) { // setting source of contribution
                    if (KpiElementDefinitionList.get(j).getIntentionalElementAttribute().getName().equals(DeamonKpiList.get(i).get(1)))
                        contrbAttr.setSrcid(KpiElementDefinitionList.get(j).getIntentionalElementAttribute().getID());
                }
                
                fatherIndex = -1;
                for (int j = 0; j < ElementDefinitionList.size(); j++) { // setting destination of contribution
                    for (int k = 0; k < ElementDefinitionList.get(i).getMetadataAttrs().length; k++) {
                        if ((ElementDefinitionList.get(i).getMetadataAttrs() [ k ]).getName().equals("LegislationSection")) // finding LegislationSection part of metadata array
                            if ((ElementDefinitionList.get(j).getMetadataAttrs() [ k ]).getvalue().equals(DeamonKpiList.get(i).get(0))) // finding the equal LegislationSection
                                fatherIndex = j;
                    }
                }
                
                contrbAttr.setDestid(ElementDefinitionList.get(fatherIndex).getIntentionalElementAttribute().getID()); // father of the element is in the same row
                contrbAttr.setQuantitativeContribution(String.valueOf(100)); // setting quantitative contribution value for each contribution
                if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) < 50)
                    contrbAttr.setContributionType("Help");
                else if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) >= 50 && 
                    Integer.parseInt(contrbAttr.getQuantitativeContribution()) < 100)
                    contrbAttr.setContributionType("SomePositive");
                else if (Integer.parseInt(contrbAttr.getQuantitativeContribution()) == 100)
                    contrbAttr.setContributionType("Make");                    
              
                contrbAttr.setCorrelation("false");
                
                MetadataAttribute mdattr = new MetadataAttribute();
                mdattr.setElem("Contribution" + stringID);
                mdattr.setName("ST_CLASSTYPE");
                mdattr.setValue("view");
                contrbAttr.setMDAttr(mdattr);
                
                DeamonKpiContributionLinkDefinition.add(contrbAttr);
            }
        } // end of noKpi's if
    }
    
    public void generatingKpiQuestionDefsLinks(int type) {
        ElementDefinition ed;
        IntentionalElementAttribute ieAttr;
        MetadataAttribute maAttr1, maAttr2;
        MetadataAttribute [] mdarray;
        DecompoitionAttribute dcompAttr;
        int ID;
        Random rdNumber = new Random();
        String stringID;
        
        if (type == 1) {            
            System.out.println("KPI questions definitions start to be created in 1!!!");
            System.out.println("in Compliance!!!");
            KpiSubQuestionElementDefinitionList = new ArrayList<ElementDefinition>();
            for (int i = 0; i < KpiSubQuestionList.size(); i += 2) { // adding KPIs sub-questions as new KPIs
                ed = new ElementDefinition();
                ieAttr = new IntentionalElementAttribute();
                maAttr1 = new MetadataAttribute();
                maAttr2 = new MetadataAttribute();
                mdarray = new MetadataAttribute[ 2 ];
                
                if (!KpiSubQuestionList.get(i).equals("*")) { // if we have sub-questions that are not empty (empty ones are just a "*")
                    while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                        ID = 1 + rdNumber.nextInt(1000);                   
                        stringID = Integer.toString(ID);
                        if (!IDList.contains(stringID))
                            break;
                    }
                    
                    IDList.add(stringID);
                    
                    ieAttr.setID(stringID);
                    ieAttr.setName(KpiSubQuestionList.get(i));
                    ieAttr.setDescription("");
                    ieAttr.setType("Indicator");
                    ieAttr.setDecompositionType("And");
                    maAttr1.setElem(stringID);
                    maAttr1.setName("AltName");
                    maAttr1.setValue(KpiSubQuestionAltList.get(i));
                    mdarray[ 0 ] = maAttr1;  
                    maAttr2.setElem(stringID);
                    maAttr2.setName("ST_CLASSTYPE");
                    maAttr2.setValue("Compliance");
                    mdarray[ 1 ] = maAttr2;
                    
                    ed.setMetadataAttrs(mdarray);
                    ed.setIntentionalElementAttribute(ieAttr);
                    KpiSubQuestionElementDefinitionList.add(ed);
                }                                                  
            } // end of Elementdefinition making
            
            System.out.println("SubQuestion are made properly!!!");
            // making decompoaition links between each category of KPIs to their main KPI
            KpiSubQuestionLinkDefinitionList = new ArrayList<DecompoitionAttribute>();
            for (int i = 0; i < KpiSubQuestionElementDefinitionList.size(); i++)
                if (KpiSubQuestionElementDefinitionList.get(i) != null) { 
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
                    dcompAttr.setSrcid(KpiSubQuestionElementDefinitionList.get(i).getIntentionalElementAttribute().getID());
                    
                    System.out.println("finding father");
                    
                    int fatherIndex = -1; //Finding father's id to set as the destid                
                    for (int j = 0; j < KpiSubQuestion.size(); j++)
                        for (int k = 0; k < KpiSubQuestion.get(j).size(); k++)
                            if (KpiSubQuestion.get(j).get(k).equals(KpiSubQuestionElementDefinitionList.get(i).getIntentionalElementAttribute().getName())) {
                                fatherIndex = j;
                                break;
                            }
                    System.out.println(KpiSubQuestionElementDefinitionList.get(i).getIntentionalElementAttribute().getName());
                    System.out.println("fatherIndex is : " + fatherIndex);
                    String fatherName = KpiSubQuestion.get(fatherIndex).get(0); // finding name of the father that is the first element of each row
                    System.out.println("fatherName is : " + fatherName);
                    for (int j = 0; j < KpiElementDefinitionList.size(); j++)
                        if (KpiElementDefinitionList.get(j).getIntentionalElementAttribute().getName().equals(fatherName)) {
                            System.out.println("found");
                            dcompAttr.setDestid(KpiElementDefinitionList.get(j).getIntentionalElementAttribute().getID()); 
                        }
                    
                    KpiSubQuestionLinkDefinitionList.add(dcompAttr);
                }
            
            KpiElementDefinitionList.addAll(KpiSubQuestionElementDefinitionList);
            DecompositionLinkDefinitionList.addAll(KpiSubQuestionLinkDefinitionList);
        }
        
        if (type == 2) {
            System.out.println("KPI questions definitions start to be created in 2!!!");
            System.out.println("in Effectiveness!!!");
            KpiSubQuestionElementDefinitionList = new ArrayList<ElementDefinition>();
            for (int i = 1; i < KpiSubQuestionList.size(); i += 2) { // adding KPIs sub-questions as new KPIs 
                ed = new ElementDefinition();
                ieAttr = new IntentionalElementAttribute();
                maAttr1 = new MetadataAttribute();
                maAttr2 = new MetadataAttribute();
                mdarray = new MetadataAttribute[ 2 ];
                    
                if (!KpiSubQuestionList.get(i).equals("*")) { // if we have sub-questions
                    while (true) { //To create a random number for the new abstract intentional element that is unique in whole xml file
                        ID = 1 + rdNumber.nextInt(1000);                   
                        stringID = Integer.toString(ID);
                        if (!IDList.contains(stringID))
                            break;
                    }
                      
                    IDList.add(stringID);
                       
                    ieAttr.setID(stringID);
                    ieAttr.setName(KpiSubQuestionList.get(i));
                    ieAttr.setDescription("");
                    ieAttr.setType("Indicator");
                    ieAttr.setDecompositionType("And");
                    maAttr1.setElem(stringID);
                    maAttr1.setName("AltName");
                    maAttr1.setValue(KpiSubQuestionAltList.get(i));
                    mdarray[ 0 ] = maAttr1;  
                    maAttr2.setElem(stringID);
                    maAttr2.setName("ST_CLASSTYPE");
                    maAttr2.setValue("Effectiveness");
                    mdarray[ 1 ] = maAttr2;
                    
                    ed.setMetadataAttrs(mdarray);
                    ed.setIntentionalElementAttribute(ieAttr);
                    KpiSubQuestionElementDefinitionList.add(ed);
                }               
            }
            
            // making decompoaition links between each category of KPIs to their main KPI
            KpiSubQuestionLinkDefinitionList = new ArrayList<DecompoitionAttribute>();
            for (int i = 0; i < KpiSubQuestionElementDefinitionList.size(); i++)
                if (KpiSubQuestionElementDefinitionList.get(i) != null) { 
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
                    dcompAttr.setSrcid(KpiSubQuestionElementDefinitionList.get(i).getIntentionalElementAttribute().getID());
                    
                    System.out.println("finding father");
                    
                    int fatherIndex = -1; //Finding father's id to set as the destid                
                    for (int j = 0; j < KpiSubQuestion.size(); j++)
                        for (int k = 0; k < KpiSubQuestion.get(j).size(); k++)
                            if (KpiSubQuestion.get(j).get(k).equals(KpiSubQuestionElementDefinitionList.get(i).getIntentionalElementAttribute().getName())) {
                                fatherIndex = j;
                                break;
                            }
                    System.out.println(KpiSubQuestionElementDefinitionList.get(i).getIntentionalElementAttribute().getName());
                    System.out.println("fatherIndex is : " + fatherIndex);
                    String fatherName = KpiSubQuestion.get(fatherIndex).get(0); // finding name of the father that is the first element of each row
                    System.out.println("fatherName is : " + fatherName);
                    for (int j = 0; j < KpiElementDefinitionList.size(); j++)
                        if (KpiElementDefinitionList.get(j).getIntentionalElementAttribute().getName().equals(fatherName)) {
                            System.out.println("found");
                            dcompAttr.setDestid(KpiElementDefinitionList.get(j).getIntentionalElementAttribute().getID()); 
                        }
                    
                    KpiSubQuestionLinkDefinitionList.add(dcompAttr);
                }
          
            KpiElementDefinitionList.addAll(KpiSubQuestionElementDefinitionList);
            DecompositionLinkDefinitionList.addAll(KpiSubQuestionLinkDefinitionList);
        }
    }
    
    public void calculateContributionValueList() {
        String father;
        ArrayList <Integer> siblingsList;
        int weightSum = 0, contributionSum = 0, contributionValue = 0;
        
        ContributionValueList = new ArrayList<Integer>();
        for ( int i = 0; i < Importance.size(); i++ ) //Initializing ContributionValueList to 0 for all the elements
            ContributionValueList.add( 0 );
        
        System.out.println("size of ContributionValueList is : "+ContributionValueList.size());        
        for (int i = 1; i < Importance.size(); i++) { // now, we are calculating!!!
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
            for (int j = 0; j < row.length(); j++)
                if (row.charAt(j) != ';')
                    continue;
                else {
                    MultipleKpi.get(i).add(row.substring(beginIndex, j));
                    beginIndex = ++j;
                }            
        }
        
        System.out.println( "\nSimple MultipleKpi size is : " + MultipleKpi.size() );
    }
    
    private void refineNoRedundantMultipleKpi() {
        ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < MultipleKpi.size(); i++) {
            temp.add(new ArrayList<String>());
            for (int j = 0; j < MultipleKpi.get(i).size(); j++)
                if (IntentionalElement.contains(MultipleKpi.get(i).get(j))) // if a Kpi has the same name of one of IntentionalElement list, 
                    temp.get(i).add(MultipleKpi.get(i).get(j) + " - " + RefinedLegislationSection.get(i));
                else
                    temp.get(i).add(MultipleKpi.get(i).get(j));            
        }
        
        MultipleKpi =  new ArrayList<ArrayList<String>>(temp);
        
        System.out.println( "\nSimple MultipleKpi size after refining is : " + MultipleKpi.size() );
    }
    
    private void makeNoRedundantMultipleKpi() {
        NoRedundantMultipleKpi = new ArrayList<String>();
        RedundantMultipleKpi = new ArrayList<String>();         
        for (int i = 0; i < MultipleKpi.size(); i++)
            for (int j = 0; j < MultipleKpi.get(i).size(); j++) 
                if (!NoRedundantMultipleKpi.contains(MultipleKpi.get(i).get(j)))
                    NoRedundantMultipleKpi.add(MultipleKpi.get(i).get(j));                    
                else
                    RedundantMultipleKpi.add(MultipleKpi.get(i).get(j));                    
                 
        System.out.println( "\nSimple NoRedundantMultipleKpi size is : " + NoRedundantMultipleKpi.size() );
        System.out.println( "\nSimple RedundantMultipleKpi size is : " + RedundantMultipleKpi.size() );
        
        for (int i = 0; i < RedundantMultipleKpi.size(); i++)
            System.out.println(RedundantMultipleKpi.get(i));
    }   
    
    private void makeMultipleAltKpi() {
        int beginIndex;
        String row;
        MultipleAltKpi = new ArrayList<ArrayList<String>>();         
        for (int i = 0; i < Kpi.size(); i++ ) {
            beginIndex = 0;
            row = AltKpi.get( i );
            MultipleAltKpi.add(new ArrayList<String>());             
            for (int j = 0; j < row.length(); j++)
                if (row.charAt(j) != ';')
                    continue;
                else {
                    MultipleAltKpi.get(i).add(row.substring(beginIndex, j));
                    beginIndex = ++j;
                }            
        }
               
        System.out.println( "\nSimple MultipleAltKpi size is : " + MultipleAltKpi.size() );       
    }
    
    private void refineNoRedundantMultipleAltKpi() {
        ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < MultipleAltKpi.size(); i++) {
            temp.add(new ArrayList<String>());
            for (int j = 0; j < MultipleAltKpi.get(i).size(); j++) 
                if (IntentionalElement.contains(MultipleAltKpi.get(i).get(j))) // if a Kpi has the same name of one of IntentionalElement list, 
                    temp.get(i).add(MultipleAltKpi.get(i).get(j) + " - " + RefinedLegislationSection.get(i));
                else
                    temp.get(i).add(MultipleAltKpi.get(i).get(j));            
        }
        
        MultipleAltKpi =  new ArrayList<ArrayList<String>>(temp);
    }
    
    private void makeNoRedundantMultipleAltKpi() {
        NoRedundantMultipleAltKpi = new ArrayList<String>();
        RedundantMultipleAltKpi = new ArrayList<String>();         
        for (int i = 0; i < MultipleAltKpi.size(); i++) 
            for (int j = 0; j < MultipleAltKpi.get(i).size(); j++)
                if (!NoRedundantMultipleAltKpi.contains(MultipleAltKpi.get(i).get(j)))
                    NoRedundantMultipleAltKpi.add(MultipleAltKpi.get(i).get(j));                    
                else
                    RedundantMultipleAltKpi.add(MultipleAltKpi.get(i).get(j));                    
                    
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
        for (int i = 0; i < IntentionalElement.size(); i++)
            if (RedundantIntentionalElement.contains(IntentionalElement.get(i)))
                temp.add(IntentionalElement.get(i) + " - " + RefinedLegislationSection.get(i));
            else
                temp.add(IntentionalElement.get(i));
                
        IntentionalElement = new ArrayList<String>(temp);
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
        for (int i = 0; i < AltName.size(); i++)
            if (redundantAltName.contains(AltName.get(i)))
                temp.add(AltName.get(i) + " - " + RefinedLegislationSection.get(i));
            else
                temp.add(AltName.get(i));
           
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
        
        ImportanceRange = new ArrayList<String>(); // creating ImportanceRange by adding the second column of ImportanceRow into it
        for (int i = 0; i < ImportanceRow.size(); i++)
            if (ImportanceRow.get(i).size() > 1) // if a range is defined in csv file
                ImportanceRange.add(ImportanceRow.get(i).get(1));
            else // if a range is not defined, we add an empty string   
                ImportanceRange.add("");
        
        for (int i = 0; i < ImportanceRange.size(); i++) // if there is no range defined in csv file, we simply ignore this metadata attribute by making a flag false
            if (!ImportanceRange.get(i).equals(""))
                noImportanceRange = false;
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
    
    // Manipulating KpiWeight list and removing conditions from the end of each row if there is any and put them into separate list that
    // has Goal name as its first node and Condition name as its second node, if any condition for that KPI exists! 
    private void makeConditionList() {
        System.out.println("in makeConditionList");
        ConditionList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < KpiWeight.size(); i++) {
            ConditionList.add(new ArrayList<String>());  
            //ConditionList.get(i).add(MultipleKpi.get(i).get(0)); // the condition in the first node
            if (KpiWeight.get(i).contains("#C")) {
                System.out.println("a condition in " + i);
                ConditionList.get(i).add(IntentionalElement.get(i)); // adding name of the Goal of the condition in the first node
                int conditionStartIndex = KpiWeight.get(i).indexOf(";#C_"); // finding index of condition from separating character ';'
                String conditionName = KpiWeight.get(i).substring(conditionStartIndex + 4, KpiWeight.get(i).length() - 1); // finding the name of condition
                ConditionList.get(i).add(conditionName); // adding the name of condition as the second node in Condition list
                String tempSTR = KpiWeight.get(i).substring(0, conditionStartIndex + 1); // finding the string containing all the weights without having condition at the end
                KpiWeight.set(i, tempSTR); // updating the value of string of weights with a correct one that has no condition at the end of it 
            }
        }
        
        System.out.println("The size of the ConditionList is : " + ConditionList.size());
        for (int i = 0; i < ConditionList.size(); i++) {
            for (int j = 0; j < ConditionList.get(i).size(); j++) {
                System.out.println("a condition in " + i);
                System.out.println("ConditionList[ " + i + " , " + j + " ] is : " + ConditionList.get(i).get(j));
            }
        }
        
        System.out.println("done with makingCondition!!!");
    }
    
    private void makeMultipleKpiWeight() {
        int beginIndex;
        String row;     
        MultipleKpiWeight = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < KpiWeight.size(); i++) {
            if (!KpiWeight.get( i ).equals("")) {
                beginIndex = 0;
                row = KpiWeight.get( i );
                MultipleKpiWeight.add(new ArrayList<String>());             
                for (int j = 0; j < row.length(); j++) {
                    if (row.charAt(j) != ';')
                        continue;
                    else {
                        MultipleKpiWeight.get(i).add(row.substring(beginIndex, j));
                        beginIndex = ++j;
                    }
                }
            }
            else if (KpiWeight.get( i ).equals(""))
                MultipleKpiWeight.add(new ArrayList<String>());                              
        }
        
        /*for (int i = 0; i < MultipleKpiWeight.size(); i++) {
            for (int j = 0; j < MultipleKpiWeight.get(i).size(); j++)
                System.out.print(MultipleKpiWeight.get(i).get(j) + "  ");
            System.out.println();
        }
        
        System.out.println("Good to here!!!");*/
        
        // creating a list of lists that each row has goal name as first element and remaining elements are relative weights of KPIs in order of KPIs 
        GoalKpiWeight = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < IntentionalElement.size(); i++) {
            GoalKpiWeight.add(new ArrayList<String>());            
            if (!Kpi.get(i).equals("")) { // if we have a KPI
                System.out.println("i is : " + i);
                //GoalKpiWeight.get(i).add(IntentionalElement.get(i));
                if (MultipleKpiWeight.get(i).size() == 0) { // if there is no weights is defined, "1" will be inserted in the number of KPIs
                    //for (int j = 0; j < MultipleKpi.get(i).size(); j++)
                        GoalKpiWeight.get(i).add("1");
                }
                else if (MultipleKpiWeight.get(i).size() != 0) { // if there is weights defined, they will be inserted in respect of KPIs
                    for (int j = 0; j < MultipleKpi.get(i).size(); j++) {
                        if (!MultipleKpiWeight.get(i).get(j).equals(" "))
                            GoalKpiWeight.get(i).add(MultipleKpiWeight.get(i).get(j));
                        else if (MultipleKpiWeight.get(i).get(j).equals(" "))
                            GoalKpiWeight.get(i).add("1");
                    }
                }
            }
        }
        
        /*System.out.println("Good to here, Second!!!");
        
        System.out.println("The size of GoalKpiWeight is : " + GoalKpiWeight.size());
        for (int i = 0; i < GoalKpiWeight.size(); i++) {
            System.out.println("The size of GoalKpiWeight[ " + i + " ] is : " + GoalKpiWeight.get(i).size());
            for (int j = 0; j < GoalKpiWeight.get(i).size(); j++)
                System.out.println("The GoalKpiWeight[ " + i + " ][ " + j + " ] is : " + GoalKpiWeight.get(i).get(j));
        }*/
    }
    
    private void makeKpiContributionValueList() { // is not working properly!!!
        int weightSum, weightValue, addedWeightValue;
        KpiContributionValueList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < GoalKpiWeight.size(); i++) {
            weightValue = 0;
            weightSum = 0;
            addedWeightValue = 0;
            for (int j = 0; j < GoalKpiWeight.get(i).size(); j++) // finding summation of all KPI weights
                weightSum += Integer.parseInt(GoalKpiWeight.get(i).get(j));
                        
            KpiContributionValueList.add(new ArrayList<Integer>());
            for (int j = 0; j < GoalKpiWeight.get(i).size(); j++) {
                weightValue = (Integer.parseInt(GoalKpiWeight.get(i).get(j)) * 100) / weightSum;
                addedWeightValue += weightValue;
                if (j < GoalKpiWeight.get(i).size() - 1)
                    KpiContributionValueList.get(i).add(weightValue);
                else if (j == GoalKpiWeight.get(i).size() - 1)
                    KpiContributionValueList.get(i).add(weightValue + (100 - addedWeightValue));
            }
        }
        
        /*System.out.println("The size of KpiContributionValueList is : " + KpiContributionValueList.size());
        for (int i = 0; i < KpiContributionValueList.size(); i++) {
            System.out.println("The size of KpiContributionValueList[ " + i + " ] is : " + KpiContributionValueList.get(i).size());
            for (int j = 0; j < KpiContributionValueList.get(i).size(); j++)
                System.out.println("The KpiContributionValueList[ " + i + " ][ " + j + " ] is : " + KpiContributionValueList.get(i).get(j));
        }*/
    }
    
    private void makeKpiSubQuestion() {
        KpiSubQuestion = new ArrayList<ArrayList<String>>();
        KpiSubQuestionAlt = new ArrayList<ArrayList<String>>();
        KpiConversionList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < MultipleStereoType.size(); i++) { // putting Kpi name into the very first cell of each row for both lists
            KpiSubQuestion.add(new ArrayList<String>());
            KpiSubQuestion.get(i).add(MultipleStereoType.get(i).get(0));
            KpiSubQuestionAlt.add(new ArrayList<String>());
            KpiSubQuestionAlt.get(i).add(MultipleStereoType.get(i).get(0));
            KpiConversionList.add(new ArrayList<String>());
            KpiConversionList.get(i).add(MultipleStereoType.get(i).get(0));
        }
        
        for (int i = 0; i < MultipleStereoType.size(); i++) // finding and adding sub-questions into KpiSubQuestion list
            for (int j = 0; j < MultipleStereoType.get(i).size(); j++) { 
                if (MultipleStereoType.get(i).get(j).charAt(0) == '*' && MultipleStereoType.get(i).get(j).length() == 1 ) // if string starts with '*', then it is a sub-question
                    KpiSubQuestion.get(i).add(MultipleStereoType.get(i).get(j));
                else if (MultipleStereoType.get(i).get(j).charAt(0) == '*' && MultipleStereoType.get(i).get(j).length() > 1 
                        && MultipleStereoType.get(i).get(j).charAt(1) != '*')
                    KpiSubQuestion.get(i).add(MultipleStereoType.get(i).get(j));
                else if (MultipleStereoType.get(i).get(j).charAt(0) == '*' && MultipleStereoType.get(i).get(j).charAt(1) == '*') // if string starts with '**', then it is a sub-question alternative name
                    KpiSubQuestionAlt.get(i).add(MultipleStereoType.get(i).get(j));                                    
            }
        
        for (int i = 0; i < MultipleStereoType.size(); i++) // finding and adding KPIConversions into KpiConversionList
            for (int j = 0; j < MultipleStereoType.get(i).size(); j++) {
                if (MultipleStereoType.get(i).get(j).charAt(0) == '#') {
                    //String s = MultipleStereoType.get(i).get(j).substring(1);
                    KpiConversionList.get(i).add(MultipleStereoType.get(i).get(j).substring(1));                    
                }
            }
        
        System.out.println("size of KpiConverionList is : " + KpiConversionList.size());
          for (int i = 0; i < KpiConversionList.size(); i++) {
            for (int j = 0; j < KpiConversionList.get(i).size(); j++)
              System.out.print(KpiConversionList.get(i).get(j) + "           ");
            System.out.println("");
          }
        
        System.out.println("good to before organizing!!!");
        //System.out.println("size of KpiSubQuestion is : " + KpiSubQuestion.size());
        //for (int i = 0; i < KpiSubQuestion.size(); i++)
          //for (int j = 0; j < KpiSubQuestion.get(i).size(); j++)
            //System.out.println(KpiSubQuestion.get(i).size());
        //System.out.println("size of KpiSubQuestionAlt is : " + KpiSubQuestionAlt.size());
        //for (int i = 0; i < KpiSubQuestionAlt.size(); i++)
          //for (int j = 0; j < KpiSubQuestionAlt.get(i).size(); j++)
            //System.out.println(KpiSubQuestionAlt.get(i).size());
        
        makeSubQuestionAltOrganized(); // to take care of the alternative names of sub-questions if they are not provided
        
        System.out.println("good to after organizing!!!");
        
        KpiSubQuestionList = new ArrayList<String>(); // creating a linear list
        for (int i = 0; i < KpiSubQuestion.size(); i++) // putting sub-questions from a list of list of strings into a linear list
            for (int j = 1; j < KpiSubQuestion.get(i).size(); j++)
                KpiSubQuestionList.add(KpiSubQuestion.get(i).get(j));
            
        KpiSubQuestionAltList = new ArrayList<String>(); // creating a linear list
        for (int i = 0; i < KpiSubQuestionAlt.size(); i++) // putting sub-questions alternative names from a list of list of strings into a linear list
            for (int j = 1; j < KpiSubQuestionAlt.get(i).size(); j++)
                KpiSubQuestionAltList.add(KpiSubQuestionAlt.get(i).get(j));        
            
        /*for (int i = 0; i < KpiSubQuestion.size(); i++) {
          System.out.println("The size of KpiKpiSubQuestion[ " + i + " ] is : " + KpiSubQuestion.get(i).size());
          for (int j = 0; j < KpiSubQuestion.get(i).size(); j++)
              System.out.println("The KpiSubQuestion[ " + i + " ][ " + j + " ] is : " + KpiSubQuestion.get(i).get(j));
        }
        
        for (int i = 0; i < KpiSubQuestionAlt.size(); i++) {
          System.out.println("The size of KpiKpiSubQuestionAlt[ " + i + " ] is : " + KpiSubQuestionAlt.get(i).size());
          for (int j = 0; j < KpiSubQuestionAlt.get(i).size(); j++)
              System.out.println("The KpiSubQuestionAlt[ " + i + " ][ " + j + " ] is : " + KpiSubQuestionAlt.get(i).get(j));
        }*/
        
        // removing sub-question form MultipleStereoType list by using a temproray list
        ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>(); // creating a temp list
        for (int i = 0; i < MultipleStereoType.size(); i++) {
            temp.add(new ArrayList<String>());
            for (int j = 0; j < MultipleStereoType.get(i).size(); j++)
                if (MultipleStereoType.get(i).get(j).charAt(0) != '*' && MultipleStereoType.get(i).get(j).charAt(0) != '#')
                    temp.get(i).add(MultipleStereoType.get(i).get(j));           
        }
        
        MultipleStereoType = new ArrayList<ArrayList<String>>(temp);
        System.out.println("The size of the list of KPIs stereotypes is : " + MultipleStereoType.size());
        kpiStereotypeExists = false; // Althought there is a label designed in CSV file showing that stereotypes for KPIs exists, there might be cases that no
        // stereotypes for KPIs exists and only sub-questions for KPIs are defined instead. Thus, it is changed to 'false' again and then it is being checked!!! 
        for (int i = 0; i < MultipleStereoType.size(); i++) {
            //System.out.println("size of the KPIStereotypes[ " + i + " ] is : " + MultipleStereoType.get(i).size());
            if (MultipleStereoType.get(i).size() != 1) {
                System.out.println("kpiStereotypeExists is true");
                kpiStereotypeExists = true;
                break;
            }
        }
        
        /*for (int i = 0; i < MultipleStereoType.size(); i++) {
          System.out.println("The size of MultipleStereoType[ " + i + " ] is : " + MultipleStereoType.get(i).size());
          for (int j = 0; j < MultipleStereoType.get(i).size(); j++)
              System.out.println("The MultipleStereoType[ " + i + " ][ " + j + " ] is : " + MultipleStereoType.get(i).get(j));
        }*/
    }
    
    private void makeSubQuestionAltOrganized() { // if alternative name for sub-questions are not provided, the name of them will be added to the current string that is "**" 
        for (int i = 0; i < KpiSubQuestionAlt.size(); i++) 
            for (int j = 0; j < KpiSubQuestionAlt.get(i).size(); j++) 
                if (KpiSubQuestionAlt.get(i).get(j).equals("**"))
                    KpiSubQuestionAlt.get(i).set(j, KpiSubQuestionAlt.get(i).get(j).concat(KpiSubQuestion.get(i).get(j)));
    }
    
    private void makeIntentionalElmenetLevel() {
        int level;
        String father, base;
        IntentionalElementLevel = new ArrayList<Integer>();
        IntentionalElementLevel.add(0); // adding head node (first element of IntentionalElmenet list) as level 0
        base = RelationList.get(0).getName(); // settig a baseline for finding level of other elements
        for (int i = 1; i < LegislationSection.size(); i++) { // finding level of other elements
            //name = LegislationSection.get(i); // setting name of element
            father = RelationList.get(i).getFather(); // setting father name of the element
            level = 1;
            while (!father.equals(base)) {
                for (int j = 0; j < RelationList.size(); j++)
                    if (RelationList.get(j).getName().equals(father))
                        father = RelationList.get(j).getFather();
                
                level++;
            }
            
            IntentionalElementLevel.add(level);
        }
        
        /*for (int i = 0; i < IntentionalElementLevel.size(); i++) {
            System.out.println("The level of " + i + " is : " + IntentionalElementLevel.get(i));
        }*/
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
