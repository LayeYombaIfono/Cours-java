import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.Duration;
import java.time.Instant;

public class ProxyService implements InvocationHandler {
    private final Object origin;

    public ProxyService(Object origin){
        this.origin = origin;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method execution");
        if (method.isAnnotationPresent(Measure.class)){
            Instant start = Instant.now();
            Object result = method.invoke(origin, args);
            Instant end = Instant.now();

            Duration duration = Duration.between(start, end);
            long minutes = duration.toMinutes();
            long seconds = duration.toSeconds()%60;
            long millisec = duration.toMillis()%1000;

            System.out.println("Minutes "+ minutes +", Seconde: "+seconds + ", millisecondes: " + millisec);

            return result;
        }

        Object result = method.invoke(origin, args);
        System.out.println("After method execution");

        return result;
    }

    public static <T> T create(
            Class<T> interfaceType,
            Object realObject){
        return (T) Proxy.newProxyInstance(
                realObject.getClass().getClassLoader(),
                new Class[]{interfaceType},
                new ProxyService(realObject));
    }
}
