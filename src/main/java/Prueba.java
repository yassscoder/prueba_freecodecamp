public class Prueba {
    private String name;
    private  String[] completedChallenges;

    public Prueba(String name, String[] completedChallenges) {
        this.name = name;
        this.completedChallenges = completedChallenges;
    }
    public Prueba(){

    }

    public String[] getCompletedChallenges() {
        return completedChallenges;
    }

    public void setCompletedChallenges(String[] completedChallenges) {
        this.completedChallenges = completedChallenges;
    }


    public String getName() {
        return name;
    }
}
