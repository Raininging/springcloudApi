package com.founder.ark;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="DEMO-PROVIDER")
public interface DemoMbdApi {
	@RequestMapping(value="/test/hello")
	public String sayHello(@RequestParam(value="name") String name);
}
