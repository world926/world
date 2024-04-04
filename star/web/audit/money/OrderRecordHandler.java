package com.world.web.audit.money;


import com.world.web.audit.Audit;
import com.world.web.audit.AuditHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author SWUST
 */
@Component
@RequiredArgsConstructor
public class OrderRecordHandler extends AuditHandler {

    @Override
    public void doHandler(Audit audit) {
        System.out.println(audit);
    }


}