class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] arrayOfInts = { { 32, 87}, { 12, 1076},{ 622, 127}};
        int searchfor = 12;
        int i, j = 0;
        boolean foundIt = false;

    
        for (i = 0; i < arrayOfInts.length; i++) {
            search: for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) 
            System.out.println("Found at " + i + ", " + j);
        else 
            System.out.println(" not in the array");
    }
}
