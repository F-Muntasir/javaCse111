public class Device {
  public void start() {
                    System.out.println("Device starting");
              }
  public void shutdown() {
                    System.out.println("Device shutting down");
                    start();
              }
 }
 class Laptop extends Device {
  public void start() {
                    System.out.println("Laptop booting up");
              }
 }
 class Smartphone extends Device {
  public void notifyUser() {
                    System.out.println("Smartphone notification");
              }
 }
 class GamingLaptop extends Laptop {
  public void start() {

                    System.out.println("GamingLaptop powering on");
                    super.start();
              }
  public void notifyUser() {
                    System.out.println("GamingLaptop notification alert");
              }
 }
