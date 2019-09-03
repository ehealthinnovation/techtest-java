package org.shoppingdrugmarket;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ReceiptTest {

    @Test
    public void testReceipt() {
        Medication medication = new Medication("Advil", Medication.PAINKILLER);
        Prescription prescription = new Prescription(medication, 150);
        Customer customer = new Customer("John Smith");

        customer.addNewPrescription(prescription);
        String receipt = customer.generatePrescriptionReceiptText();

        Assert.assertThat(receipt, is(equalToIgnoringCase(
                "Prescription receipt for John Smith:\n\t Advil:\t3.00\t100\nTotal cost:\t3.00\nTotal optimal points earned:\t100\n"
        )));
    }

    @Test
    public void testHtmlReceipt() {
        Medication medication = new Medication("Advil", Medication.PAINKILLER);
        Prescription prescription = new Prescription(medication, 150);
        Customer customer = new Customer("John Smith");

        customer.addNewPrescription(prescription);
        String receipt = customer.generatePrescriptionReceiptHtml();

        Assert.assertThat(receipt, is(equalToIgnoringCase(
                "<html><body><p><h3>Prescription receipt for John Smith:</h3></p><table><tr><th>Medication</th><th>Price</th><th>Optimal Points</th></tr><tr><td>Advil</td><td>3.00</td><td>100</td></tr></table><p>Total cost: 3.00</p><p>Total optimal points earned: 100</p></body></html>"
        )));
    }

}
