package hanghae99.plus2.team3.cicd

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class ProfilesConfiguration {

    @Profile("prod")
    @Bean
    fun prod(): SuccessCicdService {
        return SuccessCicdService()
    }

    @Profile("stag")
    @Bean
    fun stag(): SuccessCicdService {
        return SuccessCicdService()
    }

    @Profile("dev")
    @Bean
    fun dev(): SuccessCicdService {
        return SuccessCicdService()
    }

    @Profile("test")
    @Bean
    fun test(): SuccessCicdService {
        return SuccessCicdService()
    }

    @Profile("fail")
    @Bean
    fun fail(): FailCicdService {
        return FailCicdService()
    }
}
