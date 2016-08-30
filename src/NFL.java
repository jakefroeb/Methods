/**
 * Created by jakefroeb on 8/29/16.
 */
public class NFL {
    private String state;
    private String teamName;
    private int superbowls;
    private boolean isGood;


    public NFL(String state, String teamName, int superbowls, boolean isGood) {
        this.state = state;
        this.teamName = teamName;
        this.superbowls = superbowls;
        this.isGood = isGood;

    }

        public void setState(String s) {
            this.state= s;
        }

        public String getState(){
            return state;
        }

        public void setTeamName(String t){
            this.teamName = t;
        }

        public String getTeamName(){
            return teamName;
        }

        public void setSuperbowls(int sup){
            this.superbowls = sup;
        }

        public int getSuperbowls(){
            return superbowls;
        }

        public boolean checkName(){
            return teamName == "Titans";
        }

        public void setIsGood(boolean i){
            this.isGood = i;
                if(checkName()) {
                    this.isGood = true;
                }
        }

        public boolean getIsGood(){
            return isGood;
        }

}
