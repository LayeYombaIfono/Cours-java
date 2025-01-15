public interface Service {

     @Measure
     String operation() throws InterruptedException;
}
