import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinancingTest {

    @Test
    public void entrance20PercentShouldPercentageOfIncome(){
        Financing f = new Financing(100000.0, 2000.0, 80);
        double expectValue = 20000.0;

        double entry = f.entry();

        Assertions.assertEquals(expectValue, entry);
    }

    @Test
    public void valueOfQuotaShould80Percent(){
        Financing f = new Financing(100000.0, 2000.0, 80);
        double expectedValue = 1000.0;

        double quota = f.quota();

        Assertions.assertEquals(expectedValue, quota);
    }

    @Test
    public void constructorShouldSetValueWhenValidData(){
        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 79);
        });
    }

    @Test
    public void setTotalAmountShouldSetValueWhenValidData(){
        Financing f = new Financing(100000.0, 2000.0, 80);

        f.setTotalAmount(90000.0);

        Assertions.assertEquals(90000.0, f.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 79);
            f.setTotalAmount(110000.0);
        });
    }

    @Test
    public void setIncomeShouldSetValueWhenValidData(){
        Financing f = new Financing(100000.0, 2000.0, 80);

        f.setIncome(3000.0);

        Assertions.assertEquals(3000.0, f.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 79);
            f.setIncome(1500.0);
        });
    }

    @Test
    public void setMonthsShouldSetValueWhenValidData(){
        Financing f = new Financing(100000.0, 2000.0, 80);

        f.setMonths(81);

        Assertions.assertEquals(81, f.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setMonths(79);
        });
    }
}