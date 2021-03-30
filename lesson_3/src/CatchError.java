public class CatchError {
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int[] vals = {14,22,161,55};

        try {
            printRange(vals, -12, 5);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }

    /**
     *
     * @param vals
     * @param from
     * @param to
     * @throws Exception
     */
    public static void printRange(int[] vals,int from, int to) throws Exception {
        if (from<0){
            throw new Exception("from is too small");
        }
        for(int i=from; i<=to; i++){

            int x=vals[i];
            System.out.println(x);
        }
    }
}
