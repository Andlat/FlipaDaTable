package frc.robot;

public class FlipaDaTable {
    private static FlipaDaTable m_instance = null;
    public static FlipaDaTable getInstance(){
        }
    }

    public static void reset(){
        getInstance().m_state = State.PREPARING; 
    }

    public static String flip(){
        // https://emoticoncentral.com/category/table-flipping
        if (getInstance().m_state == State.FLIPPING) {
            
            return "(ノಠ益ಠ)ノ彡┻━┻";
        
        }else{

            return "┬─┬ノ( º _ ºノ)";
        }
        
    }
}
