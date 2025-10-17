package FPP.lectureCode.lesson3.herencia;

public  abstract class StaffPerson {
    private String name;
    private String address;
    private String telNum;
    private String vehicleType;
    private IServiceSRI service;


    public StaffPerson(String name, String address, String telNum, String vehicleType, IServiceSRI service) {
        this.name = name;
        this.address = address;
        this.telNum = telNum;
        this.vehicleType = vehicleType;
        this.service = service;
    }

    abstract double computeSalary();
    abstract double pruebaConocimiento();
   // abstract String pruebaConocimiento;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StaffPerson p ) ) return false;
        return
                this.getName().equals(p.getName()) &&
                this.getAddress().equals(p.getAddress()
                );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
