package com.wudi.service;

import com.wudi.provider.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String echo(String string) {
        return "provider 服务被 " + string + " 调用";
    }
}
