package POO;

public class Student {
    String name;
    Integer score;

    public Student(String name, Integer score){
        this.name = name;
        this.score = score;
    }

    public void isPassed(){
        if(score >= 60){
            System.out.println(name + " has passed with a score of " + score);
        } else {
            System.out.println(name + " has not passed with a score of " + score);
        }
    }
}
