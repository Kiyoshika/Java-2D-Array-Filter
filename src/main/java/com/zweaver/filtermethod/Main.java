package com.zweaver.filtermethod;

public class Main {
    public static void main(String args[]) {
        DataProcessing dataProcessing = new DataProcessing();
        
        String[][] conditions = {
            {"0", "=Zach", "AND"},
            {"1", "=Weaver", "OR"},
            {"0", "=Jimbo", "AND"},
            {"1", "=Neutron", "OR"},
            {"0", "=NonExistent", ""}
        };

        String[][] myData = {
           {"Zach", "Weaver"},
           {"Jimbo", "Neutron"},
           {"MyImaginary", "Girlfriend"}
         };
        
        // the above conditions will return results where:
        // 0th column = Zach AND 1st column = Weaver
        // OR, 0th column = Jimbo AND 1st column = Neutron
        // OR, 0th column = NonExistent
        String[][] filteredData = dataProcessing.filter(myData, conditions);
        for (int i = 0; i < filteredData.length; ++i) {
            for (int j = 0; j < filteredData[0].length; ++j) {
                System.out.print(filteredData[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
