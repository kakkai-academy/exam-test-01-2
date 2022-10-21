package com.javaverse.kubeops.demo.controller;

import com.javaverse.kubeops.demo.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class GreetingController {

  final GreetingService greetingService;

  @GetMapping("/hello")
  Mono<String> hello() {
    return greetingService.justDoIt();
  }
}
