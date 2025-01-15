public class Main {
    public static void main(String[] args) throws InterruptedException {
        Service proxyService = ProxyService.create(Service.class,
                new ServiceImpl());

        System.out.println(proxyService.operation());
    }
}
