package hu.unideb.inf.SpringJavaFX.backend;

import hu.unideb.inf.SpringJavaFX.frontend.BackendManager;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringBackendManager implements BackendManager {
    private ConfigurableApplicationContext ctx;

    @Override
    public void start() {
        ctx = SpringApplication.run(SpringJavaFxApplication.class);
    }

    @Override
    public void stop() {
        ctx.close();
    }

    @Override
    public void print() {
        ((SpringJavaFxApplication)ctx
                .getBean(SpringJavaFxApplication.class)).print();
    }
}
