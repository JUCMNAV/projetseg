import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Rouzbahan
 *
 */
public class QualitativeMappingSimple {
    private ArrayList<String> RealWorldLabelList;
    private ArrayList<String> EvaluationList;
    private ArrayList<Boolean> ExceedsList;
    private ArrayList<String> KPIConversionNames;
    
    public void setRealWorldLabelList( List <String[]> list ) {
      String [] row;
      RealWorldLabelList = new ArrayList<String>();    
      for (int i = 0; i < list.size(); i++) {
          row = list.get(i);
          RealWorldLabelList.add(row[ 0 ]);
      }
    
      //RealWorldLabelList.remove(0);
      System.out.println("\nSimple RealWorldLabelList size is : " + RealWorldLabelList.size());
    }
    
    public ArrayList<String> getRealWorldLabelList() {
        return RealWorldLabelList;
    }
    
    public void setEvaluationList( List <String[]> list ) {
      String [] row;
      EvaluationList = new ArrayList<String>();    
      for (int i = 0; i < list.size(); i++) {
          row = list.get(i);
          EvaluationList.add(row[ 1 ]);
      }
    
      //EvaluationList.remove(0);
      System.out.println("\nSimple EvaluationList size is : " + EvaluationList.size());      
    }
    
    public ArrayList<String> getEvaluationList() {
        return EvaluationList;
    }
    
    public void setExceedsList( List <String[]> list ) {
      String [] row;
      ExceedsList = new ArrayList<Boolean>();
      ArrayList<String> temp = new ArrayList<String>();
      for (int i = 0; i < list.size(); i++) {
          row = list.get(i);
          temp.add(row[ 2 ]);
      }
      
      //temp.remove(0);
      for (int i = 0; i < temp.size(); i++) {
          if (temp.get(i).equals("y"))
              ExceedsList.add(true);
          else if (temp.get(i).equals("n"))
              ExceedsList.add(false);
          else
              ExceedsList.add(null);
      }
      System.out.println("\nSimple ExceedsList size is : " + ExceedsList.size());
      
    }
    
    public ArrayList<Boolean> getExceedsList() {
        return ExceedsList;
    }
    
    public void setKPICoversionNames() {
        int dashIndex = -1;
        String name = null;
        KPIConversionNames = new ArrayList<String>();
        for (int i = 0; i < RealWorldLabelList.size(); i++)
            if (RealWorldLabelList.get(i).contains("RealWorldLabel")) {
                dashIndex = RealWorldLabelList.get(i).indexOf('-');
                name = RealWorldLabelList.get(i).substring(dashIndex + 1);
                KPIConversionNames.add(name);
            }        
    }
    
    public ArrayList<String> getKPICoversionNames() {
        return KPIConversionNames;
    }
}
