package SberEducation.Objects;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    
    public static Location locateLargest(double[][] table){
        double maxTable = 0;
        int column = 0;
        int row = 0;
        
        for (int i = 0; i < table.length; i++) {
            double maxList = 0;
            int index = 0;

            for (int j = 0; j < table[i].length; j++) {
                double element = table[i][j];

                if (element > maxList) {
                    maxList = element;
                    index = j;
                }
            }

            if (maxList > maxTable){
                maxTable = maxList;
                row = i;
                column = index;
            }
        }
        return new Location(row, column, maxTable);
    }

    @Override
    public String toString(){
        return (this.row + "\t" + this.column + "\t" + this.maxValue);
    }
}
