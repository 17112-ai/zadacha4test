package DamqnTest;

public class Truck extends Vehicle{
    private int maxLoad;

    public Truck(String make, String moel, int wheelsCount, int maxLoad) {
        super(make, moel, wheelsCount);
        this.maxLoad = maxLoad;
    }

    @Override
    protected void printInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Make: " + super.getMake()).append(System.lineSeparator()).
                append("Model: " + super.getMoel()).append(System.lineSeparator()).
                append("Wheels: " + super.getWheelsCount()).append(System.lineSeparator()).
                append("Max load: " + this.maxLoad).append(System.lineSeparator());

        System.out.println(builder.toString());
    }
}
