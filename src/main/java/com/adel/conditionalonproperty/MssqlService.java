package com.adel.conditionalonproperty;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(name="db.service.select", havingValue = "mssql")
public class MssqlService implements DBService{
    @Override
    public String serviceName() {
        return "MSSQL_DB";
    }
}
