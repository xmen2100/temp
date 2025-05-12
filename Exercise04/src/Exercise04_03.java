public class Exercise04_03 {
    public static void main(String[] args) {
        final double RADIUS = 6371.01;
        final double X_ATLANTA = (33.7489954);
        final double Y_ATLANTA = (-84.3879824);

        final double X_CHARLOTTE = (35.2270869);
        final double Y_CHARLOTTE = (-80.8431267);

        final double X_ORLANDO = (28.5383355);
        final double Y_ORLANDO = (-81.3792365);

        final double X_SAVANNAH = (32.0835407);
        final double Y_SAVANNAH = (-81.0998342);

        double charlotteToAtlanta = RADIUS * Math.acos(Math.sin(X_CHARLOTTE) * 
        Math.sin(X_ATLANTA) + Math.cos(X_CHARLOTTE) * Math.cos(X_ATLANTA) * 
        Math.cos(Y_CHARLOTTE - Y_ATLANTA));
        
        double atlantaToOrlando = RADIUS * Math.acos(Math.sin(X_ATLANTA) *
        Math.sin(X_ORLANDO + Math.cos(X_ATLANTA) * Math.cos(X_ORLANDO) *
        Math.cos(Y_ATLANTA - Y_ORLANDO)));

        double charlotteToOrlando = RADIUS * Math.acos(Math.sin(X_CHARLOTTE) * 
        Math.sin(X_ORLANDO) + Math.cos(X_CHARLOTTE) * Math.cos(X_ORLANDO) * 
        Math.cos(Y_CHARLOTTE - Y_ORLANDO));

        double charlotteToSavannah = RADIUS * Math.acos(Math.sin(X_CHARLOTTE) * 
        Math.sin(X_SAVANNAH) + Math.cos(X_CHARLOTTE) * Math.cos(X_SAVANNAH) * 
        Math.cos(Y_CHARLOTTE - Y_SAVANNAH));

        double savannahToOrlando = RADIUS * Math.acos(Math.sin(X_SAVANNAH) *
        Math.sin(X_ORLANDO + Math.cos(X_SAVANNAH) * Math.cos(X_ORLANDO) *
        Math.cos(Y_SAVANNAH - Y_ORLANDO)));

        double s = (charlotteToAtlanta + atlantaToOrlando + charlotteToOrlando) / 2.0;
        double s2 = (charlotteToOrlando + charlotteToSavannah + savannahToOrlando) / 2.0;

        double area1 = Math.sqrt(Math.abs(s * (s - charlotteToAtlanta) * (s - atlantaToOrlando) * (s - charlotteToOrlando)));
        double area2 = Math.sqrt(Math.abs(s2 * (s - charlotteToOrlando) * (s - charlotteToSavannah) * (s - savannahToOrlando)));

        double totalArea = area1 + area2;
        System.out.print("The area is " + area1 + " square kilometers");
    }
}
