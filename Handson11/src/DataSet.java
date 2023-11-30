import java.util.ArrayList;

public class DataSet {
    double observacion;
    double factor1;
    double factor2;
    double factor3;
    double yield;
    public static ArrayList<DataSet> Datos =new ArrayList<>();

    public DataSet (double Observation, double factor1, double factor2, double factor3, double yield){
        this.observacion= observacion;
        this.factor1 = factor1;
        this.factor2 = factor2;
        this.factor3 = factor3;
        this.yield = yield;
    }

    public DataSet (double Observation, double factor1, double factor2, double yield){
        this.observacion= observacion;
        this.factor1 = factor1;
        this.factor2 = factor2;
        this.yield = yield;
    }

    public DataSet (double Observation, double factor1, double yield){
        this.observacion= observacion;
        this.factor1 = factor1;
        this.yield = yield;
    }



    public static DataSet LeerBenetton(){
        Datos.add(new DataSet(1, 23, 651));
        Datos.add(new DataSet(1, 26, 762));
        Datos.add(new DataSet(1, 30, 856));
        Datos.add(new DataSet(1, 34, 1063));
        Datos.add(new DataSet(1, 43, 1190));
        Datos.add(new DataSet(1, 48, 1298));
        Datos.add(new DataSet(1, 52, 1421));
        Datos.add(new DataSet(1, 57, 1440));
        Datos.add(new DataSet(1, 58, 1518));
        return null;
    }

    public static DataSet LeerStartups50(){
        Datos.add(new DataSet(1, 165349.2, 136897.8, 471784.1, 192261.83));
        Datos.add(new DataSet(1, 162597.7, 151377.59, 443898.53, 191792.06));
        Datos.add(new DataSet(1, 153441.51, 101145.55, 407934.54, 191050.39));
        Datos.add(new DataSet(1, 144372.41, 118671.85, 383199.62, 182901.99));
        Datos.add(new DataSet(1, 142107.34, 91391.77, 366168.42, 166187.94));
        Datos.add(new DataSet(1, 131876.9, 99814.71, 362861.36, 156991.12));
        Datos.add(new DataSet(1, 134615.46, 147198.87, 127716.82, 156122.51));
        Datos.add(new DataSet(1, 130298.13, 145530.06, 323876.68, 155752.6));
        Datos.add(new DataSet(1, 120542.52, 148718.95, 311613.29, 152211.77));
        Datos.add(new DataSet(1, 123334.88, 108679.17, 304981.62, 149759.96));
        Datos.add(new DataSet(1, 101913.08, 110594.11, 229160.95, 146121.95));
        Datos.add(new DataSet(1, 100671.96, 91790.61, 249744.55, 144259.4));
        Datos.add(new DataSet(1, 93863.75, 127320.38, 249839.44, 141585.52));
        Datos.add(new DataSet(1, 91992.39, 135495.07, 252664.93, 134307.35));
        Datos.add(new DataSet(1, 119943.24, 156547.42, 256512.92, 132602.65));
        Datos.add(new DataSet(1, 114523.61, 122616.84, 261776.23, 129917.04));
        Datos.add(new DataSet(1, 78013.11, 121597.55, 264346.06, 126992.93));
        Datos.add(new DataSet(1, 94657.16, 145077.58, 282574.31, 125370.37));
        Datos.add(new DataSet(1, 91749.16, 114175.79, 294919.57, 124266.9));
        Datos.add(new DataSet(1, 86419.7, 153514.11, 0, 122776.86));
        Datos.add(new DataSet(1, 76253.86, 113867.3, 298664.47, 118474.03));
        Datos.add(new DataSet(1, 78389.47, 153773.43, 299737.29, 111313.02));
        Datos.add(new DataSet(1, 73994.56, 122782.75, 303319.26, 110352.25));
        Datos.add(new DataSet(1, 67532.53, 105751.03, 304768.73, 108733.99));
        Datos.add(new DataSet(1, 77044.01, 99281.34, 140574.81, 108552.04));
        Datos.add(new DataSet(1, 64664.71, 139553.16, 137962.62, 107404.34));
        Datos.add(new DataSet(1, 75328.87, 144135.98, 134050.07, 105733.54));
        Datos.add(new DataSet(1, 72107.6, 127864.55, 353183.81, 105008.31));
        Datos.add(new DataSet(1, 66051.52, 182645.56, 118148.2, 103282.38));
        Datos.add(new DataSet(1, 65605.48, 153032.06, 107138.38, 101004.64));
        Datos.add(new DataSet(1, 61994.48, 115641.28, 91131.24, 99937.59));
        Datos.add(new DataSet(1, 61136.38, 152701.92, 88218.23, 97483.56));
        Datos.add(new DataSet(1, 63408.86, 129219.61, 46085.25, 97427.84));
        Datos.add(new DataSet(1, 55493.95, 103057.49, 214634.81, 96778.92));
        Datos.add(new DataSet(1, 46426.07, 157693.92, 210797.67, 96712.8));
        Datos.add(new DataSet(1, 46014.02, 85047.44, 205517.64, 96479.51));
        Datos.add(new DataSet(1, 28663.76, 127056.21, 201126.82, 90708.19));
        Datos.add(new DataSet(1, 44069.95, 51283.14, 197029.42, 89949.14));
        Datos.add(new DataSet(1, 20229.59, 65947.93, 185265.1, 81229.06));
        Datos.add(new DataSet(1, 38558.51, 82982.09, 174999.3, 81005.76));
        Datos.add(new DataSet(1, 28754.33, 118546.05, 172795.67, 78239.91));
        Datos.add(new DataSet(1, 27892.92, 84710.77, 164470.71, 77798.83));
        Datos.add(new DataSet(1, 23640.93, 96189.63, 148001.11, 71498.49));
        Datos.add(new DataSet(1, 15505.73, 127382.3, 35534.17, 69758.98));
        Datos.add(new DataSet(1, 22177.74, 154806.14, 28334.72, 65200.33));
        Datos.add(new DataSet(1, 1000.23, 124153.04, 1903.93, 64926.08));
        Datos.add(new DataSet(1, 1315.46, 115816.21, 297114.46, 49490.75));
        Datos.add(new DataSet(1, 0, 135426.92, 0, 42559.73));
        Datos.add(new DataSet(1, 542.05, 51743.15, 0, 35673.41));
        Datos.add(new DataSet(1, 0, 116983.8, 45173.06, 14681.4));
        return null;
    }

