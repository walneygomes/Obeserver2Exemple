package br.cesed.si.map.observer.exemplo1;

public class SeguroCIA extends SubjectObserver {

	@Override
	public void ativadoSensor() {
		for (Sensores s : sensor) {
			s.ativacaoDoAlarme();
			System.out.print(this.status);

		}

	}

	@Override
	public void addSensores(Sensores sen) {
		// TODO Auto-generated method stub
		sensor.add(sen);
		

	}

}
