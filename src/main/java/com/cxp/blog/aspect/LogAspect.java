package com.cxp.blog.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    private final Logger logger= LoggerFactory.getLogger ( this.getClass () );
    @Pointcut("execution(* com.cxp.blog.Controller.*.*(..))")
    public void log(){

    }
    @Before ( "log()" )
    public void doBeform(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes ();
        HttpServletRequest request=attributes.getRequest ();
        String url = String.valueOf ( request.getRequestURL () );
        String ip = request.getRemoteAddr ();
        String classMethod=joinPoint.getSignature ().getDeclaringType ()+"."+joinPoint.getSignature ().getName ();
        Object [] args = joinPoint.getArgs ();
        ResultLog resultLog = new ResultLog ( url,ip,classMethod,args );
        logger.info ( "Result:{}",resultLog );
    }
    @After ( "log()" )
    public void doAfter(){
//        logger.info ( "--------doAfter--------" );
    }
    @AfterReturning(returning = "result",pointcut = "log()")
    public void doAfterReturn(Object result){
        logger.info ( "Result : {}"+result);
    }

    private class ResultLog{
        private String url;
        private String ip;
        private String classMethod;
        private Object[] args;


        private ResultLog (String url, String ip, String classMethod, Object[] args) {
            this.url = url;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        @Override
        public String toString ( ) {
            return "ResultLog{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString ( args ) +
                    '}';
        }
    }
}
