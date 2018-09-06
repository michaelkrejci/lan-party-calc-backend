package org.mk.lanparty.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter(false) {

    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()?.anyRequest()?.permitAll()
    }
}