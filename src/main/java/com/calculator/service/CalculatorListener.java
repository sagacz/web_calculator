package com.calculator.service;

import com.calculator.event.CalculateEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class CalculatorListener implements ApplicationListener<CalculateEvent> {

    private Logger logger = LoggerFactory.getLogger(CalculatorListener.class);

    @Override
    public void onApplicationEvent(CalculateEvent event) {
        logger.info("operation: " + event.getOperation() + " called");
        logger.info(event.getArg1() + " " + event.getOperation() + " " + event.getArg2() +
                " = " + event.getResult());
    }
}
