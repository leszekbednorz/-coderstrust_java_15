public class Statistics {

    /**
     * Calculate average values for array of integers
     * @param values
     * @return
     */
    public double getAverage(int[] values){

        int sum = 0;

        for(int number:  values ) {
            sum = sum + number;
        }

        return (double)sum/(double)values.length;
    }

    /**
     * Calculate average values for floating point array
     * @param values
     * @return
     */
    public double getAverage(double[] values){
        double sum = 0;

        for(double number:  values ) {
            sum = sum + number;
        }

        return sum/values.length;
    }
}
