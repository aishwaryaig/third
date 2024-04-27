package com.mutualFund.mf;

// public class Config {
    
// }


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webencyclop.core.mftool.MFTool;

@Configuration
public class Config {
    @Bean
    public MFTool mftool(){
        return new MFTool();
    }
}
