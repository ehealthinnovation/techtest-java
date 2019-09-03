package org.shoppingdrugmarket;

/**
 * A medication that gets sold at Shopping Drug Market
 */
public class Medication {
    public static final int PAINKILLER = 2;
    public static final int DECONGESTANT = 1;
    public static final int ANTIHISTAMINE = 0;

    private String medicationName;
    private int medicationType;

    /**
     * A medication has a name, and a type(out of the three defined above)
     *
     * @param medicationName the name of the medication, a simple string
     * @param medicationType the type of the medication, from a defined enum
     */
    public Medication(String medicationName, int medicationType) {
        this.medicationName = medicationName;
        this.medicationType = medicationType;
    }

    public int getMedicationType() {
        return medicationType;
    }

    public void setMedicationType(int newDosage) {
        medicationType = newDosage;
    }

    public String getMedicationName() {
        return medicationName;
    }
}
