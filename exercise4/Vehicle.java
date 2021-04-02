package DamqnTest;

public abstract class Vehicle {
    private String make;
    private String moel;
    private int wheelsCount;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMoel() {
        return moel;
    }

    public void setMoel(String moel) {
        this.moel = moel;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public Vehicle(String make, String moel, int wheelsCount) {
        this.make = make;
        this.moel = moel;
        this.wheelsCount = wheelsCount;
    }

    protected abstract void printInfo();
}
