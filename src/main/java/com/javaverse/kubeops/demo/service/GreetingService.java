package com.javaverse.kubeops.demo.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GreetingService {

  public Mono<String> justDoIt() {
    return Mono.just("KubeOps");
  }
}
