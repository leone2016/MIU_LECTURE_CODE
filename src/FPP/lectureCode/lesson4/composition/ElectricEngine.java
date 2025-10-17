package FPP.lectureCode.lesson4.composition;

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric motor powered up silently ⚡");
    }
}