package com.calculator.controller;

import com.calculator.domain.CalculationDto;
import com.calculator.event.CalculateEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/calculator")
public class Calculator implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;


    @PostMapping(path = "add")
    public void add(@RequestBody CalculationDto calculation){
        calculation.setResult(calculation.getArgument1() + calculation.getArgument2());
        publisher.publishEvent(new CalculateEvent(
                this,
                calculation.getArgument1(),
                calculation.getArgument2(),
                calculation.getResult(),
                "+"));
    }

    @PostMapping(path = "sub")
    public void sub(@RequestBody CalculationDto calculation){
        calculation.setResult(calculation.getArgument1() - calculation.getArgument2());
        publisher.publishEvent(new CalculateEvent(
                this,
                calculation.getArgument1(),
                calculation.getArgument2(),
                calculation.getResult(),
                "-"));
    }

    @PostMapping(path = "mul")
    public void mul(@RequestBody CalculationDto calculation){
        calculation.setResult(calculation.getArgument1() * calculation.getArgument2());
        publisher.publishEvent(new CalculateEvent(
                this,
                calculation.getArgument1(),
                calculation.getArgument2(),
                calculation.getResult(),
                "*"));
    }

    @PostMapping(path = "div")
    public void div(@RequestBody CalculationDto calculation){
        calculation.setResult(calculation.getArgument1() / calculation.getArgument2());
        publisher.publishEvent(new CalculateEvent(
                this,
                calculation.getArgument1(),
                calculation.getArgument2(),
                calculation.getResult(),
                "/"));
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }
}
