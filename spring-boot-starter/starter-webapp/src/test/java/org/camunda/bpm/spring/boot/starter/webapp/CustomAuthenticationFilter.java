package org.camunda.bpm.spring.boot.starter.webapp;

import jakarta.servlet.http.HttpServletRequest;
import org.camunda.bpm.engine.filter.Filter;
import org.camunda.bpm.webapp.impl.security.auth.AuthenticationFilter;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationFilter extends AuthenticationFilter {

}
