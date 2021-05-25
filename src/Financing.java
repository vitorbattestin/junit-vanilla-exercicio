public class Financing {

    private Double totalAmount;
    private Double income;
    private Integer months;

    public Financing(){
    }

    public Financing(double totalAmount, double income, int months) {
        validateFinancing(totalAmount, income, months);
        this.totalAmount = totalAmount;
        this.income = income;
        this.months = months;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        validateFinancing(totalAmount, income, months);
        this.totalAmount = totalAmount;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        validateFinancing(totalAmount, income, months);
        this.income = income;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        validateFinancing(totalAmount, income, months);
        this.months = months;
    }

    public Double entry(){
        return 0.2 * totalAmount;
    }

    public Double quota(){
        return (totalAmount - entry()) / months;
    }

    private void validateFinancing(double totalAmount, double income, int months) {
        if ((totalAmount * 0.8) / months > income / 2.0) {
            throw new IllegalArgumentException("A parcela não pode ser maior que metade da renda");
        }
    }
}
