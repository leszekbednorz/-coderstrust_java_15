public class Statistics {

    public double getAverage(int[] values){

        int sum = 0;

        for(int number:  values ) {
            sum = sum + number;
        }

        return (double)sum/(double)values.length;
    }

    public double getAverage(double[] values){
        double sum = 0;

        for(double number:  values ) {
            sum = sum + number;
        }

        return sum/values.length;
    }
}
