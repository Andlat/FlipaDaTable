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

        if(getInstance().m_state == State.PREPARING)
        return "┬─┬ノ( º _ ºノ)";
        else
        return "(╯°□°）╯︵ ┻━┻";
    }
}
