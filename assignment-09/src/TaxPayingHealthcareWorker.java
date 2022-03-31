public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate " + super.getName() + " with TaxPaying.");
    }

    @Override
    public double getPrice(){
        return (110.0/100.0) * super.getPrice();
    }
}
