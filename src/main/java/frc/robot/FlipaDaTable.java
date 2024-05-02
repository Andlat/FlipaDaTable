package frc.robot;

public class FlipaDaTable {
    private static FlipaDaTable m_instance = null;
    public static FlipaDaTable getInstance(){
        if(m_instance == null){
            m_instance = new FlipaDaTable();
        }
        return m_instance;
    }
    private FlipaDaTable(){
    }

    private enum State{
        PREPARING,
        FLIPPING,
    }
    private State m_state = State.PREPARING;
    public void nextState(){
        switch (this.m_state) {
            case PREPARING:
                m_state = State.FLIPPING;
                break;
            case FLIPPING:
                m_state = State.PREPARING;
                break;
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
