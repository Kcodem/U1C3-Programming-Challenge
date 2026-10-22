public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

//done
    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }
//done
    public Solution(int id) {
        calcModel = "TI-84";
        idNumber = id;
    }


//done
    public String getCalcModel() {
        //implement code here
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        //implement code here
        calcModel = newModel;
        
    }
//done
    public int getIdNumber() {
        //implement code here
        return idNumber;
    }

    public void setIdNumber(int newId) {
        //implement code here
        idNumber = newId;
    }

    public void incrementId() {
        //implement code here
        idNumber = idNumber + 1;
    }

    public double add(double num1, double num2) {
        //implement code here
        double addition = num1 + num2;
        return addition;
    }

    public double subtract(double num1, double num2) {
        //implement code here
        double subtraction = num1 - num2;
        return subtraction;
    }

    public double multiply(double num1, double num2) {
        //implement code here
        double multiplication = num1 * num2;
        return multiplication;
    }

    public int quotient(int num1, int num2) {
        //implement code here
        int division = (num1 / num2);
        return division;
    }

    public int remainder(int num1, int num2) {
        //implement code here
        int modulo = num1 % num2;
        return modulo;
    }

    public String divisionResult(int num1, int num2) {
        //implement code here
        int division = (num1/num2);
        int modulo = num1 % num2;
        return division + " R " + modulo;
    }

    public String coordinatePair(int x, int y) {
        //implement code here
        // string sx = string x;
        // string sy = string y;
        String coords = "(" + x + "," + y + ")";
        return coords;
    }

    public int average(int num1, int num2) {
        //implement code here
        int addit = num1 + num2;
        double avg = addit / 2.0;
        int round = (int)(avg + 0.5);
        return round;
    }

    public String info() {
        //implement code here
        Solution calc = new Solution(calcModel,idNumber);
        String cmodel = calc.getCalcModel();
        int iden = calc.getIdNumber();
        return "This calculator is a model " + cmodel + " with id " + iden;
    }

    //something wrong with the new solution

}
