package br.gov.iphan.sisgep.util;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import br.gov.iphan.sisgep.action.SincronizacaoAction;

public class MyJob implements Job {
	public SincronizacaoAction sincronizacaoAction;
	
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("####### MyJob");   	
    	//chamar tarefa a ser executada
    }
}
