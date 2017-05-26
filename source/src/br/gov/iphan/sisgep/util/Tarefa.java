package br.gov.iphan.sisgep.util;

import java.util.Map;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;


public class Tarefa {
	public static void iniciarTarefa(Map<String, Object> params) throws SchedulerException {

		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		scheduler.start();
		
		scheduler.getContext().put("pessoaFisicaManager", params.get("pessoaFisicaManager"));
		scheduler.getContext().put("corRacaManager", params.get("corRacaManager"));
		scheduler.getContext().put("estadoCivilManager", params.get("estadoCivilManager"));
		scheduler.getContext().put("grupoSanguineoManager", params.get("grupoSanguineoManager"));
		scheduler.getContext().put("sincronizacaoManager", params.get("sincronizacaoManager"));
		scheduler.getContext().put("municipioManager", params.get("municipioManager"));
		scheduler.getContext().put("ufManager", params.get("ufManager"));
		scheduler.getContext().put("configManager", params.get("configManager"));
		scheduler.getContext().put("servidorManager", params.get("servidorManager"));
		scheduler.getContext().put("escolaridadePessoaManager", params.get("escolaridadePessoaManager"));
		scheduler.getContext().put("unidadeAdministrativaManager", params.get("unidadeAdministrativaManager"));
		scheduler.getContext().put("condicaoDependenteManager", params.get("condicaoDependenteManager"));
		scheduler.getContext().put("situacaoFuncionalManager", params.get("situacaoFuncionalManager"));
		scheduler.getContext().put("formaPassagemServManager", params.get("formaPassagemServManager"));
		scheduler.getContext().put("padraoCargoManager", params.get("padraoCargoManager"));
		scheduler.getContext().put("cargoFuncionarioManager", params.get("cargoFuncionarioManager"));
		scheduler.getContext().put("tipoCargoComissionadoManager", params.get("tipoCargoComissionadoManager"));
		scheduler.getContext().put("areaAtuacaoManager", params.get("areaAtuacaoManager"));
		scheduler.getContext().put("nivelCargoFuncionarioManager", params.get("nivelCargoFuncionarioManager"));
		scheduler.getContext().put("cboManager", params.get("cboManager"));
		scheduler.getContext().put("formacaoAcademicaManager", params.get("formacaoAcademicaManager"));
		scheduler.getContext().put("credentials", params.get("credentials"));
		scheduler.getContext().put("pessoaEmail", params.get("pessoaEmail"));
		scheduler.getContext().put("arquivos", params.get("arquivos"));

		// linha que se chama a CLASSE que tem a rotina de armazenamento.
		// Classe.class
		JobDetail job = JobBuilder.newJob((Class)params.get("job")).withIdentity("QuickQuartzJob").build();

		// Para formar uma express�o cron, esta � a ordem dos par�metros:
		// Segundos, Minutos, Horas, Dias do M�s, M�s, Dia da Semana e Ano,
		// o * representa todos, ou seja todos os dias do m�s e todos os meses,
		// o 0/10 significa �a cada dez segundos�
		// e o ? significa que n�o tem um valor espec�fico.
		// Para entender mais dessas express�es acesse:
		// http://www.quartz-scheduler.org/documentation/quartz-2.x/tutorials/crontrigger
		ScheduleBuilder<?> scheduleBuilder = CronScheduleBuilder.cronSchedule("0/10 * * * * ?");

		//Trigger trigger = TriggerBuilder.newTrigger().withIdentity("QuickQuartzTrigger").withSchedule(scheduleBuilder).startNow().build();
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("QuickQuartzTrigger").startNow().build();
		scheduler.scheduleJob(job, trigger);
	}
}