package org.shoppingdrugmarket;

/**
 * A prescription for a medication sold at Shopping Drug Market
 */
public class Prescription {
    private Medication medication;
    private int size;

    /**
     * A prescription takes the medication and the unit count that is being purchased(e.g. number of pills)
     *
     * @param medication the medication that a prescription is being written for
     * @param unitCount the number of units of medication being prescribed
     */
    public Prescription(Medication medication, int unitCount) {
        this.medication = medication;
        this.size = unitCount;
    }

    public int getSize() {
        return size;
    }

    public Medication getMedication() {
        return medication;
    }
}
