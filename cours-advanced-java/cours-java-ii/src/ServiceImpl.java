public class ServiceImpl implements Service{
    @Override
    public String operation() throws InterruptedException {
        Thread.sleep(2000);
        return "Hello from Proxied method";
    }

    public String operation2() throws InterruptedException {
        Thread.sleep(2000);
        return "Hello from Proxied method";
    }
}
