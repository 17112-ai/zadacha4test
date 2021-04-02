package DamqnTest;

public class Car extends Vehicle{
    private int doorsCount;

    public Car(String make, String moel, int wheelsCount, int doorsCount) {
        super(make, moel, wheelsCount);
        this.doorsCount = doorsCount;
    }

    @Override
    protected void printInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Make: " + super.getMake()).append(System.lineSeparator()).
                append("Model: " + super.getMoel()).append(System.lineSeparator()).
                append("Wheels: " + super.getWheelsCount()).append(System.lineSeparator()).
                append("Doors: " + this.doorsCount).append(System.lineSeparator());

        System.out.println(builder.toString());
    }
}
