package challenge;

public class Main {
    public static void main(String[] args) {
        int solution = SearchingChallenge(10);
        System.out.println(solution);
    }
    public static int SearchingChallenge(int num){
        int sum = 0;
        for(int i=1; i<num; i++){
            if(i%3==0 || i%5==0){
                sum += i;
            }
        }
        return sum;
    }
}