    public static DataSet LeerChemical(){
        Datos.add(new DataSet(1, 41.9, 29.1, 251.3));
        Datos.add(new DataSet(1, 43.4, 29.3, 251.3));
        Datos.add(new DataSet(1, 43.9, 29.5, 248.3));
        Datos.add(new DataSet(1, 44.5, 29.7, 267.5));
        Datos.add(new DataSet(1, 47.3, 29.9, 273.0));
        Datos.add(new DataSet(1, 47.5, 30.3, 276.5));
        Datos.add(new DataSet(1, 47.9, 30.5, 270.3));
        Datos.add(new DataSet(1, 50.2, 30.7, 274.9));
        Datos.add(new DataSet(1, 52.8, 30.8, 285.0));
        Datos.add(new DataSet(1, 53.2, 30.9, 290.0));
        Datos.add(new DataSet(1, 56.7, 31.5, 297.0));
        Datos.add(new DataSet(1, 57.0, 31.7, 302.5));
        Datos.add(new DataSet(1, 63.5, 31.9, 304.5));
        Datos.add(new DataSet(1, 65.3, 32.0, 309.3));
        Datos.add(new DataSet(1, 71.1, 32.1, 321.7));
        Datos.add(new DataSet(1, 77.0, 32.5, 330.7));
        Datos.add(new DataSet(1, 77.8, 32.9, 349.0));
        return null;
    }

    public static DataSet LeerVarsity(){
        Datos.add(new DataSet(1, -3, 7.5));
        Datos.add(new DataSet(1, -2, 3));
        Datos.add(new DataSet(1, -1, 0.5));
        Datos.add(new DataSet(1, 0, 1));
        Datos.add(new DataSet(1, 1, 3));
        Datos.add(new DataSet(1, 2, 6));
        Datos.add(new DataSet(1, 3, 14));
        return null;
    }

    public static DataSet Polynomial(){
        Datos.add(new DataSet(1,108,95));
        Datos.add(new DataSet(1,115,96));
        Datos.add(new DataSet(1,106,95));
        Datos.add(new DataSet(1,97,97));
        Datos.add(new DataSet(1,95,93));
        Datos.add(new DataSet(1,91,94));
        Datos.add(new DataSet(1,97,95));
        Datos.add(new DataSet(1,83,93));
        Datos.add(new DataSet(1,83,92));
        Datos.add(new DataSet(1,78,86));
        Datos.add(new DataSet(1,54,73));
        Datos.add(new DataSet(1,67,80));
        Datos.add(new DataSet(1,56,65));
        Datos.add(new DataSet(1,53,69));
        Datos.add(new DataSet(1,61,77));
        Datos.add(new DataSet(1,115,96));
        Datos.add(new DataSet(1,81,87));
        Datos.add(new DataSet(1,78,89));
        Datos.add(new DataSet(1,30,60));
        Datos.add(new DataSet(1,45,63));
        Datos.add(new DataSet(1,99,95));
        Datos.add(new DataSet(1,32,61));
        Datos.add(new DataSet(1,25,55));
        Datos.add(new DataSet(1,28,56));
        Datos.add(new DataSet(1,90,94));
        Datos.add(new DataSet(1,89,93));
        return null;
    }
}
