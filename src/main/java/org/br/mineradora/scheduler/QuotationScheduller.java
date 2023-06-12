package org.br.mineradora.scheduler;

import org.br.mineradora.service.QuotationService;

import com.oracle.svm.core.annotate.Inject;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class QuotationScheduller {
    
    @Inject 
    QuotationService quotationService;

    @Transactional
    @Scheduled(every = "35s", identity = "task-job")
    void sceduller() {
        quotationService.getCurrencyPrice();
    }
}
