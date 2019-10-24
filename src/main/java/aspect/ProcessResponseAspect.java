package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ProcessResponseAspect {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(* model.UserRepository.*(..))")
    public void after(JoinPoint joinPoint) {

        logger.info("after execution of {}", joinPoint);
    }

    @AfterReturning(value = "execution(* model.UserRepository.*(..))", returning = "result")
    public String processResponse(JoinPoint joinPoint, Object result) {

        // Process response from Respository here
        logger.info("{} returned with value {}", joinPoint, result);

        return result + ": Modified using AOP";
    }
}

