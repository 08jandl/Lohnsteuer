package campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double steuersatz = berechneLohnsteuer(15000);
        System.out.println("Muss " + steuersatz + "Lohnsteuer zahlen");


    }

    public static double berechneLohnsteuer (double einkommen) {
        double lohnsteuer = 12;

        if (einkommen < 11000) {
            lohnsteuer = einkommen * 0;
        }
        else if (einkommen < 1800) {
            lohnsteuer = einkommen * 0.25;
        }
        else if (einkommen < 3100) {
            lohnsteuer = einkommen * 0.35;
        }
        else if (einkommen < 60000) {
            lohnsteuer = einkommen * 0.42;
        }
        else if (einkommen < 90000) {
            lohnsteuer = einkommen * 0.48;
        }
        else if (einkommen < 1000000) {
            lohnsteuer = einkommen * 0.50;
        }
        else {
            lohnsteuer = einkommen * 0.55;
        }
        return lohnsteuer;
    }
}


